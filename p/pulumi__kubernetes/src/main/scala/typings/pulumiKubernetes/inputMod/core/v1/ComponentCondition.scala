package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var error: js.UndefOr[Input[String]] = js.undefined
  /**
    * Message about the condition for a component. For example, information about a health check.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * Status of the condition for a component. Valid values for "Healthy": "True", "False", or
    * "Unknown".
    */
  var status: Input[String]
  /**
    * Type of condition for a component. Valid value: "Healthy"
    */
  var `type`: Input[String]
}

object ComponentCondition {
  @scala.inline
  def apply(
    status: Input[String],
    `type`: Input[String],
    error: Input[String] = null,
    message: Input[String] = null
  ): ComponentCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCondition]
  }
}

