package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetCondition describes the state of a statefulset at a certain point.
  */
trait StatefulSetCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: java.lang.String
  /**
    * A human readable message indicating details about the transition.
    */
  val message: java.lang.String
  /**
    * The reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: java.lang.String
  /**
    * Type of statefulset condition.
    */
  val `type`: java.lang.String
}

object StatefulSetCondition {
  @scala.inline
  def apply(
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): StatefulSetCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StatefulSetCondition]
  }
}

