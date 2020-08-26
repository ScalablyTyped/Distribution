package typings.pulumiKubernetes.outputMod.rbac.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
  */
@js.native
trait PolicyRule extends js.Object {
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
    */
  var apiGroups: js.Array[String] = js.native
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
    */
  var nonResourceURLs: js.Array[String] = js.native
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
    */
  var resourceNames: js.Array[String] = js.native
  /**
    * Resources is a list of resources this rule applies to.  '*' represents all resources in the specified apiGroups. '*&#47;foo' represents the subresource 'foo' for all resources in the specified apiGroups.
    */
  var resources: js.Array[String] = js.native
  /**
    * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
    */
  var verbs: js.Array[String] = js.native
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
  @scala.inline
  implicit class PolicyRuleOps[Self <: PolicyRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiGroupsVarargs(value: String*): Self = this.set("apiGroups", js.Array(value :_*))
    @scala.inline
    def setApiGroups(value: js.Array[String]): Self = this.set("apiGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonResourceURLsVarargs(value: String*): Self = this.set("nonResourceURLs", js.Array(value :_*))
    @scala.inline
    def setNonResourceURLs(value: js.Array[String]): Self = this.set("nonResourceURLs", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbsVarargs(value: String*): Self = this.set("verbs", js.Array(value :_*))
    @scala.inline
    def setVerbs(value: js.Array[String]): Self = this.set("verbs", value.asInstanceOf[js.Any])
  }
  
}

