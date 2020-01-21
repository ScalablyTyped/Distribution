package typings.pulumiKubernetes.outputMod.authorization.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceAttributes includes the authorization attributes available for resource requests to
  * the Authorizer interface
  */
trait ResourceAttributes extends js.Object {
  /**
    * Group is the API Group of the Resource.  "*" means all.
    */
  val group: String
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
    * (empty) means all.
    */
  val name: String
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no
    * distinction between no namespace and all namespaces "" (empty) is defaulted for
    * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
    * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  val namespace: String
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  val resource: String
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  val subresource: String
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
    * proxy.  "*" means all.
    */
  val verb: String
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  val version: String
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
}

