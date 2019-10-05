package typings.atPulumiKubernetes.typesOutputMod.coordination.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`coordinationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LeaseList is a list of Lease objects.
  */
trait LeaseList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `coordinationDOTk8sDOTio/v1`
  /**
    * Items is a list of schema objects.
    */
  val items: js.Array[Lease]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.LeaseList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object LeaseList {
  @scala.inline
  def apply(
    apiVersion: `coordinationDOTk8sDOTio/v1`,
    items: js.Array[Lease],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.LeaseList,
    metadata: ListMeta
  ): LeaseList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[LeaseList]
  }
}

