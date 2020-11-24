package typings.pulumiKubernetes.inputMod.authorization.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
  */
@js.native
trait ResourceAttributes extends js.Object {
  
  /**
    * Group is the API Group of the Resource.  "*" means all.
    */
  var group: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  var resource: js.UndefOr[Input[String]] = js.native
  
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  var subresource: js.UndefOr[Input[String]] = js.native
  
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
    */
  var verb: js.UndefOr[Input[String]] = js.native
  
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  var version: js.UndefOr[Input[String]] = js.native
}
object ResourceAttributes {
  
  @scala.inline
  def apply(): ResourceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAttributes]
  }
  
  @scala.inline
  implicit class ResourceAttributesOps[Self <: ResourceAttributes] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: Input[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setResource(value: Input[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setSubresource(value: Input[String]): Self = this.set("subresource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubresource: Self = this.set("subresource", js.undefined)
    
    @scala.inline
    def setVerb(value: Input[String]): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
