package typings.senchaUnderscoreTouch.Ext.event.recognizer

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeSwipe extends ISwipe

object IEdgeSwipe {
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
    getCallbackScope: () => _ = null,
    getId: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getMaxDuration: () => Double = null,
    getMaxOffset: () => Double = null,
    getMinDistance: () => Double = null,
    getOnFailed: () => _ = null,
    getOnRecognized: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCallbackScope: /* callbackScope */ js.UndefOr[js.Any] => Unit = null,
    setMaxDuration: /* maxDuration */ js.UndefOr[Double] => Unit = null,
    setMaxOffset: /* maxOffset */ js.UndefOr[Double] => Unit = null,
    setMinDistance: /* minDistance */ js.UndefOr[Double] => Unit = null,
    setOnFailed: /* onFailed */ js.UndefOr[js.Any] => Unit = null,
    setOnRecognized: /* onRecognized */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEdgeSwipe = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCallbackScope != null) __obj.updateDynamic("getCallbackScope")(js.Any.fromFunction0(getCallbackScope))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMaxDuration != null) __obj.updateDynamic("getMaxDuration")(js.Any.fromFunction0(getMaxDuration))
    if (getMaxOffset != null) __obj.updateDynamic("getMaxOffset")(js.Any.fromFunction0(getMaxOffset))
    if (getMinDistance != null) __obj.updateDynamic("getMinDistance")(js.Any.fromFunction0(getMinDistance))
    if (getOnFailed != null) __obj.updateDynamic("getOnFailed")(js.Any.fromFunction0(getOnFailed))
    if (getOnRecognized != null) __obj.updateDynamic("getOnRecognized")(js.Any.fromFunction0(getOnRecognized))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCallbackScope != null) __obj.updateDynamic("setCallbackScope")(js.Any.fromFunction1(setCallbackScope))
    if (setMaxDuration != null) __obj.updateDynamic("setMaxDuration")(js.Any.fromFunction1(setMaxDuration))
    if (setMaxOffset != null) __obj.updateDynamic("setMaxOffset")(js.Any.fromFunction1(setMaxOffset))
    if (setMinDistance != null) __obj.updateDynamic("setMinDistance")(js.Any.fromFunction1(setMinDistance))
    if (setOnFailed != null) __obj.updateDynamic("setOnFailed")(js.Any.fromFunction1(setOnFailed))
    if (setOnRecognized != null) __obj.updateDynamic("setOnRecognized")(js.Any.fromFunction1(setOnRecognized))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEdgeSwipe]
  }
}

