package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the condition of a component.
  */
@js.native
trait ComponentCondition extends js.Object {
  /**
    * Condition error code for a component. For example, a health check error code.
    */
  var error: String = js.native
  /**
    * Message about the condition for a component. For example, information about a health check.
    */
  var message: String = js.native
  /**
    * Status of the condition for a component. Valid values for "Healthy": "True", "False", or "Unknown".
    */
  var status: String = js.native
  /**
    * Type of condition for a component. Valid value: "Healthy"
    */
  var `type`: String = js.native
}

object ComponentCondition {
  @scala.inline
  def apply(error: String, message: String, status: String, `type`: String): ComponentCondition = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCondition]
  }
  @scala.inline
  implicit class ComponentConditionOps[Self <: ComponentCondition] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

