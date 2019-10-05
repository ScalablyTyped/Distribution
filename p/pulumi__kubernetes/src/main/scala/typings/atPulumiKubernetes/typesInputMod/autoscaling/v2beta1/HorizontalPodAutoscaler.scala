package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v2beta1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which
  * automatically manages the replica count of any resource implementing the scale subresource
  * based on the metrics specified.
  */
trait HorizontalPodAutoscaler extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`autoscaling/v2beta1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler]
  ] = js.undefined
  /**
    * metadata is the standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * spec is the specification for the behaviour of the autoscaler. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
    */
  var spec: js.UndefOr[Input[HorizontalPodAutoscalerSpec]] = js.undefined
}

object HorizontalPodAutoscaler {
  @scala.inline
  def apply(
    apiVersion: Input[`autoscaling/v2beta1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[HorizontalPodAutoscalerSpec] = null
  ): HorizontalPodAutoscaler = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscaler]
  }
}

