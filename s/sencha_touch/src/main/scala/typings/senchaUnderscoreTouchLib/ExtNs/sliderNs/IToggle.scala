package typings
package senchaUnderscoreTouchLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle extends ISlider {
  /** [Method] Sets the increment configuration
  		* @returns Number
  		*/
  @JSName("applyIncrement")
  var applyIncrement_IToggle: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object IToggle {
  @scala.inline
  def apply(
    ISlider: ISlider = null,
    applyIncrement: js.Function0[scala.Double] = null,
    baseCls: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getMaxValueCls: js.Function0[java.lang.String] = null,
    getMinValueCls: js.Function0[java.lang.String] = null,
    maxValueCls: java.lang.String = null,
    minValueCls: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMaxValueCls: js.Function1[/* maxValueCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMinValueCls: js.Function1[/* minValueCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValue: js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], scala.Unit] = null
  ): IToggle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISlider)
    if (applyIncrement != null) __obj.updateDynamic("applyIncrement")(applyIncrement)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getMaxValueCls != null) __obj.updateDynamic("getMaxValueCls")(getMaxValueCls)
    if (getMinValueCls != null) __obj.updateDynamic("getMinValueCls")(getMinValueCls)
    if (maxValueCls != null) __obj.updateDynamic("maxValueCls")(maxValueCls)
    if (minValueCls != null) __obj.updateDynamic("minValueCls")(minValueCls)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setMaxValueCls != null) __obj.updateDynamic("setMaxValueCls")(setMaxValueCls)
    if (setMinValueCls != null) __obj.updateDynamic("setMinValueCls")(setMinValueCls)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[IToggle]
  }
}

