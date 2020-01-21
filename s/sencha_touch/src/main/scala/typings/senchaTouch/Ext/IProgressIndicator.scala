package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.IProgressable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined dynamic, maxProgressInput, maxProgressOutput, minProgressInput, minProgressOutput, state, getDynamic, getMaxProgressInput, getMaxProgressOutput, getMinProgressInput, getMinProgressOutput, getState, setDynamic, setMaxProgressInput, setMaxProgressOutput, setMinProgressInput, setMinProgressOutput, setState */ trait IProgressIndicator extends IContainer {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Object) */
  var fallbackText: js.UndefOr[js.Any] = js.undefined
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
  /** [Method] Returns the value of monitoredStates
  		* @returns Object
  		*/
  var getMonitoredStates: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of state
  		* @returns String
  		*/
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String/Ext.XTemplate/Object) */
  var loadingText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var monitoredStates: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of fallbackText
  		* @param fallbackText String/Object The new value.
  		*/
  var setFallbackText: js.UndefOr[js.Function1[/* fallbackText */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Ext.XTemplate/Object The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressInput
  		* @param maxProgressInput Number The new value.
  		*/
  var setMaxProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressOutput
  		* @param maxProgressOutput Number The new value.
  		*/
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minProgressOutput
  		* @param minProgressOutput Number The new value.
  		*/
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of monitoredStates
  		* @param monitoredStates Object The new value.
  		*/
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object IProgressIndicator {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    fallbackText: js.Any = null,
    getDynamic: () => Boolean = null,
    getMaxProgressInput: () => Double = null,
    getMaxProgressOutput: () => Double = null,
    getMinProgressInput: () => Double = null,
    getMinProgressOutput: () => Double = null,
    getMonitoredStates: () => _ = null,
    getState: () => java.lang.String = null,
    loadingText: js.Any = null,
    maxProgressInput: Int | Double = null,
    maxProgressOutput: Int | Double = null,
    minProgressInput: Int | Double = null,
    minProgressOutput: Int | Double = null,
    monitoredStates: js.Any = null,
    setDynamic: js.UndefOr[Boolean] => Unit = null,
    setFallbackText: /* fallbackText */ js.UndefOr[js.Any] => Unit = null,
    setLoadingText: /* loadingText */ js.UndefOr[js.Any] => Unit = null,
    setMaxProgressInput: js.UndefOr[Double] => Unit = null,
    setMaxProgressOutput: /* maxProgressOutput */ js.UndefOr[Double] => Unit = null,
    setMinProgressInput: js.UndefOr[Double] => Unit = null,
    setMinProgressOutput: /* minProgressOutput */ js.UndefOr[Double] => Unit = null,
    setMonitoredStates: /* monitoredStates */ js.UndefOr[js.Any] => Unit = null,
    setState: /* state */ js.UndefOr[java.lang.String] => Unit = null,
    state: java.lang.String = null
  ): IProgressIndicator = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    if (fallbackText != null) __obj.updateDynamic("fallbackText")(fallbackText.asInstanceOf[js.Any])
    if (getDynamic != null) __obj.updateDynamic("getDynamic")(js.Any.fromFunction0(getDynamic))
    if (getMaxProgressInput != null) __obj.updateDynamic("getMaxProgressInput")(js.Any.fromFunction0(getMaxProgressInput))
    if (getMaxProgressOutput != null) __obj.updateDynamic("getMaxProgressOutput")(js.Any.fromFunction0(getMaxProgressOutput))
    if (getMinProgressInput != null) __obj.updateDynamic("getMinProgressInput")(js.Any.fromFunction0(getMinProgressInput))
    if (getMinProgressOutput != null) __obj.updateDynamic("getMinProgressOutput")(js.Any.fromFunction0(getMinProgressOutput))
    if (getMonitoredStates != null) __obj.updateDynamic("getMonitoredStates")(js.Any.fromFunction0(getMonitoredStates))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (maxProgressInput != null) __obj.updateDynamic("maxProgressInput")(maxProgressInput.asInstanceOf[js.Any])
    if (maxProgressOutput != null) __obj.updateDynamic("maxProgressOutput")(maxProgressOutput.asInstanceOf[js.Any])
    if (minProgressInput != null) __obj.updateDynamic("minProgressInput")(minProgressInput.asInstanceOf[js.Any])
    if (minProgressOutput != null) __obj.updateDynamic("minProgressOutput")(minProgressOutput.asInstanceOf[js.Any])
    if (monitoredStates != null) __obj.updateDynamic("monitoredStates")(monitoredStates.asInstanceOf[js.Any])
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(js.Any.fromFunction1(setDynamic))
    if (setFallbackText != null) __obj.updateDynamic("setFallbackText")(js.Any.fromFunction1(setFallbackText))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1(setLoadingText))
    if (setMaxProgressInput != null) __obj.updateDynamic("setMaxProgressInput")(js.Any.fromFunction1(setMaxProgressInput))
    if (setMaxProgressOutput != null) __obj.updateDynamic("setMaxProgressOutput")(js.Any.fromFunction1(setMaxProgressOutput))
    if (setMinProgressInput != null) __obj.updateDynamic("setMinProgressInput")(js.Any.fromFunction1(setMinProgressInput))
    if (setMinProgressOutput != null) __obj.updateDynamic("setMinProgressOutput")(js.Any.fromFunction1(setMinProgressOutput))
    if (setMonitoredStates != null) __obj.updateDynamic("setMonitoredStates")(js.Any.fromFunction1(setMonitoredStates))
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1(setState))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicator]
  }
}

