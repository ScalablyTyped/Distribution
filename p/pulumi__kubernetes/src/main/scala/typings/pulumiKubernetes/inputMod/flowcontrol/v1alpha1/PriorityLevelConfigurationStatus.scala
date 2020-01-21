package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
  */
trait PriorityLevelConfigurationStatus extends js.Object {
  /**
    * `conditions` is the current state of "request-priority".
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PriorityLevelConfigurationCondition]]]] = js.undefined
}

object PriorityLevelConfigurationStatus {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[PriorityLevelConfigurationCondition]]] = null): PriorityLevelConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationStatus]
  }
}

