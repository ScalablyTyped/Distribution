package typings
package senchaUnderscoreTouchLib.ExtNs.fxNs.easingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoundMomentum extends IAbstract {
  /** [Config Option] (Object) */
  var bounce: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of bounce
  		* @returns Object
  		*/
  var getBounce: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxMomentumValue
  		* @returns Number
  		*/
  var getMaxMomentumValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minMomentumValue
  		* @returns Number
  		*/
  var getMinMomentumValue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minVelocity
  		* @returns Number
  		*/
  var getMinVelocity: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of momentum
  		* @returns Object
  		*/
  var getMomentum: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var minVelocity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var momentum: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of bounce
  		* @param bounce Object The new value.
  		*/
  var setBounce: js.UndefOr[js.Function1[/* bounce */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxMomentumValue
  		* @param maxMomentumValue Number The new value.
  		*/
  var setMaxMomentumValue: js.UndefOr[js.Function1[/* maxMomentumValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minMomentumValue
  		* @param minMomentumValue Number The new value.
  		*/
  var setMinMomentumValue: js.UndefOr[js.Function1[/* minMomentumValue */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minVelocity
  		* @param minVelocity Number The new value.
  		*/
  var setMinVelocity: js.UndefOr[js.Function1[/* minVelocity */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of momentum
  		* @param momentum Object The new value.
  		*/
  var setMomentum: js.UndefOr[js.Function1[/* momentum */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var startVelocity: js.UndefOr[scala.Double] = js.undefined
}

object IBoundMomentum {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    bounce: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getBounce: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getMaxMomentumValue: () => scala.Double = null,
    getMinMomentumValue: () => scala.Double = null,
    getMinVelocity: () => scala.Double = null,
    getMomentum: () => _ = null,
    getStartTime: () => scala.Double = null,
    getStartValue: () => scala.Double = null,
    getStartVelocity: () => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    minVelocity: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    momentum: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBounce: /* bounce */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxMomentumValue: /* maxMomentumValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinMomentumValue: /* minMomentumValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinVelocity: /* minVelocity */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMomentum: /* momentum */ js.UndefOr[js.Any] => scala.Unit = null,
    setStartTime: /* startTime */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStartValue: /* startValue */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStartVelocity: /* startVelocity */ js.UndefOr[scala.Double] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startVelocity: scala.Int | scala.Double = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IBoundMomentum = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bounce != null) __obj.updateDynamic("bounce")(bounce)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getBounce != null) __obj.updateDynamic("getBounce")(js.Any.fromFunction0(getBounce))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMaxMomentumValue != null) __obj.updateDynamic("getMaxMomentumValue")(js.Any.fromFunction0(getMaxMomentumValue))
    if (getMinMomentumValue != null) __obj.updateDynamic("getMinMomentumValue")(js.Any.fromFunction0(getMinMomentumValue))
    if (getMinVelocity != null) __obj.updateDynamic("getMinVelocity")(js.Any.fromFunction0(getMinVelocity))
    if (getMomentum != null) __obj.updateDynamic("getMomentum")(js.Any.fromFunction0(getMomentum))
    if (getStartTime != null) __obj.updateDynamic("getStartTime")(js.Any.fromFunction0(getStartTime))
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(js.Any.fromFunction0(getStartValue))
    if (getStartVelocity != null) __obj.updateDynamic("getStartVelocity")(js.Any.fromFunction0(getStartVelocity))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (minVelocity != null) __obj.updateDynamic("minVelocity")(minVelocity.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (momentum != null) __obj.updateDynamic("momentum")(momentum)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBounce != null) __obj.updateDynamic("setBounce")(js.Any.fromFunction1(setBounce))
    if (setMaxMomentumValue != null) __obj.updateDynamic("setMaxMomentumValue")(js.Any.fromFunction1(setMaxMomentumValue))
    if (setMinMomentumValue != null) __obj.updateDynamic("setMinMomentumValue")(js.Any.fromFunction1(setMinMomentumValue))
    if (setMinVelocity != null) __obj.updateDynamic("setMinVelocity")(js.Any.fromFunction1(setMinVelocity))
    if (setMomentum != null) __obj.updateDynamic("setMomentum")(js.Any.fromFunction1(setMomentum))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1(setStartTime))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1(setStartValue))
    if (setStartVelocity != null) __obj.updateDynamic("setStartVelocity")(js.Any.fromFunction1(setStartVelocity))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startVelocity != null) __obj.updateDynamic("startVelocity")(startVelocity.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBoundMomentum]
  }
}

