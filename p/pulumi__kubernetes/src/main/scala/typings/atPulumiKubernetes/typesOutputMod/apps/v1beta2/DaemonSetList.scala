package typings.atPulumiKubernetes.typesOutputMod.apps.v1beta2

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta2`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetList is a collection of daemon sets.
  */
trait DaemonSetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `apps/v1beta2`
  /**
    * A list of daemon sets.
    */
  val items: js.Array[DaemonSet]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSetList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object DaemonSetList {
  @scala.inline
  def apply(
    apiVersion: `apps/v1beta2`,
    items: js.Array[DaemonSet],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSetList,
    metadata: ListMeta
  ): DaemonSetList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[DaemonSetList]
  }
}

