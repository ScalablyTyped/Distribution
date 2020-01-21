package typings.senchaTouch.Ext.field

import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInput extends IInput {
  /** [Method] Updated the capture attribute with the  ink capture configuration
  		* @param value Object
  		*/
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of accept
  		* @returns Object
  		*/
  var getAccept: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of capture
  		* @returns Object
  		*/
  var getCapture: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the field files
  		* @returns FileList List of the files selected.
  		*/
  var getFiles: js.UndefOr[js.Function0[FileList]] = js.undefined
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns String value The field value.
  		*/
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept Object The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture Object The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IFileInput {
  @scala.inline
  def apply(
    IInput: IInput = null,
    applyCapture: /* value */ js.UndefOr[js.Any] => Unit = null,
    getAccept: () => _ = null,
    getCapture: () => _ = null,
    getFiles: () => FileList = null,
    getMultiple: () => Boolean = null,
    getValue: () => String = null,
    me: js.Any = null,
    newValue: js.Any = null,
    setAccept: /* accept */ js.UndefOr[js.Any] => Unit = null,
    setCapture: /* capture */ js.UndefOr[js.Any] => Unit = null,
    setMultiple: /* multiple */ js.UndefOr[Boolean] => Unit = null,
    setName: /* name */ js.UndefOr[js.Any] => Unit = null,
    updateMultiple: () => Unit = null
  ): IFileInput = {
    val __obj = js.Dynamic.literal()
    if (IInput != null) js.Dynamic.global.Object.assign(__obj, IInput)
    if (applyCapture != null) __obj.updateDynamic("applyCapture")(js.Any.fromFunction1(applyCapture))
    if (getAccept != null) __obj.updateDynamic("getAccept")(js.Any.fromFunction0(getAccept))
    if (getCapture != null) __obj.updateDynamic("getCapture")(js.Any.fromFunction0(getCapture))
    if (getFiles != null) __obj.updateDynamic("getFiles")(js.Any.fromFunction0(getFiles))
    if (getMultiple != null) __obj.updateDynamic("getMultiple")(js.Any.fromFunction0(getMultiple))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (me != null) __obj.updateDynamic("me")(me.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (setAccept != null) __obj.updateDynamic("setAccept")(js.Any.fromFunction1(setAccept))
    if (setCapture != null) __obj.updateDynamic("setCapture")(js.Any.fromFunction1(setCapture))
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(js.Any.fromFunction1(setMultiple))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (updateMultiple != null) __obj.updateDynamic("updateMultiple")(js.Any.fromFunction0(updateMultiple))
    __obj.asInstanceOf[IFileInput]
  }
}

