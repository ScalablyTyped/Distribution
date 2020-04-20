package typings.pulumiKubernetes.outputMod.storage.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
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
  val apiVersion: storageDotk8sDotioSlashv1
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
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriverList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object CSIDriverList {
  @scala.inline
  def apply(
    apiVersion: storageDotk8sDotioSlashv1,
    items: js.Array[CSIDriver],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriverList,
    metadata: ListMeta
  ): CSIDriverList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIDriverList]
  }
}

