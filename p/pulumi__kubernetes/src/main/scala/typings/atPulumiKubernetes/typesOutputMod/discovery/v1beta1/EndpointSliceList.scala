package typings.atPulumiKubernetes.typesOutputMod.discovery.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointSliceList represents a list of endpoint slices
  */
trait EndpointSliceList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: discoveryDotk8sDotioSlashv1beta1
  /**
    * List of endpoint slices
    */
  val items: js.Array[EndpointSlice]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.EndpointSliceList
  /**
    * Standard list metadata.
    */
  val metadata: ListMeta
}

object EndpointSliceList {
  @scala.inline
  def apply(
    apiVersion: discoveryDotk8sDotioSlashv1beta1,
    items: js.Array[EndpointSlice],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.EndpointSliceList,
    metadata: ListMeta
  ): EndpointSliceList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointSliceList]
  }
}

