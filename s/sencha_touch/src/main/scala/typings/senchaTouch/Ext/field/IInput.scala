package typings.senchaTouch.Ext.field

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInput extends IComponent {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.native
  /** [Method] Attempts to forcefully blur input focus for the field
    * @returns Ext.field.Input this
    */
  var blur: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[Boolean] = js.native
  /** [Method] Attempts to set the field as the active input focus
    * @returns Ext.field.Input this
    */
  var focus: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.native
  /** [Method] Returns the value of autoCapitalize
    * @returns Boolean
    */
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoComplete
    * @returns Boolean
    */
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoCorrect
    * @returns Boolean
    */
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the checked value of this field
    * @returns Mixed value The field value
    */
  var getChecked: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of fastFocus
    * @returns Boolean
    */
  var getFastFocus: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of focusCls
    * @returns String
    */
  var getFocusCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of maxLength
    * @returns Number
    */
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxRows
    * @returns Number
    */
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of pattern
    * @returns String
    */
  var getPattern: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of placeHolder
    * @returns String
    */
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of startValue
    * @returns Mixed
    */
  var getStartValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of stepValue
    * @returns Number
    */
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of tabIndex
    * @returns Number
    */
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of type
    * @returns String
    */
  var getType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the field data value
    * @returns Mixed value The field value.
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its original value
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var pattern: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Attempts to forcefully select all the contents of the input field
    * @returns Ext.field.Input this
    */
  var select: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Sets the value of autoCapitalize
    * @param autoCapitalize Boolean The new value.
    */
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoComplete
    * @param autoComplete Boolean The new value.
    */
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoCorrect
    * @param autoCorrect Boolean The new value.
    */
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of fastFocus
    * @param fastFocus Boolean The new value.
    */
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of focusCls
    * @param focusCls String The new value.
    */
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of maxLength
    * @param maxLength Number The new value.
    */
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxRows
    * @param maxRows Number The new value.
    */
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of pattern
    * @param pattern String The new value.
    */
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of placeHolder
    * @param placeHolder String The new value.
    */
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of startValue
    * @param startValue Mixed The new value.
    */
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of stepValue
    * @param stepValue Number The new value.
    */
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Number The new value.
    */
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of type
    * @param type String The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Method] Updates the cls configuration
    * @param newCls Object
    * @param oldCls Object
    */
  var updateCls: js.UndefOr[
    js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Updates the useMask configuration
    * @param newUseMask Object
    */
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IInput {
  @scala.inline
  def apply(): IInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInput]
  }
  @scala.inline
  implicit class IInputOps[Self <: IInput] (val x: Self) extends AnyVal {
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
    def setAutoCapitalize(value: Boolean): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: Boolean): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setBlur(value: () => IInput): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    @scala.inline
    def setFastFocus(value: Boolean): Self = this.set("fastFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastFocus: Self = this.set("fastFocus", js.undefined)
    @scala.inline
    def setFocus(value: () => IInput): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFocusCls(value: String): Self = this.set("focusCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusCls: Self = this.set("focusCls", js.undefined)
    @scala.inline
    def setGetAutoCapitalize(value: () => Boolean): Self = this.set("getAutoCapitalize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoCapitalize: Self = this.set("getAutoCapitalize", js.undefined)
    @scala.inline
    def setGetAutoComplete(value: () => Boolean): Self = this.set("getAutoComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoComplete: Self = this.set("getAutoComplete", js.undefined)
    @scala.inline
    def setGetAutoCorrect(value: () => Boolean): Self = this.set("getAutoCorrect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoCorrect: Self = this.set("getAutoCorrect", js.undefined)
    @scala.inline
    def setGetChecked(value: () => _): Self = this.set("getChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChecked: Self = this.set("getChecked", js.undefined)
    @scala.inline
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setGetFastFocus(value: () => Boolean): Self = this.set("getFastFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFastFocus: Self = this.set("getFastFocus", js.undefined)
    @scala.inline
    def setGetFocusCls(value: () => String): Self = this.set("getFocusCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFocusCls: Self = this.set("getFocusCls", js.undefined)
    @scala.inline
    def setGetMaxLength(value: () => Double): Self = this.set("getMaxLength", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxLength: Self = this.set("getMaxLength", js.undefined)
    @scala.inline
    def setGetMaxRows(value: () => Double): Self = this.set("getMaxRows", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxRows: Self = this.set("getMaxRows", js.undefined)
    @scala.inline
    def setGetMaxValue(value: () => Double): Self = this.set("getMaxValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxValue: Self = this.set("getMaxValue", js.undefined)
    @scala.inline
    def setGetMinValue(value: () => Double): Self = this.set("getMinValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinValue: Self = this.set("getMinValue", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetPattern(value: () => String): Self = this.set("getPattern", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPattern: Self = this.set("getPattern", js.undefined)
    @scala.inline
    def setGetPlaceHolder(value: () => String): Self = this.set("getPlaceHolder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPlaceHolder: Self = this.set("getPlaceHolder", js.undefined)
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = this.set("getReadOnly", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReadOnly: Self = this.set("getReadOnly", js.undefined)
    @scala.inline
    def setGetStartValue(value: () => _): Self = this.set("getStartValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStartValue: Self = this.set("getStartValue", js.undefined)
    @scala.inline
    def setGetStepValue(value: () => Double): Self = this.set("getStepValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStepValue: Self = this.set("getStepValue", js.undefined)
    @scala.inline
    def setGetTabIndex(value: () => Double): Self = this.set("getTabIndex", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTabIndex: Self = this.set("getTabIndex", js.undefined)
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetType: Self = this.set("getType", js.undefined)
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDirty: Self = this.set("isDirty", js.undefined)
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSelect(value: () => IInput): Self = this.set("select", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSetAutoCapitalize(value: /* autoCapitalize */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoCapitalize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoCapitalize: Self = this.set("setAutoCapitalize", js.undefined)
    @scala.inline
    def setSetAutoComplete(value: /* autoComplete */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoComplete: Self = this.set("setAutoComplete", js.undefined)
    @scala.inline
    def setSetAutoCorrect(value: /* autoCorrect */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoCorrect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoCorrect: Self = this.set("setAutoCorrect", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    @scala.inline
    def setSetFastFocus(value: /* fastFocus */ js.UndefOr[Boolean] => Unit): Self = this.set("setFastFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFastFocus: Self = this.set("setFastFocus", js.undefined)
    @scala.inline
    def setSetFocusCls(value: /* focusCls */ js.UndefOr[String] => Unit): Self = this.set("setFocusCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFocusCls: Self = this.set("setFocusCls", js.undefined)
    @scala.inline
    def setSetMaxLength(value: /* maxLength */ js.UndefOr[Double] => Unit): Self = this.set("setMaxLength", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxLength: Self = this.set("setMaxLength", js.undefined)
    @scala.inline
    def setSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Unit): Self = this.set("setMaxRows", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxRows: Self = this.set("setMaxRows", js.undefined)
    @scala.inline
    def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    @scala.inline
    def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    @scala.inline
    def setSetPattern(value: /* pattern */ js.UndefOr[String] => Unit): Self = this.set("setPattern", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPattern: Self = this.set("setPattern", js.undefined)
    @scala.inline
    def setSetPlaceHolder(value: /* placeHolder */ js.UndefOr[String] => Unit): Self = this.set("setPlaceHolder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPlaceHolder: Self = this.set("setPlaceHolder", js.undefined)
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    @scala.inline
    def setSetStartValue(value: /* startValue */ js.UndefOr[js.Any] => Unit): Self = this.set("setStartValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStartValue: Self = this.set("setStartValue", js.undefined)
    @scala.inline
    def setSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Unit): Self = this.set("setStepValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStepValue: Self = this.set("setStepValue", js.undefined)
    @scala.inline
    def setSetTabIndex(value: /* tabIndex */ js.UndefOr[Double] => Unit): Self = this.set("setTabIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTabIndex: Self = this.set("setTabIndex", js.undefined)
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[String] => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetType: Self = this.set("setType", js.undefined)
    @scala.inline
    def setStartValue(value: js.Any): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    @scala.inline
    def setStepValue(value: Double): Self = this.set("stepValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepValue: Self = this.set("stepValue", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateCls(value: (/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateCls", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateCls: Self = this.set("updateCls", js.undefined)
    @scala.inline
    def setUpdateUseMask(value: /* newUseMask */ js.UndefOr[js.Any] => Unit): Self = this.set("updateUseMask", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateUseMask: Self = this.set("updateUseMask", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

