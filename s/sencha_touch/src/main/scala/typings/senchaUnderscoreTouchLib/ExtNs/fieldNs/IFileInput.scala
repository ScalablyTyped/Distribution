package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInput extends IInput {
  /** [Method] Updated the capture attribute with the  ink capture configuration
  		* @param value Object
  		*/
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
  var getFiles: js.UndefOr[js.Function0[stdLib.FileList]] = js.undefined
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns String value The field value.
  		*/
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of accept
  		* @param accept Object The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of capture
  		* @param capture Object The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IFileInput {
  @scala.inline
  def apply(
    IInput: IInput = null,
    applyCapture: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    getAccept: js.Function0[_] = null,
    getCapture: js.Function0[_] = null,
    getFiles: js.Function0[stdLib.FileList] = null,
    getMultiple: js.Function0[scala.Boolean] = null,
    getType: js.Function0[java.lang.String] = null,
    getValue: js.Function0[java.lang.String] = null,
    me: js.Any = null,
    name: java.lang.String = null,
    newValue: js.Any = null,
    setAccept: js.Function1[/* accept */ js.UndefOr[js.Any], scala.Unit] = null,
    setCapture: js.Function1[/* capture */ js.UndefOr[js.Any], scala.Unit] = null,
    setMultiple: js.Function1[/* multiple */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit] = null,
    setType: js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit] = null,
    `type`: java.lang.String = null,
    updateMultiple: js.Function0[scala.Unit] = null,
    value: js.Any = null
  ): IFileInput = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IInput)
    if (applyCapture != null) __obj.updateDynamic("applyCapture")(applyCapture)
    if (getAccept != null) __obj.updateDynamic("getAccept")(getAccept)
    if (getCapture != null) __obj.updateDynamic("getCapture")(getCapture)
    if (getFiles != null) __obj.updateDynamic("getFiles")(getFiles)
    if (getMultiple != null) __obj.updateDynamic("getMultiple")(getMultiple)
    if (getType != null) __obj.updateDynamic("getType")(getType)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (me != null) __obj.updateDynamic("me")(me)
    if (name != null) __obj.updateDynamic("name")(name)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (setAccept != null) __obj.updateDynamic("setAccept")(setAccept)
    if (setCapture != null) __obj.updateDynamic("setCapture")(setCapture)
    if (setMultiple != null) __obj.updateDynamic("setMultiple")(setMultiple)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setType != null) __obj.updateDynamic("setType")(setType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateMultiple != null) __obj.updateDynamic("updateMultiple")(updateMultiple)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IFileInput]
  }
}

