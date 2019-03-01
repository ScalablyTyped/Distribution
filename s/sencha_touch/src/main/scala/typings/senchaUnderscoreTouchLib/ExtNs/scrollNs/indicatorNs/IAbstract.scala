package typings
package senchaUnderscoreTouchLib.ExtNs.scrollNs.indicatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of active
  		* @returns Boolean
  		*/
  var getActive: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoHide
  		* @returns Boolean
  		*/
  var getAutoHide: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of axis
  		* @returns String
  		*/
  var getAxis: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of barCls
  		* @returns String
  		*/
  var getBarCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of length
  		* @returns Object
  		*/
  var getLength: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minLength
  		* @returns Number
  		*/
  var getMinLength: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of ratio
  		* @returns Number
  		*/
  var getRatio: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns Object
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of active
  		* @param active Boolean The new value.
  		*/
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoHide
  		* @param autoHide Boolean The new value.
  		*/
  var setAutoHide: js.UndefOr[js.Function1[/* autoHide */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of axis
  		* @param axis String The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of barCls
  		* @param barCls String The new value.
  		*/
  var setBarCls: js.UndefOr[js.Function1[/* barCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of length
  		* @param length Object The new value.
  		*/
  var setLength: js.UndefOr[js.Function1[/* length */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minLength
  		* @param minLength Number The new value.
  		*/
  var setMinLength: js.UndefOr[js.Function1[/* minLength */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of ratio
  		* @param ratio Number The new value.
  		*/
  var setRatio: js.UndefOr[js.Function1[/* ratio */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Object The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    getActive: js.Function0[scala.Boolean] = null,
    getAutoHide: js.Function0[scala.Boolean] = null,
    getAxis: js.Function0[java.lang.String] = null,
    getBarCls: js.Function0[java.lang.String] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getHidden: js.Function0[scala.Boolean] = null,
    getLength: js.Function0[_] = null,
    getMinLength: js.Function0[scala.Double] = null,
    getRatio: js.Function0[scala.Double] = null,
    getUi: js.Function0[java.lang.String] = null,
    getValue: js.Function0[_] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    setActive: js.Function1[/* active */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoHide: js.Function1[/* autoHide */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAxis: js.Function1[/* axis */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBarCls: js.Function1[/* barCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHidden: js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLength: js.Function1[/* length */ js.UndefOr[js.Any], scala.Unit] = null,
    setMinLength: js.Function1[/* minLength */ js.UndefOr[scala.Double], scala.Unit] = null,
    setRatio: js.Function1[/* ratio */ js.UndefOr[scala.Double], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    ui: java.lang.String = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getActive != null) __obj.updateDynamic("getActive")(getActive)
    if (getAutoHide != null) __obj.updateDynamic("getAutoHide")(getAutoHide)
    if (getAxis != null) __obj.updateDynamic("getAxis")(getAxis)
    if (getBarCls != null) __obj.updateDynamic("getBarCls")(getBarCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getHidden != null) __obj.updateDynamic("getHidden")(getHidden)
    if (getLength != null) __obj.updateDynamic("getLength")(getLength)
    if (getMinLength != null) __obj.updateDynamic("getMinLength")(getMinLength)
    if (getRatio != null) __obj.updateDynamic("getRatio")(getRatio)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (setActive != null) __obj.updateDynamic("setActive")(setActive)
    if (setAutoHide != null) __obj.updateDynamic("setAutoHide")(setAutoHide)
    if (setAxis != null) __obj.updateDynamic("setAxis")(setAxis)
    if (setBarCls != null) __obj.updateDynamic("setBarCls")(setBarCls)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setHidden != null) __obj.updateDynamic("setHidden")(setHidden)
    if (setLength != null) __obj.updateDynamic("setLength")(setLength)
    if (setMinLength != null) __obj.updateDynamic("setMinLength")(setMinLength)
    if (setRatio != null) __obj.updateDynamic("setRatio")(setRatio)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IAbstract]
  }
}

