package typings.atPulumiKubernetes.typesOutputMod.policyNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`policy/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
  */
trait PodDisruptionBudgetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `policy/v1beta1`
  val items: js.Array[PodDisruptionBudget]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodDisruptionBudgetList
  val metadata: ListMeta
}

object PodDisruptionBudgetList {
  @scala.inline
  def apply(
    apiVersion: `policy/v1beta1`,
    items: js.Array[PodDisruptionBudget],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodDisruptionBudgetList,
    metadata: ListMeta
  ): PodDisruptionBudgetList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[PodDisruptionBudgetList]
  }
}

