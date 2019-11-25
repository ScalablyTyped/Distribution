package typings.senchaUnderscoreTouch.Ext.ux.device.analytics

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICordova extends IAbstract {
  /** [Method] Track an pageview in your application
  		* @param page Object
  		*/
  @JSName("trackPageview")
  var trackPageview_ICordova: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ICordova {
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
    getAccountID: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    registerAccount: /* accountID */ js.UndefOr[java.lang.String] => Unit = null,
    self: IClass = null,
    setAccountID: /* accountID */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    trackEvent: /* config */ js.UndefOr[js.Any] => Unit = null,
    trackPageview: /* page */ js.UndefOr[js.Any] => Unit = null,
    uses: Array = null
  ): ICordova = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAccountID != null) __obj.updateDynamic("getAccountID")(js.Any.fromFunction0(getAccountID))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (registerAccount != null) __obj.updateDynamic("registerAccount")(js.Any.fromFunction1(registerAccount))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAccountID != null) __obj.updateDynamic("setAccountID")(js.Any.fromFunction1(setAccountID))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (trackEvent != null) __obj.updateDynamic("trackEvent")(js.Any.fromFunction1(trackEvent))
    if (trackPageview != null) __obj.updateDynamic("trackPageview")(js.Any.fromFunction1(trackPageview))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICordova]
  }
}

