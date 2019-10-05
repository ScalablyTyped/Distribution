package typings.atPulumiKubernetes.typesOutputMod.core.v1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaList is a list of ResourceQuota items.
  */
trait ResourceQuotaList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
  /**
    * Items is a list of ResourceQuota objects. More info:
    * https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  val items: js.Array[ResourceQuota]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ResourceQuotaList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
}

object ResourceQuotaList {
  @scala.inline
  def apply(
    apiVersion: typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1,
    items: js.Array[ResourceQuota],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ResourceQuotaList,
    metadata: ListMeta
  ): ResourceQuotaList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[ResourceQuotaList]
  }
}

