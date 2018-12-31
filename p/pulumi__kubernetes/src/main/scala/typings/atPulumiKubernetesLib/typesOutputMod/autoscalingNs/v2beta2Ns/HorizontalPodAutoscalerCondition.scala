package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

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
  val lastTransitionTime: java.lang.String
  /**
    * message is a human-readable explanation containing details about the transition
    */
  val message: java.lang.String
  /**
    * reason is the reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  val status: java.lang.String
  /**
    * type describes the current condition
    */
  val `type`: java.lang.String
}

