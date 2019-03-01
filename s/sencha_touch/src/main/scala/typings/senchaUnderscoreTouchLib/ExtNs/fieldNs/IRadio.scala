package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio extends ICheckbox {
  /** [Method] Returns the selected value if this radio is part of a group other radio fields with the same name in the same FormP
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Set the matched radio field s status that has the same value as the given string to checked
  		* @param value String The value of the radio field to check.
  		* @returns Ext.field.Radio The field that is checked.
  		*/
  var setGroupValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Object
  		* @returns Ext.field.Radio this
  		*/
  @JSName("setValue")
  var setValue_IRadio: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
}

object IRadio {
  @scala.inline
  def apply(
    ICheckbox: ICheckbox = null,
    component: js.Any = null,
    getComponent: js.Function0[_] = null,
    getGroupValue: js.Function0[java.lang.String] = null,
    getSubmitValue: js.Function0[_] = null,
    getUi: js.Function0[java.lang.String] = null,
    getValue: js.Function0[java.lang.String] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setGroupValue: js.Function1[/* value */ js.UndefOr[java.lang.String], IRadio] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], IRadio] = null,
    ui: java.lang.String = null
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICheckbox)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getGroupValue != null) __obj.updateDynamic("getGroupValue")(getGroupValue)
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(getSubmitValue)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setGroupValue != null) __obj.updateDynamic("setGroupValue")(setGroupValue)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IRadio]
  }
}

