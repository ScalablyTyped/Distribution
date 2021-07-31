package typings.senchaTouch.Ext.field

import typings.senchaTouch.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInput
  extends StObject
     with IComponent {
  
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Attempts to forcefully blur input focus for the field
    * @returns Ext.field.Input this
    */
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Attempts to set the field as the active input focus
    * @returns Ext.field.Input this
    */
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.undefined
  
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
  
  /** [Method] Returns the checked value of this field
    * @returns Mixed value The field value
    */
  var getChecked: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of fastFocus
    * @returns Boolean
    */
  var getFastFocus: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of focusCls
    * @returns String
    */
  var getFocusCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of maxLength
    * @returns Number
    */
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maxRows
    * @returns Number
    */
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of pattern
    * @returns String
    */
  var getPattern: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of placeHolder
    * @returns String
    */
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of startValue
    * @returns Mixed
    */
  var getStartValue: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of stepValue
    * @returns Number
    */
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of tabIndex
    * @returns Number
    */
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of type
    * @returns String
    */
  var getType: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the field data value
    * @returns Mixed value The field value.
    */
  var getValue: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns true if the value of this Field has been changed from its original value
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Attempts to forcefully select all the contents of the input field
    * @returns Ext.field.Input this
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
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of fastFocus
    * @param fastFocus Boolean The new value.
    */
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of focusCls
    * @param focusCls String The new value.
    */
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxLength
    * @param maxLength Number The new value.
    */
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxRows
    * @param maxRows Number The new value.
    */
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of pattern
    * @param pattern String The new value.
    */
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of placeHolder
    * @param placeHolder String The new value.
    */
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of startValue
    * @param startValue Mixed The new value.
    */
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of stepValue
    * @param stepValue Number The new value.
    */
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Number The new value.
    */
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of type
    * @param type String The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** [Method] Updates the cls configuration
    * @param newCls Object
    * @param oldCls Object
    */
  var updateCls: js.UndefOr[
    js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Updates the useMask configuration
    * @param newUseMask Object
    */
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}
object IInput {
  
  @scala.inline
  def apply(): IInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInput]
  }
  
  @scala.inline
  implicit class IInputMutableBuilder[Self <: IInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCapitalize(value: Boolean): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setBlur(value: () => IInput): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    @scala.inline
    def setFastFocus(value: Boolean): Self = StObject.set(x, "fastFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastFocusUndefined: Self = StObject.set(x, "fastFocus", js.undefined)
    
    @scala.inline
    def setFocus(value: () => IInput): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusCls(value: String): Self = StObject.set(x, "focusCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusClsUndefined: Self = StObject.set(x, "focusCls", js.undefined)
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setGetAutoCapitalize(value: () => Boolean): Self = StObject.set(x, "getAutoCapitalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoCapitalizeUndefined: Self = StObject.set(x, "getAutoCapitalize", js.undefined)
    
    @scala.inline
    def setGetAutoComplete(value: () => Boolean): Self = StObject.set(x, "getAutoComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoCompleteUndefined: Self = StObject.set(x, "getAutoComplete", js.undefined)
    
    @scala.inline
    def setGetAutoCorrect(value: () => Boolean): Self = StObject.set(x, "getAutoCorrect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoCorrectUndefined: Self = StObject.set(x, "getAutoCorrect", js.undefined)
    
    @scala.inline
    def setGetChecked(value: () => js.Any): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    @scala.inline
    def setGetFastFocus(value: () => Boolean): Self = StObject.set(x, "getFastFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFastFocusUndefined: Self = StObject.set(x, "getFastFocus", js.undefined)
    
    @scala.inline
    def setGetFocusCls(value: () => String): Self = StObject.set(x, "getFocusCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFocusClsUndefined: Self = StObject.set(x, "getFocusCls", js.undefined)
    
    @scala.inline
    def setGetMaxLength(value: () => Double): Self = StObject.set(x, "getMaxLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxLengthUndefined: Self = StObject.set(x, "getMaxLength", js.undefined)
    
    @scala.inline
    def setGetMaxRows(value: () => Double): Self = StObject.set(x, "getMaxRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxRowsUndefined: Self = StObject.set(x, "getMaxRows", js.undefined)
    
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
    
    @scala.inline
    def setGetMinValue(value: () => Double): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    @scala.inline
    def setGetPattern(value: () => String): Self = StObject.set(x, "getPattern", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPatternUndefined: Self = StObject.set(x, "getPattern", js.undefined)
    
    @scala.inline
    def setGetPlaceHolder(value: () => String): Self = StObject.set(x, "getPlaceHolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaceHolderUndefined: Self = StObject.set(x, "getPlaceHolder", js.undefined)
    
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReadOnlyUndefined: Self = StObject.set(x, "getReadOnly", js.undefined)
    
    @scala.inline
    def setGetStartValue(value: () => js.Any): Self = StObject.set(x, "getStartValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartValueUndefined: Self = StObject.set(x, "getStartValue", js.undefined)
    
    @scala.inline
    def setGetStepValue(value: () => Double): Self = StObject.set(x, "getStepValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStepValueUndefined: Self = StObject.set(x, "getStepValue", js.undefined)
    
    @scala.inline
    def setGetTabIndex(value: () => Double): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabIndexUndefined: Self = StObject.set(x, "getTabIndex", js.undefined)
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSelect(value: () => IInput): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSetAutoCapitalize(value: /* autoCapitalize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoCapitalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoCapitalizeUndefined: Self = StObject.set(x, "setAutoCapitalize", js.undefined)
    
    @scala.inline
    def setSetAutoComplete(value: /* autoComplete */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoCompleteUndefined: Self = StObject.set(x, "setAutoComplete", js.undefined)
    
    @scala.inline
    def setSetAutoCorrect(value: /* autoCorrect */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoCorrect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoCorrectUndefined: Self = StObject.set(x, "setAutoCorrect", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    @scala.inline
    def setSetFastFocus(value: /* fastFocus */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFastFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFastFocusUndefined: Self = StObject.set(x, "setFastFocus", js.undefined)
    
    @scala.inline
    def setSetFocusCls(value: /* focusCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFocusCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFocusClsUndefined: Self = StObject.set(x, "setFocusCls", js.undefined)
    
    @scala.inline
    def setSetMaxLength(value: /* maxLength */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxLengthUndefined: Self = StObject.set(x, "setMaxLength", js.undefined)
    
    @scala.inline
    def setSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxRowsUndefined: Self = StObject.set(x, "setMaxRows", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    @scala.inline
    def setSetPattern(value: /* pattern */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPatternUndefined: Self = StObject.set(x, "setPattern", js.undefined)
    
    @scala.inline
    def setSetPlaceHolder(value: /* placeHolder */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPlaceHolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPlaceHolderUndefined: Self = StObject.set(x, "setPlaceHolder", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    @scala.inline
    def setSetStartValue(value: /* startValue */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStartValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartValueUndefined: Self = StObject.set(x, "setStartValue", js.undefined)
    
    @scala.inline
    def setSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setStepValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStepValueUndefined: Self = StObject.set(x, "setStepValue", js.undefined)
    
    @scala.inline
    def setSetTabIndex(value: /* tabIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTabIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabIndexUndefined: Self = StObject.set(x, "setTabIndex", js.undefined)
    
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
    
    @scala.inline
    def setStartValue(value: js.Any): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateCls(value: (/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateCls", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateClsUndefined: Self = StObject.set(x, "updateCls", js.undefined)
    
    @scala.inline
    def setUpdateUseMask(value: /* newUseMask */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updateUseMask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUseMaskUndefined: Self = StObject.set(x, "updateUseMask", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
