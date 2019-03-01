package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: java.lang.String
  /**
    * groupVersion is the group and version this APIResourceList is for.
    */
  val groupVersion: java.lang.String
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: java.lang.String
  /**
    * resources contains the name of the resources and if they are namespaced.
    */
  val resources: js.Array[APIResource]
}

object APIResourceList {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    groupVersion: java.lang.String,
    kind: java.lang.String,
    resources: js.Array[APIResource]
  ): APIResourceList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("groupVersion")(groupVersion)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[APIResourceList]
  }
}

