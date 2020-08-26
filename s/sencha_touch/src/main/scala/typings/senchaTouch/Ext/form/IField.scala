package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.IDecorator
import typings.senchaTouch.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends IDecorator {
  /** [Config Option] (Boolean) */
  var clearIcon: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.native
  /** [Method] Returns the value of clearIcon
    * @returns Boolean
    */
  var getClearIcon: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of inputCls
    * @returns String
    */
  var getInputCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of inputType
    * @returns String
    */
  var getInputType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of label
    * @returns String
    */
  var getLabel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of labelAlign
    * @returns String
    */
  var getLabelAlign: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of labelCls
    * @returns String
    */
  var getLabelCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of labelWidth
    * @returns Number/String
    */
  var getLabelWidth: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelWrap
    * @returns Boolean
    */
  var getLabelWrap: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of required
    * @returns Boolean
    */
  var getRequired: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of requiredCls
    * @returns String
    */
  var getRequiredCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of tabIndex
    * @returns Number
    */
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of value
    * @returns Mixed
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var inputCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
    * @returns Boolean true if this field has been changed from its original value (and is not disabled), false otherwise.
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isField: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var label: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Number/String) */
  var labelWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var labelWrap: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Mixed) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var required: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.native
  /** [Method] Resets the current field value back to the original value on this field when it was created
    * @returns Ext.field.Field this
    */
  var reset: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of clearIcon
    * @param clearIcon Boolean The new value.
    */
  var setClearIcon: js.UndefOr[js.Function1[/* clearIcon */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of inputCls
    * @param inputCls String The new value.
    */
  var setInputCls: js.UndefOr[js.Function1[/* inputCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of inputType
    * @param inputType String The new value.
    */
  var setInputType: js.UndefOr[js.Function1[/* inputType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of label
    * @param label String The new value.
    */
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of labelAlign
    * @param labelAlign String The new value.
    */
  var setLabelAlign: js.UndefOr[js.Function1[/* labelAlign */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of labelCls
    * @param labelCls String The new value.
    */
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of labelWidth
    * @param labelWidth Number/String The new value.
    */
  var setLabelWidth: js.UndefOr[js.Function1[/* labelWidth */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of labelWrap
    * @param labelWrap Boolean The new value.
    */
  var setLabelWrap: js.UndefOr[js.Function1[/* labelWrap */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of required
    * @param required Boolean The new value.
    */
  var setRequired: js.UndefOr[js.Function1[/* required */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of requiredCls
    * @param requiredCls String The new value.
    */
  var setRequiredCls: js.UndefOr[js.Function1[/* requiredCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Number The new value.
    */
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of value
    * @param value Mixed The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var useClearIcon: js.UndefOr[String] = js.native
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
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
    def setClearIcon(value: Boolean): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setFieldCls(value: String): Self = this.set("fieldCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldCls: Self = this.set("fieldCls", js.undefined)
    @scala.inline
    def setFieldLabel(value: String): Self = this.set("fieldLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLabel: Self = this.set("fieldLabel", js.undefined)
    @scala.inline
    def setGetClearIcon(value: () => Boolean): Self = this.set("getClearIcon", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetClearIcon: Self = this.set("getClearIcon", js.undefined)
    @scala.inline
    def setGetInputCls(value: () => String): Self = this.set("getInputCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInputCls: Self = this.set("getInputCls", js.undefined)
    @scala.inline
    def setGetInputType(value: () => String): Self = this.set("getInputType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInputType: Self = this.set("getInputType", js.undefined)
    @scala.inline
    def setGetLabel(value: () => String): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    @scala.inline
    def setGetLabelAlign(value: () => String): Self = this.set("getLabelAlign", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelAlign: Self = this.set("getLabelAlign", js.undefined)
    @scala.inline
    def setGetLabelCls(value: () => String): Self = this.set("getLabelCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelCls: Self = this.set("getLabelCls", js.undefined)
    @scala.inline
    def setGetLabelWidth(value: () => _): Self = this.set("getLabelWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelWidth: Self = this.set("getLabelWidth", js.undefined)
    @scala.inline
    def setGetLabelWrap(value: () => Boolean): Self = this.set("getLabelWrap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelWrap: Self = this.set("getLabelWrap", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetRequired(value: () => Boolean): Self = this.set("getRequired", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRequired: Self = this.set("getRequired", js.undefined)
    @scala.inline
    def setGetRequiredCls(value: () => String): Self = this.set("getRequiredCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRequiredCls: Self = this.set("getRequiredCls", js.undefined)
    @scala.inline
    def setGetTabIndex(value: () => Double): Self = this.set("getTabIndex", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTabIndex: Self = this.set("getTabIndex", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setInputCls(value: String): Self = this.set("inputCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputCls: Self = this.set("inputCls", js.undefined)
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsField(value: Boolean): Self = this.set("isField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsField: Self = this.set("isField", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelAlign(value: String): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    @scala.inline
    def setLabelCls(value: String): Self = this.set("labelCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCls: Self = this.set("labelCls", js.undefined)
    @scala.inline
    def setLabelEl(value: IElement): Self = this.set("labelEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelEl: Self = this.set("labelEl", js.undefined)
    @scala.inline
    def setLabelWidth(value: js.Any): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    @scala.inline
    def setLabelWrap(value: Boolean): Self = this.set("labelWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWrap: Self = this.set("labelWrap", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRequiredCls(value: String): Self = this.set("requiredCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredCls: Self = this.set("requiredCls", js.undefined)
    @scala.inline
    def setReset(value: () => IField): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setResetOriginalValue(value: () => Unit): Self = this.set("resetOriginalValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetOriginalValue: Self = this.set("resetOriginalValue", js.undefined)
    @scala.inline
    def setSetClearIcon(value: /* clearIcon */ js.UndefOr[Boolean] => Unit): Self = this.set("setClearIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetClearIcon: Self = this.set("setClearIcon", js.undefined)
    @scala.inline
    def setSetInputCls(value: /* inputCls */ js.UndefOr[String] => Unit): Self = this.set("setInputCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInputCls: Self = this.set("setInputCls", js.undefined)
    @scala.inline
    def setSetInputType(value: /* inputType */ js.UndefOr[String] => Unit): Self = this.set("setInputType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInputType: Self = this.set("setInputType", js.undefined)
    @scala.inline
    def setSetLabel(value: /* label */ js.UndefOr[String] => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabel: Self = this.set("setLabel", js.undefined)
    @scala.inline
    def setSetLabelAlign(value: /* labelAlign */ js.UndefOr[String] => Unit): Self = this.set("setLabelAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelAlign: Self = this.set("setLabelAlign", js.undefined)
    @scala.inline
    def setSetLabelCls(value: /* labelCls */ js.UndefOr[String] => Unit): Self = this.set("setLabelCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelCls: Self = this.set("setLabelCls", js.undefined)
    @scala.inline
    def setSetLabelWidth(value: /* labelWidth */ js.UndefOr[js.Any] => Unit): Self = this.set("setLabelWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelWidth: Self = this.set("setLabelWidth", js.undefined)
    @scala.inline
    def setSetLabelWrap(value: /* labelWrap */ js.UndefOr[Boolean] => Unit): Self = this.set("setLabelWrap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelWrap: Self = this.set("setLabelWrap", js.undefined)
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    @scala.inline
    def setSetRequired(value: /* required */ js.UndefOr[Boolean] => Unit): Self = this.set("setRequired", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRequired: Self = this.set("setRequired", js.undefined)
    @scala.inline
    def setSetRequiredCls(value: /* requiredCls */ js.UndefOr[String] => Unit): Self = this.set("setRequiredCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRequiredCls: Self = this.set("setRequiredCls", js.undefined)
    @scala.inline
    def setSetTabIndex(value: /* tabIndex */ js.UndefOr[Double] => Unit): Self = this.set("setTabIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTabIndex: Self = this.set("setTabIndex", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setUseClearIcon(value: String): Self = this.set("useClearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClearIcon: Self = this.set("useClearIcon", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

