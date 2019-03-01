package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

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
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`
  val items: js.Array[PodDisruptionBudget]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudgetList
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object PodDisruptionBudgetList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`,
    items: js.Array[PodDisruptionBudget],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudgetList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): PodDisruptionBudgetList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[PodDisruptionBudgetList]
  }
}

