package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
  */
trait HorizontalPodAutoscalerList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[autoscalingSlashv2beta1]] = js.undefined
  /**
    * items is the list of horizontal pod autoscaler objects.
    */
  var items: Input[js.Array[Input[HorizontalPodAutoscaler]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList]
  ] = js.undefined
  /**
    * metadata is the standard list metadata.
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object HorizontalPodAutoscalerList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[HorizontalPodAutoscaler]]],
    apiVersion: Input[autoscalingSlashv2beta1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList] = null,
    metadata: Input[ListMeta] = null
  ): HorizontalPodAutoscalerList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerList]
  }
}

