package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.IDecorator
import typings.senchaTouch.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField
  extends StObject
     with IDecorator {
  
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
  var getLabelWidth: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var labelWidth: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var labelWrap: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Property] (Mixed) */
  var originalValue: js.UndefOr[Any] = js.undefined
  
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
  var setLabelWidth: js.UndefOr[js.Function1[/* labelWidth */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var useClearIcon: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[Any] = js.undefined
}
object IField {
  
  inline def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    inline def setClearIcon(value: Boolean): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setFieldCls(value: String): Self = StObject.set(x, "fieldCls", value.asInstanceOf[js.Any])
    
    inline def setFieldClsUndefined: Self = StObject.set(x, "fieldCls", js.undefined)
    
    inline def setFieldLabel(value: String): Self = StObject.set(x, "fieldLabel", value.asInstanceOf[js.Any])
    
    inline def setFieldLabelUndefined: Self = StObject.set(x, "fieldLabel", js.undefined)
    
    inline def setGetClearIcon(value: () => Boolean): Self = StObject.set(x, "getClearIcon", js.Any.fromFunction0(value))
    
    inline def setGetClearIconUndefined: Self = StObject.set(x, "getClearIcon", js.undefined)
    
    inline def setGetInputCls(value: () => String): Self = StObject.set(x, "getInputCls", js.Any.fromFunction0(value))
    
    inline def setGetInputClsUndefined: Self = StObject.set(x, "getInputCls", js.undefined)
    
    inline def setGetInputType(value: () => String): Self = StObject.set(x, "getInputType", js.Any.fromFunction0(value))
    
    inline def setGetInputTypeUndefined: Self = StObject.set(x, "getInputType", js.undefined)
    
    inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setGetLabelAlign(value: () => String): Self = StObject.set(x, "getLabelAlign", js.Any.fromFunction0(value))
    
    inline def setGetLabelAlignUndefined: Self = StObject.set(x, "getLabelAlign", js.undefined)
    
    inline def setGetLabelCls(value: () => String): Self = StObject.set(x, "getLabelCls", js.Any.fromFunction0(value))
    
    inline def setGetLabelClsUndefined: Self = StObject.set(x, "getLabelCls", js.undefined)
    
    inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    inline def setGetLabelWidth(value: () => Any): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
    
    inline def setGetLabelWidthUndefined: Self = StObject.set(x, "getLabelWidth", js.undefined)
    
    inline def setGetLabelWrap(value: () => Boolean): Self = StObject.set(x, "getLabelWrap", js.Any.fromFunction0(value))
    
    inline def setGetLabelWrapUndefined: Self = StObject.set(x, "getLabelWrap", js.undefined)
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetRequired(value: () => Boolean): Self = StObject.set(x, "getRequired", js.Any.fromFunction0(value))
    
    inline def setGetRequiredCls(value: () => String): Self = StObject.set(x, "getRequiredCls", js.Any.fromFunction0(value))
    
    inline def setGetRequiredClsUndefined: Self = StObject.set(x, "getRequiredCls", js.undefined)
    
    inline def setGetRequiredUndefined: Self = StObject.set(x, "getRequired", js.undefined)
    
    inline def setGetTabIndex(value: () => Double): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
    
    inline def setGetTabIndexUndefined: Self = StObject.set(x, "getTabIndex", js.undefined)
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setInputCls(value: String): Self = StObject.set(x, "inputCls", value.asInstanceOf[js.Any])
    
    inline def setInputClsUndefined: Self = StObject.set(x, "inputCls", js.undefined)
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsField(value: Boolean): Self = StObject.set(x, "isField", value.asInstanceOf[js.Any])
    
    inline def setIsFieldUndefined: Self = StObject.set(x, "isField", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelCls(value: String): Self = StObject.set(x, "labelCls", value.asInstanceOf[js.Any])
    
    inline def setLabelClsUndefined: Self = StObject.set(x, "labelCls", js.undefined)
    
    inline def setLabelEl(value: IElement): Self = StObject.set(x, "labelEl", value.asInstanceOf[js.Any])
    
    inline def setLabelElUndefined: Self = StObject.set(x, "labelEl", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelWidth(value: Any): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    inline def setLabelWrap(value: Boolean): Self = StObject.set(x, "labelWrap", value.asInstanceOf[js.Any])
    
    inline def setLabelWrapUndefined: Self = StObject.set(x, "labelWrap", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredCls(value: String): Self = StObject.set(x, "requiredCls", value.asInstanceOf[js.Any])
    
    inline def setRequiredClsUndefined: Self = StObject.set(x, "requiredCls", js.undefined)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setReset(value: () => IField): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetOriginalValue(value: () => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction0(value))
    
    inline def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSetClearIcon(value: /* clearIcon */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setClearIcon", js.Any.fromFunction1(value))
    
    inline def setSetClearIconUndefined: Self = StObject.set(x, "setClearIcon", js.undefined)
    
    inline def setSetInputCls(value: /* inputCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInputCls", js.Any.fromFunction1(value))
    
    inline def setSetInputClsUndefined: Self = StObject.set(x, "setInputCls", js.undefined)
    
    inline def setSetInputType(value: /* inputType */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInputType", js.Any.fromFunction1(value))
    
    inline def setSetInputTypeUndefined: Self = StObject.set(x, "setInputType", js.undefined)
    
    inline def setSetLabel(value: /* label */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    inline def setSetLabelAlign(value: /* labelAlign */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLabelAlign", js.Any.fromFunction1(value))
    
    inline def setSetLabelAlignUndefined: Self = StObject.set(x, "setLabelAlign", js.undefined)
    
    inline def setSetLabelCls(value: /* labelCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLabelCls", js.Any.fromFunction1(value))
    
    inline def setSetLabelClsUndefined: Self = StObject.set(x, "setLabelCls", js.undefined)
    
    inline def setSetLabelUndefined: Self = StObject.set(x, "setLabel", js.undefined)
    
    inline def setSetLabelWidth(value: /* labelWidth */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLabelWidth", js.Any.fromFunction1(value))
    
    inline def setSetLabelWidthUndefined: Self = StObject.set(x, "setLabelWidth", js.undefined)
    
    inline def setSetLabelWrap(value: /* labelWrap */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setLabelWrap", js.Any.fromFunction1(value))
    
    inline def setSetLabelWrapUndefined: Self = StObject.set(x, "setLabelWrap", js.undefined)
    
    inline def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    inline def setSetRequired(value: /* required */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetRequiredCls(value: /* requiredCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRequiredCls", js.Any.fromFunction1(value))
    
    inline def setSetRequiredClsUndefined: Self = StObject.set(x, "setRequiredCls", js.undefined)
    
    inline def setSetRequiredUndefined: Self = StObject.set(x, "setRequired", js.undefined)
    
    inline def setSetTabIndex(value: /* tabIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTabIndex", js.Any.fromFunction1(value))
    
    inline def setSetTabIndexUndefined: Self = StObject.set(x, "setTabIndex", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setUseClearIcon(value: String): Self = StObject.set(x, "useClearIcon", value.asInstanceOf[js.Any])
    
    inline def setUseClearIconUndefined: Self = StObject.set(x, "useClearIcon", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
