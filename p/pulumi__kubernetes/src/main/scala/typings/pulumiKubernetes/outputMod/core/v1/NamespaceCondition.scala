package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceCondition contains details about state of namespace.
  */
@js.native
trait NamespaceCondition extends js.Object {
  var lastTransitionTime: String = js.native
  var message: String = js.native
  var reason: String = js.native
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String = js.native
  /**
    * Type of namespace controller condition.
    */
  var `type`: String = js.native
}

object NamespaceCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): NamespaceCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceCondition]
  }
  @scala.inline
  implicit class NamespaceConditionOps[Self <: NamespaceCondition] (val x: Self) extends AnyVal {
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
    def setLastTransitionTime(value: String): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

