package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITwitter
  extends senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs.twitterNs.IAbstract

object ITwitter {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    compose: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getMentions: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getPublicTimeline: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getTwitterRequest: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getTwitterUsername: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ITwitter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (compose != null) __obj.updateDynamic("compose")(js.Any.fromFunction1(compose))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMentions != null) __obj.updateDynamic("getMentions")(js.Any.fromFunction1(getMentions))
    if (getPublicTimeline != null) __obj.updateDynamic("getPublicTimeline")(js.Any.fromFunction1(getPublicTimeline))
    if (getTwitterRequest != null) __obj.updateDynamic("getTwitterRequest")(js.Any.fromFunction1(getTwitterRequest))
    if (getTwitterUsername != null) __obj.updateDynamic("getTwitterUsername")(js.Any.fromFunction1(getTwitterUsername))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITwitter]
  }
}

