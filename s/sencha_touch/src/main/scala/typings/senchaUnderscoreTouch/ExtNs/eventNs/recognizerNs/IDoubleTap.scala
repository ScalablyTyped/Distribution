package typings.senchaUnderscoreTouch.ExtNs.eventNs.recognizerNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDoubleTap extends IRecognizer {
  /** [Method] Returns the value of maxDuration
  		* @returns Number
  		*/
  var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of maxDuration
  		* @param maxDuration Number The new value.
  		*/
  var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.undefined
}

object IDoubleTap {
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
    getOnFailed: () => _ = null,
    getOnRecognized: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCallbackScope: /* callbackScope */ js.UndefOr[js.Any] => Unit = null,
    setMaxDuration: /* maxDuration */ js.UndefOr[Double] => Unit = null,
    setOnFailed: /* onFailed */ js.UndefOr[js.Any] => Unit = null,
    setOnRecognized: /* onRecognized */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDoubleTap = {
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
    if (getOnFailed != null) __obj.updateDynamic("getOnFailed")(js.Any.fromFunction0(getOnFailed))
    if (getOnRecognized != null) __obj.updateDynamic("getOnRecognized")(js.Any.fromFunction0(getOnRecognized))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCallbackScope != null) __obj.updateDynamic("setCallbackScope")(js.Any.fromFunction1(setCallbackScope))
    if (setMaxDuration != null) __obj.updateDynamic("setMaxDuration")(js.Any.fromFunction1(setMaxDuration))
    if (setOnFailed != null) __obj.updateDynamic("setOnFailed")(js.Any.fromFunction1(setOnFailed))
    if (setOnRecognized != null) __obj.updateDynamic("setOnRecognized")(js.Any.fromFunction1(setOnRecognized))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDoubleTap]
  }
}

