package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalytics
  extends senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs.analyticsNs.IAbstract

object IAnalytics {
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
    getAccountID: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    registerAccount: js.Function1[/* accountID */ js.UndefOr[java.lang.String], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAccountID: js.Function1[/* accountID */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    trackEvent: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    trackPageview: js.Function1[/* config */ js.UndefOr[java.lang.String], scala.Unit] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAnalytics = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAccountID != null) __obj.updateDynamic("getAccountID")(getAccountID)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (registerAccount != null) __obj.updateDynamic("registerAccount")(registerAccount)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAccountID != null) __obj.updateDynamic("setAccountID")(setAccountID)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (trackEvent != null) __obj.updateDynamic("trackEvent")(trackEvent)
    if (trackPageview != null) __obj.updateDynamic("trackPageview")(trackPageview)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAnalytics]
  }
}

