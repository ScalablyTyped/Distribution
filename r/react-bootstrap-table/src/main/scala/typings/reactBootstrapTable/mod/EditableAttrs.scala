package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditableAttrs extends js.Object {
  /**
    * Callback for on cell blur.
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for onKeyDown.
    */
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Placeholder text to use for the cell editor field.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Function to pass a reference to the input editor field.
    */
  var ref: js.UndefOr[js.Function1[/* ref */ js.Any, _]] = js.native
}

object EditableAttrs {
  @scala.inline
  def apply(): EditableAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableAttrs]
  }
  @scala.inline
  implicit class EditableAttrsOps[Self <: EditableAttrs] (val x: Self) extends AnyVal {
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
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnKeyDown(value: () => Unit): Self = this.set("onKeyDown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRef(value: /* ref */ js.Any => _): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
  
}

