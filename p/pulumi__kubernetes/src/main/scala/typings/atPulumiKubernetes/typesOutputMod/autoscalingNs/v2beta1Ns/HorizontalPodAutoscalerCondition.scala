package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a
  * certain point.
  */
trait HorizontalPodAutoscalerCondition extends js.Object {
  /**
    * lastTransitionTime is the last time the condition transitioned from one status to another
    */
  val lastTransitionTime: String
  /**
    * message is a human-readable explanation containing details about the transition
    */
  val message: String
  /**
    * reason is the reason for the condition's last transition.
    */
  val reason: String
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  val status: String
  /**
    * type describes the current condition
    */
  val `type`: String
}

object HorizontalPodAutoscalerCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): HorizontalPodAutoscalerCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HorizontalPodAutoscalerCondition]
  }
}

