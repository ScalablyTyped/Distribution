package typings.reactBootstrapTable.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertModalFooterProps extends js.Object {
  /**
    * Callback function to call prior to closing the Insert Modal window.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.undefined
  /**
    * Callback function to be called prior to saving the new row.
    */
  var beforeSave: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.undefined
  /**
    * Header class name.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Custom class name for the close button.
    */
  var closeBtnClass: js.UndefOr[String] = js.undefined
  /**
    * Bootstrap css class name for the close button, example: 'btn-warning'
    */
  var closeBtnContextual: js.UndefOr[String] = js.undefined
  /**
    * Text to display on the Close button
    */
  var closeBtnText: js.UndefOr[String] = js.undefined
  /**
    * Callback function to call to close the Insert Modal window.
    */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.undefined
  /**
    * Callback function to be called to save the new row.
    */
  var onSave: js.UndefOr[js.Function1[/* save */ js.Function0[Unit], Unit]] = js.undefined
  /**
    * Custom class name for the save button.
    */
  var saveBtnClass: js.UndefOr[String] = js.undefined
  /**
    * Bootstrap css class name for the save button, example: 'btn-success'
    */
  var saveBtnContextual: js.UndefOr[String] = js.undefined
  /**
    * Text to display on the Save button
    */
  var saveBtnText: js.UndefOr[String] = js.undefined
}

object InsertModalFooterProps {
  @scala.inline
  def apply(
    beforeClose: /* e */ SyntheticEvent[_, Event] => Unit = null,
    beforeSave: /* e */ SyntheticEvent[_, Event] => Unit = null,
    className: String = null,
    closeBtnClass: String = null,
    closeBtnContextual: String = null,
    closeBtnText: String = null,
    onModalClose: /* closeModal */ js.Function0[Unit] => Unit = null,
    onSave: /* save */ js.Function0[Unit] => Unit = null,
    saveBtnClass: String = null,
    saveBtnContextual: String = null,
    saveBtnText: String = null
  ): InsertModalFooterProps = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction1(beforeSave))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeBtnClass != null) __obj.updateDynamic("closeBtnClass")(closeBtnClass.asInstanceOf[js.Any])
    if (closeBtnContextual != null) __obj.updateDynamic("closeBtnContextual")(closeBtnContextual.asInstanceOf[js.Any])
    if (closeBtnText != null) __obj.updateDynamic("closeBtnText")(closeBtnText.asInstanceOf[js.Any])
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(js.Any.fromFunction1(onModalClose))
    if (onSave != null) __obj.updateDynamic("onSave")(js.Any.fromFunction1(onSave))
    if (saveBtnClass != null) __obj.updateDynamic("saveBtnClass")(saveBtnClass.asInstanceOf[js.Any])
    if (saveBtnContextual != null) __obj.updateDynamic("saveBtnContextual")(saveBtnContextual.asInstanceOf[js.Any])
    if (saveBtnText != null) __obj.updateDynamic("saveBtnText")(saveBtnText.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertModalFooterProps]
  }
}

