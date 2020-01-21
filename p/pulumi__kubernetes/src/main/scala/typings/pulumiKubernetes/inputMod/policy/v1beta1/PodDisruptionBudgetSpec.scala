package typings.pulumiKubernetes.inputMod.policy.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
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
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be
    * available after the eviction, i.e. even in the absence of the evicted pod.  So for example
    * you can prevent all voluntary evictions by specifying "100%".
    */
  var minAvailable: js.UndefOr[Input[Double | String]] = js.undefined
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
}

object PodDisruptionBudgetSpec {
  @scala.inline
  def apply(
    maxUnavailable: Input[Double | String] = null,
    minAvailable: Input[Double | String] = null,
    selector: Input[LabelSelector] = null
  ): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal()
    if (maxUnavailable != null) __obj.updateDynamic("maxUnavailable")(maxUnavailable.asInstanceOf[js.Any])
    if (minAvailable != null) __obj.updateDynamic("minAvailable")(minAvailable.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
}

