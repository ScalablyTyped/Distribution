package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler
  /**
    * metadata is the standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * spec is the specification for the behaviour of the autoscaler. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
    */
  val spec: HorizontalPodAutoscalerSpec
  /**
    * status is the current information about the autoscaler.
    */
  val status: HorizontalPodAutoscalerStatus
}

object HorizontalPodAutoscaler {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: HorizontalPodAutoscalerSpec,
    status: HorizontalPodAutoscalerStatus
  ): HorizontalPodAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("spec")(spec)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[HorizontalPodAutoscaler]
  }
}

