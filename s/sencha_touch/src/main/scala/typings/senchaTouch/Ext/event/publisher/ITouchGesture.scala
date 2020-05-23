package typings.senchaTouch.Ext.event.publisher

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchGesture extends IBase {
  /** [Method] Returns the value of moveThrottle
    * @returns Number
    */
  var getMoveThrottle: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of recognizers
    * @returns Object
    */
  var getRecognizers: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of moveThrottle
    * @param moveThrottle Number The new value.
    */
  var setMoveThrottle: js.UndefOr[js.Function1[/* moveThrottle */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of recognizers
    * @param recognizers Object The new value.
    */
  var setRecognizers: js.UndefOr[js.Function1[/* recognizers */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ITouchGesture {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getMoveThrottle: () => Double = null,
    getRecognizers: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setMoveThrottle: /* moveThrottle */ js.UndefOr[Double] => Unit = null,
    setRecognizers: /* recognizers */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITouchGesture = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMoveThrottle != null) __obj.updateDynamic("getMoveThrottle")(js.Any.fromFunction0(getMoveThrottle))
    if (getRecognizers != null) __obj.updateDynamic("getRecognizers")(js.Any.fromFunction0(getRecognizers))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setMoveThrottle != null) __obj.updateDynamic("setMoveThrottle")(js.Any.fromFunction1(setMoveThrottle))
    if (setRecognizers != null) __obj.updateDynamic("setRecognizers")(js.Any.fromFunction1(setRecognizers))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchGesture]
  }
}

