package typings
package senchaUnderscoreTouchLib.ExtNs.navigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar
  extends senchaUnderscoreTouchLib.ExtNs.ITitleBar {
  /** [Config Option] (Boolean) */
  var androidAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IBar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of androidAnimation
  		* @returns Boolean
  		*/
  var getAndroidAnimation: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Sets the value of androidAnimation
  		* @param androidAnimation Boolean The new value.
  		*/
  var setAndroidAnimation: js.UndefOr[js.Function1[/* androidAnimation */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object IBar {
  @scala.inline
  def apply(
    ITitleBar: senchaUnderscoreTouchLib.ExtNs.ITitleBar = null,
    androidAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    cls: java.lang.String = null,
    getAndroidAnimation: () => scala.Boolean = null,
    getBaseCls: () => java.lang.String = null,
    getCls: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    setAndroidAnimation: /* androidAnimation */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    ui: java.lang.String = null
  ): IBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITitleBar)
    if (!js.isUndefined(androidAnimation)) __obj.updateDynamic("androidAnimation")(androidAnimation)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getAndroidAnimation != null) __obj.updateDynamic("getAndroidAnimation")(js.Any.fromFunction0(getAndroidAnimation))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (setAndroidAnimation != null) __obj.updateDynamic("setAndroidAnimation")(js.Any.fromFunction1(setAndroidAnimation))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IBar]
  }
}

