package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle extends ISlider {
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
    ISlider: ISlider = null,
    activeLabel: java.lang.String = null,
    cls: java.lang.String = null,
    getActiveLabel: js.Function0[java.lang.String] = null,
    getCls: js.Function0[java.lang.String] = null,
    getInactiveLabel: js.Function0[java.lang.String] = null,
    getLabelAlign: js.Function0[java.lang.String] = null,
    getMaxValueCls: js.Function0[java.lang.String] = null,
    getMinValueCls: js.Function0[java.lang.String] = null,
    getValue: js.Function0[_] = null,
    inactiveLabel: java.lang.String = null,
    labelAlign: java.lang.String = null,
    maxValueCls: java.lang.String = null,
    minValueCls: java.lang.String = null,
    setActiveLabel: js.Function1[/* activeLabel */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setInactiveLabel: js.Function1[/* inactiveLabel */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLabelAlign: js.Function1[/* labelAlign */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMaxValueCls: js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMinValueCls: js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValue: js.Function1[/* newValue */ js.UndefOr[scala.Double], _] = null,
    toggle: js.Function0[_] = null
  ): IToggle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISlider)
    if (activeLabel != null) __obj.updateDynamic("activeLabel")(activeLabel)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getActiveLabel != null) __obj.updateDynamic("getActiveLabel")(getActiveLabel)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getInactiveLabel != null) __obj.updateDynamic("getInactiveLabel")(getInactiveLabel)
    if (getLabelAlign != null) __obj.updateDynamic("getLabelAlign")(getLabelAlign)
    if (getMaxValueCls != null) __obj.updateDynamic("getMaxValueCls")(getMaxValueCls)
    if (getMinValueCls != null) __obj.updateDynamic("getMinValueCls")(getMinValueCls)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (inactiveLabel != null) __obj.updateDynamic("inactiveLabel")(inactiveLabel)
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (maxValueCls != null) __obj.updateDynamic("maxValueCls")(maxValueCls)
    if (minValueCls != null) __obj.updateDynamic("minValueCls")(minValueCls)
    if (setActiveLabel != null) __obj.updateDynamic("setActiveLabel")(setActiveLabel)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setInactiveLabel != null) __obj.updateDynamic("setInactiveLabel")(setInactiveLabel)
    if (setLabelAlign != null) __obj.updateDynamic("setLabelAlign")(setLabelAlign)
    if (setMaxValueCls != null) __obj.updateDynamic("setMaxValueCls")(setMaxValueCls)
    if (setMinValueCls != null) __obj.updateDynamic("setMinValueCls")(setMinValueCls)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[IToggle]
  }
}

