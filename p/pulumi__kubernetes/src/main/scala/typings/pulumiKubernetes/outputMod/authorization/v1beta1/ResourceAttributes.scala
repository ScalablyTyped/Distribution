package typings.pulumiKubernetes.outputMod.authorization.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
  */
@js.native
trait ResourceAttributes extends js.Object {
  /**
    * Group is the API Group of the Resource.  "*" means all.
    */
  var group: String = js.native
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
    */
  var name: String = js.native
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  var namespace: String = js.native
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  var resource: String = js.native
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  var subresource: String = js.native
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
    */
  var verb: String = js.native
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  var version: String = js.native
}

object ResourceAttributes {
  @scala.inline
  def apply(
    group: String,
    name: String,
    namespace: String,
    resource: String,
    subresource: String,
    verb: String,
    version: String
  ): ResourceAttributes = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], subresource = subresource.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubresource(value: String): Self = this.set("subresource", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

