package typings
package atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns

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
  val apiGroups: js.Array[java.lang.String]
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path This name is intentionally different
    * than the internal type so that the DefaultConvert works nicely and because the ordering may
    * be different. Since non-resource URLs are not namespaced, this field is only applicable for
    * ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources
    * (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
    */
  val nonResourceURLs: js.Array[java.lang.String]
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.
    */
  val resourceNames: js.Array[java.lang.String]
  /**
    * Resources is a list of resources this rule applies to.  ResourceAll represents all
    * resources.
    */
  val resources: js.Array[java.lang.String]
  /**
    * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
    * contained in this rule.  VerbAll represents all kinds.
    */
  val verbs: js.Array[java.lang.String]
}

object PolicyRule {
  @scala.inline
  def apply(
    apiGroups: js.Array[java.lang.String],
    nonResourceURLs: js.Array[java.lang.String],
    resourceNames: js.Array[java.lang.String],
    resources: js.Array[java.lang.String],
    verbs: js.Array[java.lang.String]
  ): PolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiGroups")(apiGroups)
    __obj.updateDynamic("nonResourceURLs")(nonResourceURLs)
    __obj.updateDynamic("resourceNames")(resourceNames)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("verbs")(verbs)
    __obj.asInstanceOf[PolicyRule]
  }
}

