package typings.atPulumiKubernetes.typesInputMod.authorization.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var group: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
    * (empty) means all.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no
    * distinction between no namespace and all namespaces "" (empty) is defaulted for
    * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
    * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  var resource: js.UndefOr[Input[String]] = js.undefined
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  var subresource: js.UndefOr[Input[String]] = js.undefined
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
    * proxy.  "*" means all.
    */
  var verb: js.UndefOr[Input[String]] = js.undefined
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  var version: js.UndefOr[Input[String]] = js.undefined
}

object ResourceAttributes {
  @scala.inline
  def apply(
    group: Input[String] = null,
    name: Input[String] = null,
    namespace: Input[String] = null,
    resource: Input[String] = null,
    subresource: Input[String] = null,
    verb: Input[String] = null,
    version: Input[String] = null
  ): ResourceAttributes = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (subresource != null) __obj.updateDynamic("subresource")(subresource.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttributes]
  }
}

