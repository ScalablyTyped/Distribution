package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.ISlider {
  /** [Config Option] (String) */
  var activeLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IToggle: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of activeLabel
  		* @returns String
  		*/
  var getActiveLabel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of inactiveLabel
  		* @returns String
  		*/
  var getInactiveLabel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var inactiveLabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of activeLabel
  		* @param activeLabel String The new value.
  		*/
  var setActiveLabel: js.UndefOr[js.Function1[/* activeLabel */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of inactiveLabel
  		* @param inactiveLabel String The new value.
  		*/
  var setInactiveLabel: js.UndefOr[js.Function1[/* inactiveLabel */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of the toggle
  		* @param newValue Number 1 for toggled, 0 for untoggled.
  		* @returns Object this
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Toggles the value of this toggle field
  		* @returns Object this
  		*/
  var toggle: js.UndefOr[js.Function0[_]] = js.undefined
}

object IToggle {
  @scala.inline
  def apply(
    ISlider: senchaUnderscoreTouchLib.ExtNs.fieldNs.ISlider = null,
    activeLabel: java.lang.String = null,
    cls: java.lang.String = null,
    getActiveLabel: () => java.lang.String = null,
    getCls: () => java.lang.String = null,
    getInactiveLabel: () => java.lang.String = null,
    getLabelAlign: () => java.lang.String = null,
    getMaxValueCls: () => java.lang.String = null,
    getMinValueCls: () => java.lang.String = null,
    getValue: () => _ = null,
    inactiveLabel: java.lang.String = null,
    labelAlign: java.lang.String = null,
    maxValueCls: java.lang.String = null,
    minValueCls: java.lang.String = null,
    setActiveLabel: /* activeLabel */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setInactiveLabel: /* inactiveLabel */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLabelAlign: /* labelAlign */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setMaxValueCls: /* maxValueCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setMinValueCls: /* minValueCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setValue: /* newValue */ js.UndefOr[scala.Double] => _ = null,
    toggle: () => _ = null
  ): IToggle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISlider)
    if (activeLabel != null) __obj.updateDynamic("activeLabel")(activeLabel)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getActiveLabel != null) __obj.updateDynamic("getActiveLabel")(js.Any.fromFunction0(getActiveLabel))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getInactiveLabel != null) __obj.updateDynamic("getInactiveLabel")(js.Any.fromFunction0(getInactiveLabel))
    if (getLabelAlign != null) __obj.updateDynamic("getLabelAlign")(js.Any.fromFunction0(getLabelAlign))
    if (getMaxValueCls != null) __obj.updateDynamic("getMaxValueCls")(js.Any.fromFunction0(getMaxValueCls))
    if (getMinValueCls != null) __obj.updateDynamic("getMinValueCls")(js.Any.fromFunction0(getMinValueCls))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (inactiveLabel != null) __obj.updateDynamic("inactiveLabel")(inactiveLabel)
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (maxValueCls != null) __obj.updateDynamic("maxValueCls")(maxValueCls)
    if (minValueCls != null) __obj.updateDynamic("minValueCls")(minValueCls)
    if (setActiveLabel != null) __obj.updateDynamic("setActiveLabel")(js.Any.fromFunction1(setActiveLabel))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setInactiveLabel != null) __obj.updateDynamic("setInactiveLabel")(js.Any.fromFunction1(setInactiveLabel))
    if (setLabelAlign != null) __obj.updateDynamic("setLabelAlign")(js.Any.fromFunction1(setLabelAlign))
    if (setMaxValueCls != null) __obj.updateDynamic("setMaxValueCls")(js.Any.fromFunction1(setMaxValueCls))
    if (setMinValueCls != null) __obj.updateDynamic("setMinValueCls")(js.Any.fromFunction1(setMinValueCls))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[IToggle]
  }
}

