package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIResourceList is a list of APIResource, it is used to expose the name of the resources
  * supported in a specific group and version, and if the resource is namespaced.
  */
trait APIResourceList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * groupVersion is the group and version this APIResourceList is for.
    */
  var groupVersion: Input[String]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * resources contains the name of the resources and if they are namespaced.
    */
  var resources: Input[js.Array[Input[APIResource]]]
}

object APIResourceList {
  @scala.inline
  def apply(
    groupVersion: Input[String],
    resources: Input[js.Array[Input[APIResource]]],
    apiVersion: Input[String] = null,
    kind: Input[String] = null
  ): APIResourceList = {
    val __obj = js.Dynamic.literal(groupVersion = groupVersion.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResourceList]
  }
}

