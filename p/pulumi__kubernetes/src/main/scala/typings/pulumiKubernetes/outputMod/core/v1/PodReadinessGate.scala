package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodReadinessGate contains the reference to a pod condition
  */
@js.native
trait PodReadinessGate extends js.Object {
  /**
    * ConditionType refers to a condition in the pod's condition list with matching type.
    */
  var conditionType: String = js.native
}

object PodReadinessGate {
  @scala.inline
  def apply(conditionType: String): PodReadinessGate = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodReadinessGate]
  }
  @scala.inline
  implicit class PodReadinessGateOps[Self <: PodReadinessGate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConditionType(value: String): Self = this.set("conditionType", value.asInstanceOf[js.Any])
  }
  
}

