package typings.senchaUnderscoreTouch.Ext.fx.animation

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.fx.IAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWipe extends IAnimation {
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of easing
  		* @returns String
  		*/
  var getEasing: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of out
  		* @returns Boolean
  		*/
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of easing
  		* @param easing String The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of out
  		* @param out Boolean The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IWipe {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    direction: java.lang.String = null,
    easing: java.lang.String = null,
    extend: java.lang.String = null,
    getDirection: () => java.lang.String = null,
    getEasing: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getOut: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    out: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[java.lang.String] => Unit = null,
    setEasing: /* easing */ js.UndefOr[java.lang.String] => Unit = null,
    setOut: /* out */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: java.lang.String = null,
    uses: Array = null
  ): IWipe = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDirection != null) __obj.updateDynamic("getDirection")(js.Any.fromFunction0(getDirection))
    if (getEasing != null) __obj.updateDynamic("getEasing")(js.Any.fromFunction0(getEasing))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getOut != null) __obj.updateDynamic("getOut")(js.Any.fromFunction0(getOut))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (setEasing != null) __obj.updateDynamic("setEasing")(js.Any.fromFunction1(setEasing))
    if (setOut != null) __obj.updateDynamic("setOut")(js.Any.fromFunction1(setOut))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IWipe]
  }
}

