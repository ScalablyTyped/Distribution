package typings
package senchaUnderscoreTouchLib.ExtNs.eventNs.publisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchGesture
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of moveThrottle
  		* @returns Number
  		*/
  var getMoveThrottle: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of recognizers
  		* @returns Object
  		*/
  var getRecognizers: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of moveThrottle
  		* @param moveThrottle Number The new value.
  		*/
  var setMoveThrottle: js.UndefOr[js.Function1[/* moveThrottle */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of recognizers
  		* @param recognizers Object The new value.
  		*/
  var setRecognizers: js.UndefOr[js.Function1[/* recognizers */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ITouchGesture {
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
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMoveThrottle: js.Function0[scala.Double] = null,
    getRecognizers: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setMoveThrottle: js.Function1[/* moveThrottle */ js.UndefOr[scala.Double], scala.Unit] = null,
    setRecognizers: js.Function1[/* recognizers */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ITouchGesture = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMoveThrottle != null) __obj.updateDynamic("getMoveThrottle")(getMoveThrottle)
    if (getRecognizers != null) __obj.updateDynamic("getRecognizers")(getRecognizers)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setMoveThrottle != null) __obj.updateDynamic("setMoveThrottle")(setMoveThrottle)
    if (setRecognizers != null) __obj.updateDynamic("setRecognizers")(setRecognizers)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITouchGesture]
  }
}

