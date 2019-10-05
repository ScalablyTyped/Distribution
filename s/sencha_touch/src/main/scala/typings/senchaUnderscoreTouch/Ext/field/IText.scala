package typings.senchaUnderscoreTouch.Ext.field

import typings.senchaUnderscoreTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText extends IField {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
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
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoComplete
  		* @returns Boolean
  		*/
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoCorrect
  		* @returns Boolean
  		*/
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[IField]] = js.undefined
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Text this
  		*/
  var select: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of autoCapitalize
  		* @param autoCapitalize Boolean The new value.
  		*/
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoComplete
  		* @param autoComplete Boolean The new value.
  		*/
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoCorrect
  		* @param autoCorrect Boolean The new value.
  		*/
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents Array The new value.
  		*/
  @JSName("setBubbleEvents")
  var setBubbleEvents_IText: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Property] (String/Number) */
  var startValue: js.UndefOr[js.Any] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IField: IField = null,
    autoCapitalize: js.UndefOr[Boolean] = js.undefined,
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    blur: () => IText = null,
    bubbleEvents: js.Any = null,
    clearIcon: js.UndefOr[Boolean] = js.undefined,
    component: js.Any = null,
    focus: () => IText = null,
    getAutoCapitalize: () => Boolean = null,
    getAutoComplete: () => Boolean = null,
    getAutoCorrect: () => Boolean = null,
    getClearIcon: () => Boolean = null,
    getComponent: () => _ = null,
    getMaxLength: () => Double = null,
    getPlaceHolder: () => java.lang.String = null,
    getReadOnly: () => Boolean = null,
    getUi: () => java.lang.String = null,
    getValue: () => _ = null,
    isDirty: () => Boolean = null,
    maxLength: Int | Double = null,
    placeHolder: java.lang.String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reset: () => IField = null,
    resetOriginalValue: () => Unit = null,
    select: () => IText = null,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[Boolean] => Unit = null,
    setAutoComplete: /* autoComplete */ js.UndefOr[Boolean] => Unit = null,
    setAutoCorrect: /* autoCorrect */ js.UndefOr[Boolean] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[Array] => Unit = null,
    setClearIcon: /* clearIcon */ js.UndefOr[Boolean] => Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => Unit = null,
    setMaxLength: /* maxLength */ js.UndefOr[Double] => Unit = null,
    setPlaceHolder: /* placeHolder */ js.UndefOr[java.lang.String] => Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    startValue: js.Any = null,
    ui: java.lang.String = null
  ): IText = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IField)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction0(blur))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (!js.isUndefined(clearIcon)) __obj.updateDynamic("clearIcon")(clearIcon)
    if (component != null) __obj.updateDynamic("component")(component)
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction0(focus))
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(js.Any.fromFunction0(getAutoCapitalize))
    if (getAutoComplete != null) __obj.updateDynamic("getAutoComplete")(js.Any.fromFunction0(getAutoComplete))
    if (getAutoCorrect != null) __obj.updateDynamic("getAutoCorrect")(js.Any.fromFunction0(getAutoCorrect))
    if (getClearIcon != null) __obj.updateDynamic("getClearIcon")(js.Any.fromFunction0(getClearIcon))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getMaxLength != null) __obj.updateDynamic("getMaxLength")(js.Any.fromFunction0(getMaxLength))
    if (getPlaceHolder != null) __obj.updateDynamic("getPlaceHolder")(js.Any.fromFunction0(getPlaceHolder))
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(js.Any.fromFunction0(getReadOnly))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction0(resetOriginalValue))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction0(select))
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1(setAutoCapitalize))
    if (setAutoComplete != null) __obj.updateDynamic("setAutoComplete")(js.Any.fromFunction1(setAutoComplete))
    if (setAutoCorrect != null) __obj.updateDynamic("setAutoCorrect")(js.Any.fromFunction1(setAutoCorrect))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setClearIcon != null) __obj.updateDynamic("setClearIcon")(js.Any.fromFunction1(setClearIcon))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setMaxLength != null) __obj.updateDynamic("setMaxLength")(js.Any.fromFunction1(setMaxLength))
    if (setPlaceHolder != null) __obj.updateDynamic("setPlaceHolder")(js.Any.fromFunction1(setPlaceHolder))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (startValue != null) __obj.updateDynamic("startValue")(startValue)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IText]
  }
}

