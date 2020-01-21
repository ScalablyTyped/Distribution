package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

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
  val conditions: js.Array[PriorityLevelConfigurationCondition]
}

object PriorityLevelConfigurationStatus {
  @scala.inline
  def apply(conditions: js.Array[PriorityLevelConfigurationCondition]): PriorityLevelConfigurationStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PriorityLevelConfigurationStatus]
  }
}

