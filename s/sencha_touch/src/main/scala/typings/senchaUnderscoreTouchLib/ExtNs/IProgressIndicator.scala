package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.mixinNs.IProgressable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined dynamic, maxProgressInput, maxProgressOutput, minProgressInput, minProgressOutput, state, getDynamic, getMaxProgressInput, getMaxProgressOutput, getMinProgressInput, getMinProgressOutput, getState, setDynamic, setMaxProgressInput, setMaxProgressOutput, setMinProgressInput, setMinProgressOutput, setState */ trait IProgressIndicator extends IContainer {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Object) */
  var fallbackText: js.UndefOr[js.Any] = js.undefined
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
  var maxProgressInput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var monitoredStates: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fallbackText
  		* @param fallbackText String/Object The new value.
  		*/
  var setFallbackText: js.UndefOr[js.Function1[/* fallbackText */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Ext.XTemplate/Object The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
  /** [Method] Sets the value of monitoredStates
  		* @param monitoredStates Object The new value.
  		*/
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object IProgressIndicator {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    IProgressable: senchaUnderscoreTouchLib.ExtNs.mixinNs.IProgressable = null,
    baseCls: java.lang.String = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    fallbackText: js.Any = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getCentered: js.Function0[scala.Boolean] = null,
    getDynamic: js.Function0[scala.Boolean] = null,
    getHidden: js.Function0[scala.Boolean] = null,
    getHideAnimation: js.Function0[_] = null,
    getMaxProgressInput: js.Function0[scala.Double] = null,
    getMinProgressInput: js.Function0[scala.Double] = null,
    getModal: js.Function0[scala.Boolean] = null,
    getMonitoredStates: js.Function0[_] = null,
    getShowAnimation: js.Function0[_] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideAnimation: js.Any = null,
    loadingText: js.Any = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    monitoredStates: js.Any = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setCentered: js.Function1[/* centered */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDynamic: js.Function1[/* dynamic */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFallbackText: js.Function1[/* fallbackText */ js.UndefOr[js.Any], scala.Unit] = null,
    setHidden: js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setHideAnimation: js.Function1[/* hideAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setLoadingText: js.Function1[/* loadingText */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxProgressInput: js.Function1[/* maxProgressInput */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinProgressInput: js.Function1[/* minProgressInput */ js.UndefOr[scala.Double], scala.Unit] = null,
    setModal: js.Function1[/* modal */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setMonitoredStates: js.Function1[/* monitoredStates */ js.UndefOr[js.Any], scala.Unit] = null,
    setShowAnimation: js.Function1[/* showAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    showAnimation: js.Any = null
  ): IProgressIndicator = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    js.Dynamic.global.Object.assign(__obj, IProgressable)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (fallbackText != null) __obj.updateDynamic("fallbackText")(fallbackText)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getCentered != null) __obj.updateDynamic("getCentered")(getCentered)
    if (getDynamic != null) __obj.updateDynamic("getDynamic")(getDynamic)
    if (getHidden != null) __obj.updateDynamic("getHidden")(getHidden)
    if (getHideAnimation != null) __obj.updateDynamic("getHideAnimation")(getHideAnimation)
    if (getMaxProgressInput != null) __obj.updateDynamic("getMaxProgressInput")(getMaxProgressInput)
    if (getMinProgressInput != null) __obj.updateDynamic("getMinProgressInput")(getMinProgressInput)
    if (getModal != null) __obj.updateDynamic("getModal")(getModal)
    if (getMonitoredStates != null) __obj.updateDynamic("getMonitoredStates")(getMonitoredStates)
    if (getShowAnimation != null) __obj.updateDynamic("getShowAnimation")(getShowAnimation)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (monitoredStates != null) __obj.updateDynamic("monitoredStates")(monitoredStates)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setCentered != null) __obj.updateDynamic("setCentered")(setCentered)
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(setDynamic)
    if (setFallbackText != null) __obj.updateDynamic("setFallbackText")(setFallbackText)
    if (setHidden != null) __obj.updateDynamic("setHidden")(setHidden)
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(setHideAnimation)
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(setLoadingText)
    if (setMaxProgressInput != null) __obj.updateDynamic("setMaxProgressInput")(setMaxProgressInput)
    if (setMinProgressInput != null) __obj.updateDynamic("setMinProgressInput")(setMinProgressInput)
    if (setModal != null) __obj.updateDynamic("setModal")(setModal)
    if (setMonitoredStates != null) __obj.updateDynamic("setMonitoredStates")(setMonitoredStates)
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(setShowAnimation)
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    __obj.asInstanceOf[IProgressIndicator]
  }
}

