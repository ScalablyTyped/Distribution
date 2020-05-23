package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.IDecorator
import typings.senchaTouch.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends IDecorator {
  /** [Config Option] (Boolean) */
  var clearIcon: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of clearIcon
    * @returns Boolean
    */
  var getClearIcon: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of inputCls
    * @returns String
    */
  var getInputCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of inputType
    * @returns String
    */
  var getInputType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of label
    * @returns String
    */
  var getLabel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of labelAlign
    * @returns String
    */
  var getLabelAlign: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of labelCls
    * @returns String
    */
  var getLabelCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of labelWidth
    * @returns Number/String
    */
  var getLabelWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelWrap
    * @returns Boolean
    */
  var getLabelWrap: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of required
    * @returns Boolean
    */
  var getRequired: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of requiredCls
    * @returns String
    */
  var getRequiredCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of tabIndex
    * @returns Number
    */
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of value
    * @returns Mixed
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var inputCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns Boolean true if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isField: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var label: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Number/String) */
  var labelWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var labelWrap: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Property] (Mixed) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var required: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  var reset: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of clearIcon
    * @param clearIcon Boolean The new value.
    */
  var setClearIcon: js.UndefOr[js.Function1[/* clearIcon */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of inputCls
    * @param inputCls String The new value.
    */
  var setInputCls: js.UndefOr[js.Function1[/* inputCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of inputType
    * @param inputType String The new value.
    */
  var setInputType: js.UndefOr[js.Function1[/* inputType */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of label
    * @param label String The new value.
    */
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of labelAlign
    * @param labelAlign String The new value.
    */
  var setLabelAlign: js.UndefOr[js.Function1[/* labelAlign */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of labelCls
    * @param labelCls String The new value.
    */
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of labelWidth
    * @param labelWidth Number/String The new value.
    */
  var setLabelWidth: js.UndefOr[js.Function1[/* labelWidth */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of labelWrap
    * @param labelWrap Boolean The new value.
    */
  var setLabelWrap: js.UndefOr[js.Function1[/* labelWrap */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of required
    * @param required Boolean The new value.
    */
  var setRequired: js.UndefOr[js.Function1[/* required */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of requiredCls
    * @param requiredCls String The new value.
    */
  var setRequiredCls: js.UndefOr[js.Function1[/* requiredCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Number The new value.
    */
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of value
    * @param value Mixed The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var useClearIcon: js.UndefOr[String] = js.undefined
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    IDecorator: IDecorator = null,
    clearIcon: js.UndefOr[Boolean] = js.undefined,
    fieldCls: String = null,
    fieldLabel: String = null,
    getClearIcon: () => Boolean = null,
    getInputCls: () => String = null,
    getInputType: () => String = null,
    getLabel: () => String = null,
    getLabelAlign: () => String = null,
    getLabelCls: () => String = null,
    getLabelWidth: () => _ = null,
    getLabelWrap: () => Boolean = null,
    getName: () => String = null,
    getRequired: () => Boolean = null,
    getRequiredCls: () => String = null,
    getTabIndex: () => Double = null,
    getValue: () => _ = null,
    inputCls: String = null,
    inputType: String = null,
    isDirty: () => Boolean = null,
    isField: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelAlign: String = null,
    labelCls: String = null,
    labelEl: IElement = null,
    labelWidth: js.Any = null,
    labelWrap: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    originalValue: js.Any = null,
    required: js.UndefOr[Boolean] = js.undefined,
    requiredCls: String = null,
    reset: () => IField = null,
    resetOriginalValue: () => Unit = null,
    setClearIcon: /* clearIcon */ js.UndefOr[Boolean] => Unit = null,
    setInputCls: /* inputCls */ js.UndefOr[String] => Unit = null,
    setInputType: /* inputType */ js.UndefOr[String] => Unit = null,
    setLabel: /* label */ js.UndefOr[String] => Unit = null,
    setLabelAlign: /* labelAlign */ js.UndefOr[String] => Unit = null,
    setLabelCls: /* labelCls */ js.UndefOr[String] => Unit = null,
    setLabelWidth: /* labelWidth */ js.UndefOr[js.Any] => Unit = null,
    setLabelWrap: /* labelWrap */ js.UndefOr[Boolean] => Unit = null,
    setName: /* name */ js.UndefOr[String] => Unit = null,
    setRequired: /* required */ js.UndefOr[Boolean] => Unit = null,
    setRequiredCls: /* requiredCls */ js.UndefOr[String] => Unit = null,
    setTabIndex: /* tabIndex */ js.UndefOr[Double] => Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    useClearIcon: String = null,
    value: js.Any = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (IDecorator != null) js.Dynamic.global.Object.assign(__obj, IDecorator)
    if (!js.isUndefined(clearIcon)) __obj.updateDynamic("clearIcon")(clearIcon.get.asInstanceOf[js.Any])
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls.asInstanceOf[js.Any])
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel.asInstanceOf[js.Any])
    if (getClearIcon != null) __obj.updateDynamic("getClearIcon")(js.Any.fromFunction0(getClearIcon))
    if (getInputCls != null) __obj.updateDynamic("getInputCls")(js.Any.fromFunction0(getInputCls))
    if (getInputType != null) __obj.updateDynamic("getInputType")(js.Any.fromFunction0(getInputType))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelAlign != null) __obj.updateDynamic("getLabelAlign")(js.Any.fromFunction0(getLabelAlign))
    if (getLabelCls != null) __obj.updateDynamic("getLabelCls")(js.Any.fromFunction0(getLabelCls))
    if (getLabelWidth != null) __obj.updateDynamic("getLabelWidth")(js.Any.fromFunction0(getLabelWidth))
    if (getLabelWrap != null) __obj.updateDynamic("getLabelWrap")(js.Any.fromFunction0(getLabelWrap))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getRequired != null) __obj.updateDynamic("getRequired")(js.Any.fromFunction0(getRequired))
    if (getRequiredCls != null) __obj.updateDynamic("getRequiredCls")(js.Any.fromFunction0(getRequiredCls))
    if (getTabIndex != null) __obj.updateDynamic("getTabIndex")(js.Any.fromFunction0(getTabIndex))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (inputCls != null) __obj.updateDynamic("inputCls")(inputCls.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (isDirty != null) __obj.updateDynamic("isDirty")(js.Any.fromFunction0(isDirty))
    if (!js.isUndefined(isField)) __obj.updateDynamic("isField")(isField.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls.asInstanceOf[js.Any])
    if (labelEl != null) __obj.updateDynamic("labelEl")(labelEl.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrap)) __obj.updateDynamic("labelWrap")(labelWrap.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (requiredCls != null) __obj.updateDynamic("requiredCls")(requiredCls.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction0(resetOriginalValue))
    if (setClearIcon != null) __obj.updateDynamic("setClearIcon")(js.Any.fromFunction1(setClearIcon))
    if (setInputCls != null) __obj.updateDynamic("setInputCls")(js.Any.fromFunction1(setInputCls))
    if (setInputType != null) __obj.updateDynamic("setInputType")(js.Any.fromFunction1(setInputType))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelAlign != null) __obj.updateDynamic("setLabelAlign")(js.Any.fromFunction1(setLabelAlign))
    if (setLabelCls != null) __obj.updateDynamic("setLabelCls")(js.Any.fromFunction1(setLabelCls))
    if (setLabelWidth != null) __obj.updateDynamic("setLabelWidth")(js.Any.fromFunction1(setLabelWidth))
    if (setLabelWrap != null) __obj.updateDynamic("setLabelWrap")(js.Any.fromFunction1(setLabelWrap))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setRequired != null) __obj.updateDynamic("setRequired")(js.Any.fromFunction1(setRequired))
    if (setRequiredCls != null) __obj.updateDynamic("setRequiredCls")(js.Any.fromFunction1(setRequiredCls))
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1(setTabIndex))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (useClearIcon != null) __obj.updateDynamic("useClearIcon")(useClearIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

