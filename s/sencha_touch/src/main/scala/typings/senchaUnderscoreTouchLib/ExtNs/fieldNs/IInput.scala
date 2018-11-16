package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInput
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Input this
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Input this
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[java.lang.String] = js.undefined
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
  /** [Method] Returns the checked value of this field
  		* @returns Mixed value The field value
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of fastFocus
  		* @returns Boolean
  		*/
  var getFastFocus: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of focusCls
  		* @returns String
  		*/
  var getFocusCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pattern
  		* @returns String
  		*/
  var getPattern: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of startValue
  		* @returns Mixed
  		*/
  var getStartValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of tabIndex
  		* @returns Number
  		*/
  var getTabIndex: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns Mixed value The field value.
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its original value
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Input this
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
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fastFocus
  		* @param fastFocus Boolean The new value.
  		*/
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of focusCls
  		* @param focusCls String The new value.
  		*/
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pattern
  		* @param pattern String The new value.
  		*/
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of startValue
  		* @param startValue Mixed The new value.
  		*/
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Number The new value.
  		*/
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the cls configuration
  		* @param newCls Object
  		* @param oldCls Object
  		*/
  var updateCls: js.UndefOr[
    js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Updates the useMask configuration
  		* @param newUseMask Object
  		*/
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

