package typings.atPulumiKubernetes.typesOutputMod.apps.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentCondition describes the state of a deployment at a certain point.
  */
trait DeploymentCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String
  /**
    * The last time this condition was updated.
    */
  val lastUpdateTime: String
  /**
    * A human readable message indicating details about the transition.
    */
  val message: String
  /**
    * The reason for the condition's last transition.
    */
  val reason: String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: String
  /**
    * Type of deployment condition.
    */
  val `type`: String
}

object DeploymentCondition {
  @scala.inline
  def apply(
    lastTransitionTime: String,
    lastUpdateTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): DeploymentCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, lastUpdateTime = lastUpdateTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentCondition]
  }
}

