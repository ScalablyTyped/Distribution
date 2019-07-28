package typings.senchaUnderscoreTouch.ExtNs.mixinNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressable extends IBase {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of maxProgressInput
  		* @returns Number
  		*/
  var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxProgressOutput
  		* @returns Number
  		*/
  var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minProgressInput
  		* @returns Number
  		*/
  var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minProgressOutput
  		* @returns Number
  		*/
  var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of state
  		* @returns String
  		*/
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressInput
  		* @param maxProgressInput Number The new value.
  		*/
  var setMaxProgressInput: js.UndefOr[js.Function1[/* maxProgressInput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressOutput
  		* @param maxProgressOutput Number The new value.
  		*/
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minProgressOutput
  		* @param minProgressOutput Number The new value.
  		*/
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object IProgressable {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    getDynamic: () => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getMaxProgressInput: () => Double = null,
    getMaxProgressOutput: () => Double = null,
    getMinProgressInput: () => Double = null,
    getMinProgressOutput: () => Double = null,
    getState: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    maxProgressInput: Int | Double = null,
    maxProgressOutput: Int | Double = null,
    minProgressInput: Int | Double = null,
    minProgressOutput: Int | Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDynamic: /* dynamic */ js.UndefOr[Boolean] => Unit = null,
    setMaxProgressInput: /* maxProgressInput */ js.UndefOr[Double] => Unit = null,
    setMaxProgressOutput: /* maxProgressOutput */ js.UndefOr[Double] => Unit = null,
    setMinProgressInput: /* minProgressInput */ js.UndefOr[Double] => Unit = null,
    setMinProgressOutput: /* minProgressOutput */ js.UndefOr[Double] => Unit = null,
    setState: /* state */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    state: java.lang.String = null,
    statics: js.Any = null,
    uses: Array = null
  ): IProgressable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDynamic != null) __obj.updateDynamic("getDynamic")(js.Any.fromFunction0(getDynamic))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMaxProgressInput != null) __obj.updateDynamic("getMaxProgressInput")(js.Any.fromFunction0(getMaxProgressInput))
    if (getMaxProgressOutput != null) __obj.updateDynamic("getMaxProgressOutput")(js.Any.fromFunction0(getMaxProgressOutput))
    if (getMinProgressInput != null) __obj.updateDynamic("getMinProgressInput")(js.Any.fromFunction0(getMinProgressInput))
    if (getMinProgressOutput != null) __obj.updateDynamic("getMinProgressOutput")(js.Any.fromFunction0(getMinProgressOutput))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (maxProgressInput != null) __obj.updateDynamic("maxProgressInput")(maxProgressInput.asInstanceOf[js.Any])
    if (maxProgressOutput != null) __obj.updateDynamic("maxProgressOutput")(maxProgressOutput.asInstanceOf[js.Any])
    if (minProgressInput != null) __obj.updateDynamic("minProgressInput")(minProgressInput.asInstanceOf[js.Any])
    if (minProgressOutput != null) __obj.updateDynamic("minProgressOutput")(minProgressOutput.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(js.Any.fromFunction1(setDynamic))
    if (setMaxProgressInput != null) __obj.updateDynamic("setMaxProgressInput")(js.Any.fromFunction1(setMaxProgressInput))
    if (setMaxProgressOutput != null) __obj.updateDynamic("setMaxProgressOutput")(js.Any.fromFunction1(setMaxProgressOutput))
    if (setMinProgressInput != null) __obj.updateDynamic("setMinProgressInput")(js.Any.fromFunction1(setMinProgressInput))
    if (setMinProgressOutput != null) __obj.updateDynamic("setMinProgressOutput")(js.Any.fromFunction1(setMinProgressOutput))
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1(setState))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (state != null) __obj.updateDynamic("state")(state)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IProgressable]
  }
}

