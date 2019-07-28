package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * configuration of a horizontal pod autoscaler.
  */
trait HorizontalPodAutoscaler extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `autoscaling/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler
  /**
    * Standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * behaviour of autoscaler. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
    */
  val spec: HorizontalPodAutoscalerSpec
  /**
    * current information about the autoscaler.
    */
  val status: HorizontalPodAutoscalerStatus
}

object HorizontalPodAutoscaler {
  @scala.inline
  def apply(
    apiVersion: `autoscaling/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler,
    metadata: ObjectMeta,
    spec: HorizontalPodAutoscalerSpec,
    status: HorizontalPodAutoscalerStatus
  ): HorizontalPodAutoscaler = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[HorizontalPodAutoscaler]
  }
}

