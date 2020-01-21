package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
trait ResourceQuotaStatus extends js.Object {
  /**
    * Hard is the set of enforced hard limits for each named resource. More info:
    * https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  var used: js.UndefOr[Input[js.Object]] = js.undefined
}

object ResourceQuotaStatus {
  @scala.inline
  def apply(hard: Input[js.Object] = null, used: Input[js.Object] = null): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal()
    if (hard != null) __obj.updateDynamic("hard")(hard.asInstanceOf[js.Any])
    if (used != null) __obj.updateDynamic("used")(used.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
}

