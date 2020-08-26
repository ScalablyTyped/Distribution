package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
  */
@js.native
trait StatusCause extends js.Object {
  /**
    * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
    *
    * Examples:
    *   "name" - the field "name" on the current resource
    *   "items[0].name" - the field "name" on the first array entry in "items"
    */
  var field: js.UndefOr[Input[String]] = js.native
  /**
    * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * A machine-readable description of the cause of the error. If this value is empty there is no information available.
    */
  var reason: js.UndefOr[Input[String]] = js.native
}

object StatusCause {
  @scala.inline
  def apply(): StatusCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCause]
  }
  @scala.inline
  implicit class StatusCauseOps[Self <: StatusCause] (val x: Self) extends AnyVal {
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
    def setField(value: Input[String]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
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

