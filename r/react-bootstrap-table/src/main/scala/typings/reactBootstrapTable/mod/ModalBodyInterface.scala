package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalBodyInterface[TRow /* <: js.Object */] extends js.Object {
  /**
    * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
    * new row data when the save button is clicked in the modal window.
    */
  def getFieldValue(): TRow = js.native
}

object ModalBodyInterface {
  @scala.inline
  def apply[/* <: js.Object */ TRow](getFieldValue: () => TRow): ModalBodyInterface[TRow] = {
    val __obj = js.Dynamic.literal(getFieldValue = js.Any.fromFunction0(getFieldValue))
    __obj.asInstanceOf[ModalBodyInterface[TRow]]
  }
  @scala.inline
  implicit class ModalBodyInterfaceOps[Self <: ModalBodyInterface[_], /* <: js.Object */ TRow] (val x: Self with ModalBodyInterface[TRow]) extends AnyVal {
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
    def setGetFieldValue(value: () => TRow): Self = this.set("getFieldValue", js.Any.fromFunction0(value))
  }
  
}

