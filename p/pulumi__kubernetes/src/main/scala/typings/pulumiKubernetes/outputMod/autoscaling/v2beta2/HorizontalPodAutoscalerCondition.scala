package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
  */
@js.native
trait HorizontalPodAutoscalerCondition extends js.Object {
  /**
    * lastTransitionTime is the last time the condition transitioned from one status to another
    */
  var lastTransitionTime: String = js.native
  /**
    * message is a human-readable explanation containing details about the transition
    */
  var message: String = js.native
  /**
    * reason is the reason for the condition's last transition.
    */
  var reason: String = js.native
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  var status: String = js.native
  /**
    * type describes the current condition
    */
  var `type`: String = js.native
}

object HorizontalPodAutoscalerCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): HorizontalPodAutoscalerCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerCondition]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalerConditionOps[Self <: HorizontalPodAutoscalerCondition] (val x: Self) extends AnyVal {
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
    def setLastTransitionTime(value: String): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

