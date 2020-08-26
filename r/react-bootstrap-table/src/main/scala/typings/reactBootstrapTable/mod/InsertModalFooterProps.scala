package typings.reactBootstrapTable.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertModalFooterProps extends js.Object {
  /**
    * Callback function to call prior to closing the Insert Modal window.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.native
  /**
    * Callback function to be called prior to saving the new row.
    */
  var beforeSave: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.native
  /**
    * Header class name.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Custom class name for the close button.
    */
  var closeBtnClass: js.UndefOr[String] = js.native
  /**
    * Bootstrap css class name for the close button, example: 'btn-warning'
    */
  var closeBtnContextual: js.UndefOr[String] = js.native
  /**
    * Text to display on the Close button
    */
  var closeBtnText: js.UndefOr[String] = js.native
  /**
    * Callback function to call to close the Insert Modal window.
    */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.native
  /**
    * Callback function to be called to save the new row.
    */
  var onSave: js.UndefOr[js.Function1[/* save */ js.Function0[Unit], Unit]] = js.native
  /**
    * Custom class name for the save button.
    */
  var saveBtnClass: js.UndefOr[String] = js.native
  /**
    * Bootstrap css class name for the save button, example: 'btn-success'
    */
  var saveBtnContextual: js.UndefOr[String] = js.native
  /**
    * Text to display on the Save button
    */
  var saveBtnText: js.UndefOr[String] = js.native
}

object InsertModalFooterProps {
  @scala.inline
  def apply(): InsertModalFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalFooterProps]
  }
  @scala.inline
  implicit class InsertModalFooterPropsOps[Self <: InsertModalFooterProps] (val x: Self) extends AnyVal {
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
    def setBeforeClose(value: /* e */ SyntheticEvent[_, Event] => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setBeforeSave(value: /* e */ SyntheticEvent[_, Event] => Unit): Self = this.set("beforeSave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSave: Self = this.set("beforeSave", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseBtnClass(value: String): Self = this.set("closeBtnClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBtnClass: Self = this.set("closeBtnClass", js.undefined)
    @scala.inline
    def setCloseBtnContextual(value: String): Self = this.set("closeBtnContextual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBtnContextual: Self = this.set("closeBtnContextual", js.undefined)
    @scala.inline
    def setCloseBtnText(value: String): Self = this.set("closeBtnText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBtnText: Self = this.set("closeBtnText", js.undefined)
    @scala.inline
    def setOnModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): Self = this.set("onModalClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnModalClose: Self = this.set("onModalClose", js.undefined)
    @scala.inline
    def setOnSave(value: /* save */ js.Function0[Unit] => Unit): Self = this.set("onSave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSave: Self = this.set("onSave", js.undefined)
    @scala.inline
    def setSaveBtnClass(value: String): Self = this.set("saveBtnClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveBtnClass: Self = this.set("saveBtnClass", js.undefined)
    @scala.inline
    def setSaveBtnContextual(value: String): Self = this.set("saveBtnContextual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveBtnContextual: Self = this.set("saveBtnContextual", js.undefined)
    @scala.inline
    def setSaveBtnText(value: String): Self = this.set("saveBtnText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveBtnText: Self = this.set("saveBtnText", js.undefined)
  }
  
}

