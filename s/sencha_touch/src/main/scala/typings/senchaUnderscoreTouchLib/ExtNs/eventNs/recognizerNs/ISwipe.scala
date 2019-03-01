package typings
package senchaUnderscoreTouchLib.ExtNs.eventNs.recognizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwipe extends IRecognizer {
  /** [Method] Returns the value of maxDuration
  		* @returns Number
  		*/
  var getMaxDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxOffset
  		* @returns Number
  		*/
  var getMaxOffset: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minDistance
  		* @returns Number
  		*/
  var getMinDistance: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Sets the value of maxDuration
  		* @param maxDuration Number The new value.
  		*/
  var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxOffset
  		* @param maxOffset Number The new value.
  		*/
  var setMaxOffset: js.UndefOr[js.Function1[/* maxOffset */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minDistance
  		* @param minDistance Number The new value.
  		*/
  var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ISwipe {
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
    getCallbackScope: js.Function0[_] = null,
    getId: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMaxDuration: js.Function0[scala.Double] = null,
    getMaxOffset: js.Function0[scala.Double] = null,
    getMinDistance: js.Function0[scala.Double] = null,
    getOnFailed: js.Function0[_] = null,
    getOnRecognized: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setCallbackScope: js.Function1[/* callbackScope */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxDuration: js.Function1[/* maxDuration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaxOffset: js.Function1[/* maxOffset */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinDistance: js.Function1[/* minDistance */ js.UndefOr[scala.Double], scala.Unit] = null,
    setOnFailed: js.Function1[/* onFailed */ js.UndefOr[js.Any], scala.Unit] = null,
    setOnRecognized: js.Function1[/* onRecognized */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISwipe = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCallbackScope != null) __obj.updateDynamic("getCallbackScope")(getCallbackScope)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMaxDuration != null) __obj.updateDynamic("getMaxDuration")(getMaxDuration)
    if (getMaxOffset != null) __obj.updateDynamic("getMaxOffset")(getMaxOffset)
    if (getMinDistance != null) __obj.updateDynamic("getMinDistance")(getMinDistance)
    if (getOnFailed != null) __obj.updateDynamic("getOnFailed")(getOnFailed)
    if (getOnRecognized != null) __obj.updateDynamic("getOnRecognized")(getOnRecognized)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCallbackScope != null) __obj.updateDynamic("setCallbackScope")(setCallbackScope)
    if (setMaxDuration != null) __obj.updateDynamic("setMaxDuration")(setMaxDuration)
    if (setMaxOffset != null) __obj.updateDynamic("setMaxOffset")(setMaxOffset)
    if (setMinDistance != null) __obj.updateDynamic("setMinDistance")(setMinDistance)
    if (setOnFailed != null) __obj.updateDynamic("setOnFailed")(setOnFailed)
    if (setOnRecognized != null) __obj.updateDynamic("setOnRecognized")(setOnRecognized)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISwipe]
  }
}

