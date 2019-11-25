package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask extends IBase {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Cancels any pending timeout and queues a new one
  		* @param delay Number The milliseconds to delay
  		* @param newFn Function Overrides the original function passed when instantiated.
  		* @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides the original args passed when instantiated.
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of delay
  		* @returns Object
  		*/
  var getDelay: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fn
  		* @returns Object
  		*/
  var getFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interval
  		* @returns Object
  		*/
  var getInterval: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of delay
  		* @param delay Object The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of fn
  		* @param fn Object The new value.
  		*/
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of interval
  		* @param interval Object The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDelayedTask {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    cancel: () => Unit = null,
    config: js.Any = null,
    delay: (/* delay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Unit = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getArgs: () => _ = null,
    getDelay: () => _ = null,
    getFn: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getInterval: () => _ = null,
    getScope: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setArgs: /* args */ js.UndefOr[js.Any] => Unit = null,
    setDelay: /* delay */ js.UndefOr[js.Any] => Unit = null,
    setFn: /* fn */ js.UndefOr[js.Any] => Unit = null,
    setInterval: /* interval */ js.UndefOr[js.Any] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction4(delay))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getArgs != null) __obj.updateDynamic("getArgs")(js.Any.fromFunction0(getArgs))
    if (getDelay != null) __obj.updateDynamic("getDelay")(js.Any.fromFunction0(getDelay))
    if (getFn != null) __obj.updateDynamic("getFn")(js.Any.fromFunction0(getFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getInterval != null) __obj.updateDynamic("getInterval")(js.Any.fromFunction0(getInterval))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1(setArgs))
    if (setDelay != null) __obj.updateDynamic("setDelay")(js.Any.fromFunction1(setDelay))
    if (setFn != null) __obj.updateDynamic("setFn")(js.Any.fromFunction1(setFn))
    if (setInterval != null) __obj.updateDynamic("setInterval")(js.Any.fromFunction1(setInterval))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedTask]
  }
}

