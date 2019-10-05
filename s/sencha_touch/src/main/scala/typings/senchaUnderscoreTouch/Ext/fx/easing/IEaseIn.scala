package typings.senchaUnderscoreTouch.Ext.fx.easing

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEaseIn extends ILinear {
  /** [Method] Returns the value of exponent
  		* @returns Number
  		*/
  var getExponent: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of exponent
  		* @param exponent Number The new value.
  		*/
  var setExponent: js.UndefOr[js.Function1[/* exponent */ js.UndefOr[Double], Unit]] = js.undefined
}

object IEaseIn {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getDuration: () => Double = null,
    getEndValue: () => Double = null,
    getExponent: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getStartTime: () => Double = null,
    getStartValue: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDuration: /* duration */ js.UndefOr[Double] => Unit = null,
    setEndValue: /* endValue */ js.UndefOr[Double] => Unit = null,
    setExponent: /* exponent */ js.UndefOr[Double] => Unit = null,
    setStartTime: /* startTime */ js.UndefOr[Double] => Unit = null,
    setStartValue: /* startValue */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEaseIn = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDuration != null) __obj.updateDynamic("getDuration")(js.Any.fromFunction0(getDuration))
    if (getEndValue != null) __obj.updateDynamic("getEndValue")(js.Any.fromFunction0(getEndValue))
    if (getExponent != null) __obj.updateDynamic("getExponent")(js.Any.fromFunction0(getExponent))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getStartTime != null) __obj.updateDynamic("getStartTime")(js.Any.fromFunction0(getStartTime))
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(js.Any.fromFunction0(getStartValue))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDuration != null) __obj.updateDynamic("setDuration")(js.Any.fromFunction1(setDuration))
    if (setEndValue != null) __obj.updateDynamic("setEndValue")(js.Any.fromFunction1(setEndValue))
    if (setExponent != null) __obj.updateDynamic("setExponent")(js.Any.fromFunction1(setExponent))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1(setStartTime))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1(setStartValue))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEaseIn]
  }
}

