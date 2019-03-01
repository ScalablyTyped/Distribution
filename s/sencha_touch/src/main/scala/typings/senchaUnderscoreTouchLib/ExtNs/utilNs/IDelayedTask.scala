package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Cancels any pending timeout and queues a new one
  		* @param delay Number The milliseconds to delay
  		* @param newFn Function Overrides the original function passed when instantiated.
  		* @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides the original args passed when instantiated.
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[scala.Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
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
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of delay
  		* @param delay Object The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fn
  		* @param fn Object The new value.
  		*/
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of interval
  		* @param interval Object The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IDelayedTask {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    cancel: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    delay: js.Function4[
      /* delay */ js.UndefOr[scala.Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getArgs: js.Function0[_] = null,
    getDelay: js.Function0[_] = null,
    getFn: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getInterval: js.Function0[_] = null,
    getScope: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setArgs: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit] = null,
    setDelay: js.Function1[/* delay */ js.UndefOr[js.Any], scala.Unit] = null,
    setFn: js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit] = null,
    setInterval: js.Function1[/* interval */ js.UndefOr[js.Any], scala.Unit] = null,
    setScope: js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (config != null) __obj.updateDynamic("config")(config)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getArgs != null) __obj.updateDynamic("getArgs")(getArgs)
    if (getDelay != null) __obj.updateDynamic("getDelay")(getDelay)
    if (getFn != null) __obj.updateDynamic("getFn")(getFn)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getInterval != null) __obj.updateDynamic("getInterval")(getInterval)
    if (getScope != null) __obj.updateDynamic("getScope")(getScope)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setArgs != null) __obj.updateDynamic("setArgs")(setArgs)
    if (setDelay != null) __obj.updateDynamic("setDelay")(setDelay)
    if (setFn != null) __obj.updateDynamic("setFn")(setFn)
    if (setInterval != null) __obj.updateDynamic("setInterval")(setInterval)
    if (setScope != null) __obj.updateDynamic("setScope")(setScope)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDelayedTask]
  }
}

