package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the condition of a component.
  */
trait ComponentCondition extends js.Object {
  /**
    * Condition error code for a component. For example, a health check error code.
    */
  val error: String
  /**
    * Message about the condition for a component. For example, information about a health check.
    */
  val message: String
  /**
    * Status of the condition for a component. Valid values for "Healthy": "True", "False", or
    * "Unknown".
    */
  val status: String
  /**
    * Type of condition for a component. Valid value: "Healthy"
    */
  val `type`: String
}

object ComponentCondition {
  @scala.inline
  def apply(error: String, message: String, status: String, `type`: String): ComponentCondition = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCondition]
  }
}

