package typings.atPulumiKubernetes.typesOutputMod.storage.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSIDriverList is a collection of CSIDriver objects.
  */
trait CSIDriverList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `storageDOTk8sDOTio/v1beta1`
  /**
    * items is the list of CSIDriver
    */
  val items: js.Array[CSIDriver]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSIDriverList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object CSIDriverList {
  @scala.inline
  def apply(
    apiVersion: `storageDOTk8sDOTio/v1beta1`,
    items: js.Array[CSIDriver],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSIDriverList,
    metadata: ListMeta
  ): CSIDriverList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[CSIDriverList]
  }
}

