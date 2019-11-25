package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val conditionType: String
}

object PodReadinessGate {
  @scala.inline
  def apply(conditionType: String): PodReadinessGate = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodReadinessGate]
  }
}

