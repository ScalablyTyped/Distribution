package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerCondition describes the state of a replication controller at a certain point.
  */
@js.native
trait ReplicationControllerCondition extends js.Object {
  /**
    * The last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String = js.native
  /**
    * A human readable message indicating details about the transition.
    */
  var message: String = js.native
  /**
    * The reason for the condition's last transition.
    */
  var reason: String = js.native
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String = js.native
  /**
    * Type of replication controller condition.
    */
  var `type`: String = js.native
}

object ReplicationControllerCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): ReplicationControllerCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerCondition]
  }
  @scala.inline
  implicit class ReplicationControllerConditionOps[Self <: ReplicationControllerCondition] (val x: Self) extends AnyVal {
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

