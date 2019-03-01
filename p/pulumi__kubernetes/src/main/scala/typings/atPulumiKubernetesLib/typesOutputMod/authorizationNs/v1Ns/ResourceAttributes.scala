package typings
package atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns

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
  val group: java.lang.String
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
    * (empty) means all.
    */
  val name: java.lang.String
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no
    * distinction between no namespace and all namespaces "" (empty) is defaulted for
    * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
    * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  val namespace: java.lang.String
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  val resource: java.lang.String
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  val subresource: java.lang.String
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
    * proxy.  "*" means all.
    */
  val verb: java.lang.String
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  val version: java.lang.String
}

object ResourceAttributes {
  @scala.inline
  def apply(
    group: java.lang.String,
    name: java.lang.String,
    namespace: java.lang.String,
    resource: java.lang.String,
    subresource: java.lang.String,
    verb: java.lang.String,
    version: java.lang.String
  ): ResourceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("subresource")(subresource)
    __obj.updateDynamic("verb")(verb)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ResourceAttributes]
  }
}

