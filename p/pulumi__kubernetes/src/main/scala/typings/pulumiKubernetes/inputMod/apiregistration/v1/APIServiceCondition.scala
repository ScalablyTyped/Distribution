package typings.pulumiKubernetes.inputMod.apiregistration.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceCondition describes the state of an APIService at a particular point
  */
@js.native
trait APIServiceCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.native
  /**
    * Human-readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  var status: Input[String] = js.native
  /**
    * Type is the type of the condition.
    */
  var `type`: Input[String] = js.native
}

object APIServiceCondition {
  @scala.inline
  def apply(status: Input[String], `type`: Input[String]): APIServiceCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIServiceCondition]
  }
  @scala.inline
  implicit class APIServiceConditionOps[Self <: APIServiceCondition] (val x: Self) extends AnyVal {
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
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastTransitionTime(value: Input[String]): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastTransitionTime: Self = this.set("lastTransitionTime", js.undefined)
    @scala.inline
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

