package typings.atPulumiKubernetes.typesOutputMod.rbac.v1beta1

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
  val apiGroups: js.Array[String]
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path Since non-resource URLs are not
    * namespaced, this field is only applicable for ClusterRoles referenced from a
    * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
    * or non-resource URL paths (such as "/api"),  but not both.
    */
  val nonResourceURLs: js.Array[String]
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.
    */
  val resourceNames: js.Array[String]
  /**
    * Resources is a list of resources this rule applies to.  '*' represents all resources in the
    * specified apiGroups. '*&#8205;/foo' represents the subresource 'foo' for all resources in
    * the specified apiGroups.
    */
  val resources: js.Array[String]
  /**
    * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
    * contained in this rule.  VerbAll represents all kinds.
    */
  val verbs: js.Array[String]
}

object PolicyRule {
  @scala.inline
  def apply(
    apiGroups: js.Array[String],
    nonResourceURLs: js.Array[String],
    resourceNames: js.Array[String],
    resources: js.Array[String],
    verbs: js.Array[String]
  ): PolicyRule = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyRule]
  }
}

