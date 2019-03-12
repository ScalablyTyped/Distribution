package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.gradientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadial extends IGradient {
  /** [Config Option] (Object) */
  var end: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of end
  		* @returns Object
  		*/
  var getEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of start
  		* @returns Object
  		*/
  var getStart: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of end
  		* @param end Object The new value.
  		*/
  var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of start
  		* @param start Object The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var start: js.UndefOr[js.Any] = js.undefined
}

object IRadial {
  @scala.inline
  def apply(
    Defines: js.Any = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    end: js.Any = null,
    extend: java.lang.String = null,
    generateGradient: (/* ctx */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs.ISvgContext], /* bbox */ js.UndefOr[js.Any]) => _ = null,
    getEnd: () => _ = null,
    getId: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getStart: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setEnd: /* end */ js.UndefOr[js.Any] => scala.Unit = null,
    setStart: /* start */ js.UndefOr[js.Any] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Any = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IRadial = {
    val __obj = js.Dynamic.literal()
    if (Defines != null) __obj.updateDynamic("Defines")(Defines)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (end != null) __obj.updateDynamic("end")(end)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (generateGradient != null) __obj.updateDynamic("generateGradient")(js.Any.fromFunction2(generateGradient))
    if (getEnd != null) __obj.updateDynamic("getEnd")(js.Any.fromFunction0(getEnd))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getStart != null) __obj.updateDynamic("getStart")(js.Any.fromFunction0(getStart))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setEnd != null) __obj.updateDynamic("setEnd")(js.Any.fromFunction1(setEnd))
    if (setStart != null) __obj.updateDynamic("setStart")(js.Any.fromFunction1(setStart))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (start != null) __obj.updateDynamic("start")(start)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRadial]
  }
}

