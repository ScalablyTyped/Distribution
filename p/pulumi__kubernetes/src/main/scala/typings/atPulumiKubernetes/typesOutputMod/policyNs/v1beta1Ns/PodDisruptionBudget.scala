package typings.atPulumiKubernetes.typesOutputMod.policyNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`policy/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudget is an object to define the max disruption that can be caused to a
  * collection of pods
  */
trait PodDisruptionBudget extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `policy/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodDisruptionBudget
  val metadata: ObjectMeta
  /**
    * Specification of the desired behavior of the PodDisruptionBudget.
    */
  val spec: PodDisruptionBudgetSpec
  /**
    * Most recently observed status of the PodDisruptionBudget.
    */
  val status: PodDisruptionBudgetStatus
}

object PodDisruptionBudget {
  @scala.inline
  def apply(
    apiVersion: `policy/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodDisruptionBudget,
    metadata: ObjectMeta,
    spec: PodDisruptionBudgetSpec,
    status: PodDisruptionBudgetStatus
  ): PodDisruptionBudget = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[PodDisruptionBudget]
  }
}

