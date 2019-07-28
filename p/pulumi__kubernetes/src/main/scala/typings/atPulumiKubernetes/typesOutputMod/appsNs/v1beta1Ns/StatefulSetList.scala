package typings.atPulumiKubernetes.typesOutputMod.appsNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetList is a collection of StatefulSets.
  */
trait StatefulSetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `apps/v1beta1`
  val items: js.Array[StatefulSet]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList
  val metadata: ListMeta
}

object StatefulSetList {
  @scala.inline
  def apply(
    apiVersion: `apps/v1beta1`,
    items: js.Array[StatefulSet],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList,
    metadata: ListMeta
  ): StatefulSetList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[StatefulSetList]
  }
}

