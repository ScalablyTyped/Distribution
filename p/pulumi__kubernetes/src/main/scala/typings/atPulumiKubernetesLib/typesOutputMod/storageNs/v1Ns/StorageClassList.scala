package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageClassList is a collection of storage classes.
  */
trait StorageClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`
  /**
    * Items is the list of StorageClasses
    */
  val items: js.Array[StorageClass]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object StorageClassList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`,
    items: js.Array[StorageClass],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClassList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): StorageClassList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[StorageClassList]
  }
}

