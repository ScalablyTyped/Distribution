package typings.pulumiKubernetes.outputMod.policy.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: policySlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget
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
    apiVersion: policySlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget,
    metadata: ObjectMeta,
    spec: PodDisruptionBudgetSpec,
    status: PodDisruptionBudgetStatus
  ): PodDisruptionBudget = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodDisruptionBudget]
  }
}

