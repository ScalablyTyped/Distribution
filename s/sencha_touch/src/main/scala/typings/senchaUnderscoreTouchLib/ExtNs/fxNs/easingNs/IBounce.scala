package typings
package senchaUnderscoreTouchLib.ExtNs.fxNs.easingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBounce extends IAbstract {
  /** [Method] Returns the value of acceleration
  		* @returns Number
  		*/
  var getAcceleration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of springTension
  		* @returns Number
  		*/
  var getSpringTension: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Sets the value of acceleration
  		* @param acceleration Number The new value.
  		*/
  var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of springTension
  		* @param springTension Number The new value.
  		*/
  var setSpringTension: js.UndefOr[js.Function1[/* springTension */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object IBounce {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getAcceleration: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getSpringTension: () => scala.Double = null,
    getStartTime: () => scala.Double = null,
    getStartValue: () => scala.Double = null,
    getStartVelocity: () => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAcceleration: /* acceleration */ js.UndefOr[scala.Double] => scala.Unit = null,
    setSpringTension: /* springTension */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStartTime: /* startTime */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStartValue: /* startValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStartVelocity: /* startVelocity */ js.UndefOr[scala.Double] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IBounce = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAcceleration != null) __obj.updateDynamic("getAcceleration")(js.Any.fromFunction0(getAcceleration))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getSpringTension != null) __obj.updateDynamic("getSpringTension")(js.Any.fromFunction0(getSpringTension))
    if (getStartTime != null) __obj.updateDynamic("getStartTime")(js.Any.fromFunction0(getStartTime))
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(js.Any.fromFunction0(getStartValue))
    if (getStartVelocity != null) __obj.updateDynamic("getStartVelocity")(js.Any.fromFunction0(getStartVelocity))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAcceleration != null) __obj.updateDynamic("setAcceleration")(js.Any.fromFunction1(setAcceleration))
    if (setSpringTension != null) __obj.updateDynamic("setSpringTension")(js.Any.fromFunction1(setSpringTension))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1(setStartTime))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1(setStartValue))
    if (setStartVelocity != null) __obj.updateDynamic("setStartVelocity")(js.Any.fromFunction1(setStartVelocity))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBounce]
  }
}

