package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaCondition describes conditions for a FlowSchema.
  */
trait FlowSchemaCondition extends js.Object {
  /**
    * `lastTransitionTime` is the last time the condition transitioned from one status to
    * another.
    */
  val lastTransitionTime: String
  /**
    * `message` is a human-readable message indicating details about last transition.
    */
  val message: String
  /**
    * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: String
  /**
    * `status` is the status of the condition. Can be True, False, Unknown. Required.
    */
  val status: String
  /**
    * `type` is the type of the condition. Required.
    */
  val `type`: String
}

object FlowSchemaCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): FlowSchemaCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaCondition]
  }
}

