package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodReadinessGate contains the reference to a pod condition
  */
trait PodReadinessGate extends js.Object {
  /**
    * ConditionType refers to a condition in the pod's condition list with matching type.
    */
  var conditionType: Input[String]
}

object PodReadinessGate {
  @scala.inline
  def apply(conditionType: Input[String]): PodReadinessGate = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodReadinessGate]
  }
}

