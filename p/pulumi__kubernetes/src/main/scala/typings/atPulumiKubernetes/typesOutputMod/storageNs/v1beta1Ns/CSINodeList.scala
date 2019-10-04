package typings.atPulumiKubernetes.typesOutputMod.storageNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSINodeList is a collection of CSINode objects.
  */
trait CSINodeList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `storageDOTk8sDOTio/v1beta1`
  /**
    * items is the list of CSINode
    */
  val items: js.Array[CSINode]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSINodeList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object CSINodeList {
  @scala.inline
  def apply(
    apiVersion: `storageDOTk8sDOTio/v1beta1`,
    items: js.Array[CSINode],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSINodeList,
    metadata: ListMeta
  ): CSINodeList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[CSINodeList]
  }
}

