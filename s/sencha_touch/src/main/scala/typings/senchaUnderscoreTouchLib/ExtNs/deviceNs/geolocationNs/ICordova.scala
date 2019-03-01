package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.geolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICordova extends IAbstract

object ICordova {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    allowHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearWatch: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    frequency: scala.Int | scala.Double = null,
    getAllowHighAccuracy: js.Function0[scala.Boolean] = null,
    getCurrentPosition: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getFrequency: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMaximumAge: js.Function0[scala.Double] = null,
    getTimeout: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    maximumAge: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAllowHighAccuracy: js.Function1[/* allowHighAccuracy */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFrequency: js.Function1[/* frequency */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaximumAge: js.Function1[/* maximumAge */ js.UndefOr[scala.Double], scala.Unit] = null,
    setTimeout: js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    watchPosition: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null
  ): ICordova = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowHighAccuracy)) __obj.updateDynamic("allowHighAccuracy")(allowHighAccuracy)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearWatch != null) __obj.updateDynamic("clearWatch")(clearWatch)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (getAllowHighAccuracy != null) __obj.updateDynamic("getAllowHighAccuracy")(getAllowHighAccuracy)
    if (getCurrentPosition != null) __obj.updateDynamic("getCurrentPosition")(getCurrentPosition)
    if (getFrequency != null) __obj.updateDynamic("getFrequency")(getFrequency)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMaximumAge != null) __obj.updateDynamic("getMaximumAge")(getMaximumAge)
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(getTimeout)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAllowHighAccuracy != null) __obj.updateDynamic("setAllowHighAccuracy")(setAllowHighAccuracy)
    if (setFrequency != null) __obj.updateDynamic("setFrequency")(setFrequency)
    if (setMaximumAge != null) __obj.updateDynamic("setMaximumAge")(setMaximumAge)
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(setTimeout)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (watchPosition != null) __obj.updateDynamic("watchPosition")(watchPosition)
    __obj.asInstanceOf[ICordova]
  }
}

