package typings.senchaUnderscoreTouch.Ext.draw.gradient

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.draw.engine.ISvgContext
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
  var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of start
  		* @param start Object The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var start: js.UndefOr[js.Any] = js.undefined
}

object IRadial {
  @scala.inline
  def apply(
    Defines: js.Any = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    end: js.Any = null,
    extend: String = null,
    generateGradient: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any]) => _ = null,
    getEnd: () => _ = null,
    getId: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getStart: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setEnd: /* end */ js.UndefOr[js.Any] => Unit = null,
    setStart: /* start */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    start: js.Any = null,
    statics: js.Any = null,
    uses: Array = null
  ): IRadial = {
    val __obj = js.Dynamic.literal()
    if (Defines != null) __obj.updateDynamic("Defines")(Defines.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (generateGradient != null) __obj.updateDynamic("generateGradient")(js.Any.fromFunction2(generateGradient))
    if (getEnd != null) __obj.updateDynamic("getEnd")(js.Any.fromFunction0(getEnd))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getStart != null) __obj.updateDynamic("getStart")(js.Any.fromFunction0(getStart))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setEnd != null) __obj.updateDynamic("setEnd")(js.Any.fromFunction1(setEnd))
    if (setStart != null) __obj.updateDynamic("setStart")(js.Any.fromFunction1(setStart))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadial]
  }
}

