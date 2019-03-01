package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertModalFooterProps extends js.Object {
  /**
  	 * Callback function to call prior to closing the Insert Modal window.
  	 */
  var beforeClose: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit]
  ] = js.undefined
  /**
  	 * Callback function to be called prior to saving the new row.
  	 */
  var beforeSave: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit]
  ] = js.undefined
  /**
  	 * Header class name.
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom class name for the close button.
  	 */
  var closeBtnClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Bootstrap css class name for the close button, example: 'btn-warning'
  	 */
  var closeBtnContextual: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text to display on the Close button
  	 */
  var closeBtnText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Callback function to call to close the Insert Modal window.
  	 */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
  	 * Callback function to be called to save the new row.
  	 */
  var onSave: js.UndefOr[js.Function1[/* save */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
  	 * Custom class name for the save button.
  	 */
  var saveBtnClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Bootstrap css class name for the save button, example: 'btn-success'
  	 */
  var saveBtnContextual: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text to display on the Save button
  	 */
  var saveBtnText: js.UndefOr[java.lang.String] = js.undefined
}

object InsertModalFooterProps {
  @scala.inline
  def apply(
    beforeClose: js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit] = null,
    beforeSave: js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit] = null,
    className: java.lang.String = null,
    closeBtnClass: java.lang.String = null,
    closeBtnContextual: java.lang.String = null,
    closeBtnText: java.lang.String = null,
    onModalClose: js.Function1[/* closeModal */ js.Function0[scala.Unit], scala.Unit] = null,
    onSave: js.Function1[/* save */ js.Function0[scala.Unit], scala.Unit] = null,
    saveBtnClass: java.lang.String = null,
    saveBtnContextual: java.lang.String = null,
    saveBtnText: java.lang.String = null
  ): InsertModalFooterProps = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(beforeSave)
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeBtnClass != null) __obj.updateDynamic("closeBtnClass")(closeBtnClass)
    if (closeBtnContextual != null) __obj.updateDynamic("closeBtnContextual")(closeBtnContextual)
    if (closeBtnText != null) __obj.updateDynamic("closeBtnText")(closeBtnText)
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(onModalClose)
    if (onSave != null) __obj.updateDynamic("onSave")(onSave)
    if (saveBtnClass != null) __obj.updateDynamic("saveBtnClass")(saveBtnClass)
    if (saveBtnContextual != null) __obj.updateDynamic("saveBtnContextual")(saveBtnContextual)
    if (saveBtnText != null) __obj.updateDynamic("saveBtnText")(saveBtnText)
    __obj.asInstanceOf[InsertModalFooterProps]
  }
}

