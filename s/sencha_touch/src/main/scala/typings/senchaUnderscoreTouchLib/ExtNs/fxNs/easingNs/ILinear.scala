package typings
package senchaUnderscoreTouchLib.ExtNs.fxNs.easingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinear extends IAbstract {
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of endValue
  		* @returns Number
  		*/
  var getEndValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of endValue
  		* @param endValue Number The new value.
  		*/
  var setEndValue: js.UndefOr[js.Function1[/* endValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ILinear {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getDuration: js.Function0[scala.Double] = null,
    getEndValue: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getStartTime: js.Function0[scala.Double] = null,
    getStartValue: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDuration: js.Function1[/* duration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setEndValue: js.Function1[/* endValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStartTime: js.Function1[/* startTime */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStartValue: js.Function1[/* startValue */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ILinear = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDuration != null) __obj.updateDynamic("getDuration")(getDuration)
    if (getEndValue != null) __obj.updateDynamic("getEndValue")(getEndValue)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getStartTime != null) __obj.updateDynamic("getStartTime")(getStartTime)
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(getStartValue)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDuration != null) __obj.updateDynamic("setDuration")(setDuration)
    if (setEndValue != null) __obj.updateDynamic("setEndValue")(setEndValue)
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(setStartTime)
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(setStartValue)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILinear]
  }
}

