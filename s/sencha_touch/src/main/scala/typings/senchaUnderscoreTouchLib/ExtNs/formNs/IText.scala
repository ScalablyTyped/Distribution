package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.IField {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Text This field
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Text This field
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of autoCapitalize
  		* @returns Boolean
  		*/
  var getAutoCapitalize: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoComplete
  		* @returns Boolean
  		*/
  var getAutoComplete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoCorrect
  		* @returns Boolean
  		*/
  var getAutoCorrect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField]] = js.undefined
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Text this
  		*/
  var select: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of autoCapitalize
  		* @param autoCapitalize Boolean The new value.
  		*/
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoComplete
  		* @param autoComplete Boolean The new value.
  		*/
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoCorrect
  		* @param autoCorrect Boolean The new value.
  		*/
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents Array The new value.
  		*/
  @JSName("setBubbleEvents")
  var setBubbleEvents_IText: js.UndefOr[
    js.Function1[/* bubbleEvents */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Property] (String/Number) */
  var startValue: js.UndefOr[js.Any] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IField: senchaUnderscoreTouchLib.ExtNs.fieldNs.IField = null,
    autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined,
    autoComplete: js.UndefOr[scala.Boolean] = js.undefined,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    blur: js.Function0[IText] = null,
    bubbleEvents: js.Any = null,
    clearIcon: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    focus: js.Function0[IText] = null,
    getAutoCapitalize: js.Function0[scala.Boolean] = null,
    getAutoComplete: js.Function0[scala.Boolean] = null,
    getAutoCorrect: js.Function0[scala.Boolean] = null,
    getClearIcon: js.Function0[scala.Boolean] = null,
    getComponent: js.Function0[_] = null,
    getMaxLength: js.Function0[scala.Double] = null,
    getPlaceHolder: js.Function0[java.lang.String] = null,
    getReadOnly: js.Function0[scala.Boolean] = null,
    getUi: js.Function0[java.lang.String] = null,
    getValue: js.Function0[_] = null,
    isDirty: js.Function0[scala.Boolean] = null,
    maxLength: scala.Int | scala.Double = null,
    placeHolder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reset: js.Function0[senchaUnderscoreTouchLib.ExtNs.fieldNs.IField] = null,
    resetOriginalValue: js.Function0[scala.Unit] = null,
    select: js.Function0[IText] = null,
    setAutoCapitalize: js.Function1[/* autoCapitalize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoComplete: js.Function1[/* autoComplete */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoCorrect: js.Function1[/* autoCorrect */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setClearIcon: js.Function1[/* clearIcon */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxLength: js.Function1[/* maxLength */ js.UndefOr[scala.Double], scala.Unit] = null,
    setPlaceHolder: js.Function1[/* placeHolder */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReadOnly: js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    startValue: js.Any = null,
    ui: java.lang.String = null
  ): IText = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (!js.isUndefined(clearIcon)) __obj.updateDynamic("clearIcon")(clearIcon)
    if (component != null) __obj.updateDynamic("component")(component)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(getAutoCapitalize)
    if (getAutoComplete != null) __obj.updateDynamic("getAutoComplete")(getAutoComplete)
    if (getAutoCorrect != null) __obj.updateDynamic("getAutoCorrect")(getAutoCorrect)
    if (getClearIcon != null) __obj.updateDynamic("getClearIcon")(getClearIcon)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getMaxLength != null) __obj.updateDynamic("getMaxLength")(getMaxLength)
    if (getPlaceHolder != null) __obj.updateDynamic("getPlaceHolder")(getPlaceHolder)
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(getReadOnly)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (isDirty != null) __obj.updateDynamic("isDirty")(isDirty)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(resetOriginalValue)
    if (select != null) __obj.updateDynamic("select")(select)
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(setAutoCapitalize)
    if (setAutoComplete != null) __obj.updateDynamic("setAutoComplete")(setAutoComplete)
    if (setAutoCorrect != null) __obj.updateDynamic("setAutoCorrect")(setAutoCorrect)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setClearIcon != null) __obj.updateDynamic("setClearIcon")(setClearIcon)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setMaxLength != null) __obj.updateDynamic("setMaxLength")(setMaxLength)
    if (setPlaceHolder != null) __obj.updateDynamic("setPlaceHolder")(setPlaceHolder)
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(setReadOnly)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (startValue != null) __obj.updateDynamic("startValue")(startValue)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IText]
  }
}

