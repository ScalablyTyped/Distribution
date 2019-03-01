package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs.twitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Pops up a Twitter compose sheet view with your specified tweet
  		* @param config Object An object which contains the following config options:
  		*/
  var compose: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Gets Tweets from Twitter Mentions
  		* @param config Object An object which contains the following config options:
  		*/
  var getMentions: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Gets Tweets from Twitter Timeline
  		* @param config Object An object which contains the following config options:
  		*/
  var getPublicTimeline: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Gets a specific Twitter user info
  		* @param config Object An object which contains the following config options:
  		*/
  var getTwitterRequest: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Gets a specific Twitter user info
  		* @param config Object An object which contains the following config options:
  		*/
  var getTwitterUsername: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    compose: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMentions: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getPublicTimeline: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getTwitterRequest: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getTwitterUsername: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (compose != null) __obj.updateDynamic("compose")(compose)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMentions != null) __obj.updateDynamic("getMentions")(getMentions)
    if (getPublicTimeline != null) __obj.updateDynamic("getPublicTimeline")(getPublicTimeline)
    if (getTwitterRequest != null) __obj.updateDynamic("getTwitterRequest")(getTwitterRequest)
    if (getTwitterUsername != null) __obj.updateDynamic("getTwitterUsername")(getTwitterUsername)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

