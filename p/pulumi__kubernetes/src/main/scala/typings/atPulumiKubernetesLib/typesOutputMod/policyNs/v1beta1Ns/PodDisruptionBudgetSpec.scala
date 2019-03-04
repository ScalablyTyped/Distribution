package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
  */
trait PodDisruptionBudgetSpec extends js.Object {
  /**
    * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are
    * unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one
    * can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting
    * with "minAvailable".
    */
  val maxUnavailable: scala.Double | java.lang.String
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be
    * available after the eviction, i.e. even in the absence of the evicted pod.  So for example
    * you can prevent all voluntary evictions by specifying "100%".
    */
  val minAvailable: scala.Double | java.lang.String
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
}

object PodDisruptionBudgetSpec {
  @scala.inline
  def apply(
    maxUnavailable: scala.Double | java.lang.String,
    minAvailable: scala.Double | java.lang.String,
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  ): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal(maxUnavailable = maxUnavailable.asInstanceOf[js.Any], minAvailable = minAvailable.asInstanceOf[js.Any], selector = selector)
  
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
}

