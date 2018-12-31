package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(senchaUnderscoreTouchLib.ExtNs.mixinNs.IProgressable because Would inherit conflicting mutable fields List(alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses))*/
trait IProgressIndicator extends IContainer {
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
  /** [Method] Returns the value of minProgressInput
  		* @returns Number
  		*/
  var getMinProgressInput: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of monitoredStates
  		* @returns Object
  		*/
  var getMonitoredStates: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/Ext.XTemplate/Object) */
  var loadingText: js.UndefOr[js.Any] = js.undefined
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
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of monitoredStates
  		* @param monitoredStates Object The new value.
  		*/
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

