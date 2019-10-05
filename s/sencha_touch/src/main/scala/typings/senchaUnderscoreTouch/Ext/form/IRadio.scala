package typings.senchaUnderscoreTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio
  extends typings.senchaUnderscoreTouch.Ext.field.ICheckbox {
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
    ICheckbox: typings.senchaUnderscoreTouch.Ext.field.ICheckbox = null,
    component: js.Any = null,
    getComponent: () => _ = null,
    getGroupValue: () => java.lang.String = null,
    getSubmitValue: () => _ = null,
    getUi: () => java.lang.String = null,
    getValue: () => java.lang.String = null,
    setComponent: /* component */ js.UndefOr[js.Any] => Unit = null,
    setGroupValue: /* value */ js.UndefOr[java.lang.String] => IRadio = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => IRadio = null,
    ui: java.lang.String = null
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICheckbox)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getGroupValue != null) __obj.updateDynamic("getGroupValue")(js.Any.fromFunction0(getGroupValue))
    if (getSubmitValue != null) __obj.updateDynamic("getSubmitValue")(js.Any.fromFunction0(getSubmitValue))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setGroupValue != null) __obj.updateDynamic("setGroupValue")(js.Any.fromFunction1(setGroupValue))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IRadio]
  }
}

