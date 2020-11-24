package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
  */
@js.native
trait HorizontalPodAutoscalerCondition extends js.Object {
  
  /**
    * lastTransitionTime is the last time the condition transitioned from one status to another
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * message is a human-readable explanation containing details about the transition
    */
  var message: js.UndefOr[Input[String]] = js.native
  
  /**
    * reason is the reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  var status: Input[String] = js.native
  
  /**
    * type describes the current condition
    */
  var `type`: Input[String] = js.native
}
object HorizontalPodAutoscalerCondition {
  
  @scala.inline
  def apply(status: Input[String], `type`: Input[String]): HorizontalPodAutoscalerCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
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
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTransitionTime(value: Input[String]): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTransitionTime: Self = this.set("lastTransitionTime", js.undefined)
    
    @scala.inline
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
