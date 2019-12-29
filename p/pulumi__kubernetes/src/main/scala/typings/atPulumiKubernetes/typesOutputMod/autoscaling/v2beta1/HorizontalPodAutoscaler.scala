package typings.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.autoscalingSlashv2beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
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
  val apiVersion: autoscalingSlashv2beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler
  /**
    * metadata is the standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * spec is the specification for the behaviour of the autoscaler. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
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
    apiVersion: autoscalingSlashv2beta1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler,
    metadata: ObjectMeta,
    spec: HorizontalPodAutoscalerSpec,
    status: HorizontalPodAutoscalerStatus
  ): HorizontalPodAutoscaler = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HorizontalPodAutoscaler]
  }
}

