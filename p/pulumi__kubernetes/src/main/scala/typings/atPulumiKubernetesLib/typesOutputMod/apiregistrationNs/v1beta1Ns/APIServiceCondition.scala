package typings
package atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceCondition describes the state of an APIService at a particular point
  */
trait APIServiceCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: java.lang.String
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: java.lang.String
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  val status: java.lang.String
  /**
    * Type is the type of the condition.
    */
  val `type`: java.lang.String
}

object APIServiceCondition {
  @scala.inline
  def apply(
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): APIServiceCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[APIServiceCondition]
  }
}

