package typings.pulumiKubernetes.outputMod.authorization.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
  */
@js.native
trait ResourceRule extends js.Object {
  
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
    */
  var apiGroups: js.Array[String] = js.native
  
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
    */
  var resourceNames: js.Array[String] = js.native
  
  /**
    * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
    *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
    */
  var resources: js.Array[String] = js.native
  
  /**
    * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
    */
  var verbs: js.Array[String] = js.native
}
object ResourceRule {
  
  @scala.inline
  def apply(
    apiGroups: js.Array[String],
    resourceNames: js.Array[String],
    resources: js.Array[String],
    verbs: js.Array[String]
  ): ResourceRule = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRule]
  }
  
  @scala.inline
  implicit class ResourceRuleOps[Self <: ResourceRule] (val x: Self) extends AnyVal {
    
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
