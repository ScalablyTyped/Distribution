package typings.senchaUnderscoreTouch.Ext.fx.easing

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMomentum extends IAbstract {
  /** [Method] Returns the value of acceleration
  		* @returns Number
  		*/
  var getAcceleration: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of friction
  		* @returns Number
  		*/
  var getFriction: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of acceleration
  		* @param acceleration Number The new value.
  		*/
  var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of friction
  		* @param friction Number The new value.
  		*/
  var setFriction: js.UndefOr[js.Function1[/* friction */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.undefined
}

object IMomentum {
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
    getAcceleration: () => Double = null,
    getFriction: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getStartTime: () => Double = null,
    getStartValue: () => Double = null,
    getStartVelocity: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAcceleration: /* acceleration */ js.UndefOr[Double] => Unit = null,
    setFriction: /* friction */ js.UndefOr[Double] => Unit = null,
    setStartTime: /* startTime */ js.UndefOr[Double] => Unit = null,
    setStartValue: /* startValue */ js.UndefOr[Double] => Unit = null,
    setStartVelocity: /* startVelocity */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IMomentum = {
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
    if (getFriction != null) __obj.updateDynamic("getFriction")(js.Any.fromFunction0(getFriction))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getStartTime != null) __obj.updateDynamic("getStartTime")(js.Any.fromFunction0(getStartTime))
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(js.Any.fromFunction0(getStartValue))
    if (getStartVelocity != null) __obj.updateDynamic("getStartVelocity")(js.Any.fromFunction0(getStartVelocity))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAcceleration != null) __obj.updateDynamic("setAcceleration")(js.Any.fromFunction1(setAcceleration))
    if (setFriction != null) __obj.updateDynamic("setFriction")(js.Any.fromFunction1(setFriction))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1(setStartTime))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1(setStartValue))
    if (setStartVelocity != null) __obj.updateDynamic("setStartVelocity")(js.Any.fromFunction1(setStartVelocity))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IMomentum]
  }
}

