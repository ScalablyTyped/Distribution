package typings.pulumiKubernetes.inputMod.rbac.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PolicyRule holds information that describes a policy rule, but does not contain information
  * about who the rule applies to or which namespace the rule applies to.
  */
trait PolicyRule extends js.Object {
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
    * are specified, any action requested against one of the enumerated resources in any API
    * group will be allowed.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path Since non-resource URLs are not
    * namespaced, this field is only applicable for ClusterRoles referenced from a
    * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
    * or non-resource URL paths (such as "/api"),  but not both.
    */
  var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.
    */
  var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Resources is a list of resources this rule applies to.  '*' represents all resources in the
    * specified apiGroups. '*&#8205;/foo' represents the subresource 'foo' for all resources in
    * the specified apiGroups.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
    * contained in this rule.  VerbAll represents all kinds.
    */
  var verbs: Input[js.Array[Input[String]]]
}

object PolicyRule {
  @scala.inline
  def apply(
    verbs: Input[js.Array[Input[String]]],
    apiGroups: Input[js.Array[Input[String]]] = null,
    nonResourceURLs: Input[js.Array[Input[String]]] = null,
    resourceNames: Input[js.Array[Input[String]]] = null,
    resources: Input[js.Array[Input[String]]] = null
  ): PolicyRule = {
    val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
    if (apiGroups != null) __obj.updateDynamic("apiGroups")(apiGroups.asInstanceOf[js.Any])
    if (nonResourceURLs != null) __obj.updateDynamic("nonResourceURLs")(nonResourceURLs.asInstanceOf[js.Any])
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
}

