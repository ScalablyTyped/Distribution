package typings.senchaUnderscoreTouch.Ext.ux.device

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.ux.device.twitter.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITwitter extends IAbstract

object ITwitter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    compose: /* config */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getMentions: /* config */ js.UndefOr[js.Any] => Unit = null,
    getPublicTimeline: /* config */ js.UndefOr[js.Any] => Unit = null,
    getTwitterRequest: /* config */ js.UndefOr[js.Any] => Unit = null,
    getTwitterUsername: /* config */ js.UndefOr[js.Any] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITwitter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (compose != null) __obj.updateDynamic("compose")(js.Any.fromFunction1(compose))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMentions != null) __obj.updateDynamic("getMentions")(js.Any.fromFunction1(getMentions))
    if (getPublicTimeline != null) __obj.updateDynamic("getPublicTimeline")(js.Any.fromFunction1(getPublicTimeline))
    if (getTwitterRequest != null) __obj.updateDynamic("getTwitterRequest")(js.Any.fromFunction1(getTwitterRequest))
    if (getTwitterUsername != null) __obj.updateDynamic("getTwitterUsername")(js.Any.fromFunction1(getTwitterUsername))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITwitter]
  }
}

