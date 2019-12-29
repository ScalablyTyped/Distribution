package typings.senchaUnderscoreTouch.Ext.fx.easing

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Returns the value of startTime
  		* @returns Number
  		*/
  var getStartTime: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of startValue
  		* @returns Number
  		*/
  var getStartValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of startTime
  		* @param startTime Number The new value.
  		*/
  var setStartTime: js.UndefOr[js.Function1[/* startTime */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of startValue
  		* @param startValue Number The new value.
  		*/
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[Double], Unit]] = js.undefined
}

object IAbstract {
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
    getStartTime: () => Double = null,
    getStartValue: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setStartTime: /* startTime */ js.UndefOr[Double] => Unit = null,
    setStartValue: /* startValue */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstract = {
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
    if (getStartTime != null) __obj.updateDynamic("getStartTime")(js.Any.fromFunction0(getStartTime))
    if (getStartValue != null) __obj.updateDynamic("getStartValue")(js.Any.fromFunction0(getStartValue))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1(setStartTime))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1(setStartValue))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstract]
  }
}

