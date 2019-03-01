package typings
package senchaUnderscoreTouchLib.ExtNs.mixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressable
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of maxProgressInput
  		* @returns Number
  		*/
  var getMaxProgressInput: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxProgressOutput
  		* @returns Number
  		*/
  var getMaxProgressOutput: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minProgressInput
  		* @returns Number
  		*/
  var getMinProgressInput: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minProgressOutput
  		* @returns Number
  		*/
  var getMinProgressOutput: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of state
  		* @returns String
  		*/
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressInput
  		* @param maxProgressInput Number The new value.
  		*/
  var setMaxProgressInput: js.UndefOr[js.Function1[/* maxProgressInput */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressOutput
  		* @param maxProgressOutput Number The new value.
  		*/
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minProgressOutput
  		* @param minProgressOutput Number The new value.
  		*/
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object IProgressable {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getDynamic: js.Function0[scala.Boolean] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMaxProgressInput: js.Function0[scala.Double] = null,
    getMaxProgressOutput: js.Function0[scala.Double] = null,
    getMinProgressInput: js.Function0[scala.Double] = null,
    getMinProgressOutput: js.Function0[scala.Double] = null,
    getState: js.Function0[java.lang.String] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    maxProgressInput: scala.Int | scala.Double = null,
    maxProgressOutput: scala.Int | scala.Double = null,
    minProgressInput: scala.Int | scala.Double = null,
    minProgressOutput: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDynamic: js.Function1[/* dynamic */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setMaxProgressInput: js.Function1[/* maxProgressInput */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaxProgressOutput: js.Function1[/* maxProgressOutput */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinProgressInput: js.Function1[/* minProgressInput */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinProgressOutput: js.Function1[/* minProgressOutput */ js.UndefOr[scala.Double], scala.Unit] = null,
    setState: js.Function1[/* state */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IProgressable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDynamic != null) __obj.updateDynamic("getDynamic")(getDynamic)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMaxProgressInput != null) __obj.updateDynamic("getMaxProgressInput")(getMaxProgressInput)
    if (getMaxProgressOutput != null) __obj.updateDynamic("getMaxProgressOutput")(getMaxProgressOutput)
    if (getMinProgressInput != null) __obj.updateDynamic("getMinProgressInput")(getMinProgressInput)
    if (getMinProgressOutput != null) __obj.updateDynamic("getMinProgressOutput")(getMinProgressOutput)
    if (getState != null) __obj.updateDynamic("getState")(getState)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (maxProgressInput != null) __obj.updateDynamic("maxProgressInput")(maxProgressInput.asInstanceOf[js.Any])
    if (maxProgressOutput != null) __obj.updateDynamic("maxProgressOutput")(maxProgressOutput.asInstanceOf[js.Any])
    if (minProgressInput != null) __obj.updateDynamic("minProgressInput")(minProgressInput.asInstanceOf[js.Any])
    if (minProgressOutput != null) __obj.updateDynamic("minProgressOutput")(minProgressOutput.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(setDynamic)
    if (setMaxProgressInput != null) __obj.updateDynamic("setMaxProgressInput")(setMaxProgressInput)
    if (setMaxProgressOutput != null) __obj.updateDynamic("setMaxProgressOutput")(setMaxProgressOutput)
    if (setMinProgressInput != null) __obj.updateDynamic("setMinProgressInput")(setMinProgressInput)
    if (setMinProgressOutput != null) __obj.updateDynamic("setMinProgressOutput")(setMinProgressOutput)
    if (setState != null) __obj.updateDynamic("setState")(setState)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (state != null) __obj.updateDynamic("state")(state)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IProgressable]
  }
}

