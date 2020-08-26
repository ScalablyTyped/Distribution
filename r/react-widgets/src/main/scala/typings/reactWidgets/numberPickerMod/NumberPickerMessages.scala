package typings.reactWidgets.numberPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberPickerMessages extends js.Object {
  /**
    * Number picker spinner down button text for screen readers.
    * @default "decrement value"
    */
  var decrement: js.UndefOr[String] = js.native
  /**
    * Number picker spinner up button text for screen readers.
    * @default "increment value"
    */
  var increment: js.UndefOr[String] = js.native
}

object NumberPickerMessages {
  @scala.inline
  def apply(): NumberPickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberPickerMessages]
  }
  @scala.inline
  implicit class NumberPickerMessagesOps[Self <: NumberPickerMessages] (val x: Self) extends AnyVal {
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
    def setDecrement(value: String): Self = this.set("decrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecrement: Self = this.set("decrement", js.undefined)
    @scala.inline
    def setIncrement(value: String): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
  }
  
}

