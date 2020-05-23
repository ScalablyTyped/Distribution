package typings.senchaTouch.Ext.device.geolocation

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISencha extends IAbstract

object ISencha {
  @scala.inline
  def apply(
    alias: Array = null,
    allowHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearWatch: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    frequency: js.UndefOr[Double] = js.undefined,
    getAllowHighAccuracy: () => Boolean = null,
    getCurrentPosition: /* config */ js.UndefOr[js.Any] => Unit = null,
    getFrequency: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getMaximumAge: () => Double = null,
    getTimeout: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    maximumAge: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAllowHighAccuracy: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit = null,
    setFrequency: /* frequency */ js.UndefOr[Double] => Unit = null,
    setMaximumAge: /* maximumAge */ js.UndefOr[Double] => Unit = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined,
    uses: Array = null,
    watchPosition: /* config */ js.UndefOr[js.Any] => Unit = null
  ): ISencha = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHighAccuracy)) __obj.updateDynamic("allowHighAccuracy")(allowHighAccuracy.get.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearWatch != null) __obj.updateDynamic("clearWatch")(js.Any.fromFunction0(clearWatch))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (getAllowHighAccuracy != null) __obj.updateDynamic("getAllowHighAccuracy")(js.Any.fromFunction0(getAllowHighAccuracy))
    if (getCurrentPosition != null) __obj.updateDynamic("getCurrentPosition")(js.Any.fromFunction1(getCurrentPosition))
    if (getFrequency != null) __obj.updateDynamic("getFrequency")(js.Any.fromFunction0(getFrequency))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMaximumAge != null) __obj.updateDynamic("getMaximumAge")(js.Any.fromFunction0(getMaximumAge))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(maximumAge)) __obj.updateDynamic("maximumAge")(maximumAge.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowHighAccuracy != null) __obj.updateDynamic("setAllowHighAccuracy")(js.Any.fromFunction1(setAllowHighAccuracy))
    if (setFrequency != null) __obj.updateDynamic("setFrequency")(js.Any.fromFunction1(setFrequency))
    if (setMaximumAge != null) __obj.updateDynamic("setMaximumAge")(js.Any.fromFunction1(setMaximumAge))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (watchPosition != null) __obj.updateDynamic("watchPosition")(js.Any.fromFunction1(watchPosition))
    __obj.asInstanceOf[ISencha]
  }
}

