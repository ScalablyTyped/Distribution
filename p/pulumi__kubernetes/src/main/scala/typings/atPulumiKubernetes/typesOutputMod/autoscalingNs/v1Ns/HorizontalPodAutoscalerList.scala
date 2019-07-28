package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * list of horizontal pod autoscaler objects.
  */
trait HorizontalPodAutoscalerList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `autoscaling/v1`
  /**
    * list of horizontal pod autoscaler objects.
    */
  val items: js.Array[HorizontalPodAutoscaler]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscalerList
  /**
    * Standard list metadata.
    */
  val metadata: ListMeta
}

object HorizontalPodAutoscalerList {
  @scala.inline
  def apply(
    apiVersion: `autoscaling/v1`,
    items: js.Array[HorizontalPodAutoscaler],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscalerList,
    metadata: ListMeta
  ): HorizontalPodAutoscalerList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[HorizontalPodAutoscalerList]
  }
}

