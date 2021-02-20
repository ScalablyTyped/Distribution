package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.IProgressable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined dynamic, maxProgressInput, maxProgressOutput, minProgressInput, minProgressOutput, state, getDynamic, getMaxProgressInput, getMaxProgressOutput, getMinProgressInput, getMinProgressOutput, getState, setDynamic, setMaxProgressInput, setMaxProgressOutput, setMinProgressInput, setMinProgressOutput, setState */ @js.native
trait IProgressIndicator extends IContainer {
  
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Object) */
  var fallbackText: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of dynamic
    * @returns Boolean
    */
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of maxProgressInput
    * @returns Number
    */
  var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of maxProgressOutput
    * @returns Number
    */
  var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minProgressInput
    * @returns Number
    */
  var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minProgressOutput
    * @returns Number
    */
  var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of monitoredStates
    * @returns Object
    */
  var getMonitoredStates: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of state
    * @returns String
    */
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Config Option] (String/Ext.XTemplate/Object) */
  var loadingText: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var monitoredStates: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of dynamic
    * @param dynamic Boolean The new value.
    */
  var setDynamic: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of fallbackText
    * @param fallbackText String/Object The new value.
    */
  var setFallbackText: js.UndefOr[js.Function1[/* fallbackText */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of loadingText
    * @param loadingText String/Ext.XTemplate/Object The new value.
    */
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of maxProgressInput
    * @param maxProgressInput Number The new value.
    */
  var setMaxProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of maxProgressOutput
    * @param maxProgressOutput Number The new value.
    */
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minProgressInput
    * @param minProgressInput Number The new value.
    */
  var setMinProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minProgressOutput
    * @param minProgressOutput Number The new value.
    */
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of monitoredStates
    * @param monitoredStates Object The new value.
    */
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of state
    * @param state String The new value.
    */
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.native
}
object IProgressIndicator {
  
  @scala.inline
  def apply(): IProgressIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicator]
  }
  
  @scala.inline
  implicit class IProgressIndicatorMutableBuilder[Self <: IProgressIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    @scala.inline
    def setFallbackText(value: js.Any): Self = StObject.set(x, "fallbackText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackTextUndefined: Self = StObject.set(x, "fallbackText", js.undefined)
    
    @scala.inline
    def setGetDynamic(value: () => Boolean): Self = StObject.set(x, "getDynamic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDynamicUndefined: Self = StObject.set(x, "getDynamic", js.undefined)
    
    @scala.inline
    def setGetMaxProgressInput(value: () => Double): Self = StObject.set(x, "getMaxProgressInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxProgressInputUndefined: Self = StObject.set(x, "getMaxProgressInput", js.undefined)
    
    @scala.inline
    def setGetMaxProgressOutput(value: () => Double): Self = StObject.set(x, "getMaxProgressOutput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxProgressOutputUndefined: Self = StObject.set(x, "getMaxProgressOutput", js.undefined)
    
    @scala.inline
    def setGetMinProgressInput(value: () => Double): Self = StObject.set(x, "getMinProgressInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinProgressInputUndefined: Self = StObject.set(x, "getMinProgressInput", js.undefined)
    
    @scala.inline
    def setGetMinProgressOutput(value: () => Double): Self = StObject.set(x, "getMinProgressOutput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinProgressOutputUndefined: Self = StObject.set(x, "getMinProgressOutput", js.undefined)
    
    @scala.inline
    def setGetMonitoredStates(value: () => _): Self = StObject.set(x, "getMonitoredStates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonitoredStatesUndefined: Self = StObject.set(x, "getMonitoredStates", js.undefined)
    
    @scala.inline
    def setGetState(value: () => java.lang.String): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    @scala.inline
    def setLoadingText(value: js.Any): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    @scala.inline
    def setMaxProgressInput(value: Double): Self = StObject.set(x, "maxProgressInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxProgressInputUndefined: Self = StObject.set(x, "maxProgressInput", js.undefined)
    
    @scala.inline
    def setMaxProgressOutput(value: Double): Self = StObject.set(x, "maxProgressOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxProgressOutputUndefined: Self = StObject.set(x, "maxProgressOutput", js.undefined)
    
    @scala.inline
    def setMinProgressInput(value: Double): Self = StObject.set(x, "minProgressInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProgressInputUndefined: Self = StObject.set(x, "minProgressInput", js.undefined)
    
    @scala.inline
    def setMinProgressOutput(value: Double): Self = StObject.set(x, "minProgressOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProgressOutputUndefined: Self = StObject.set(x, "minProgressOutput", js.undefined)
    
    @scala.inline
    def setMonitoredStates(value: js.Any): Self = StObject.set(x, "monitoredStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredStatesUndefined: Self = StObject.set(x, "monitoredStates", js.undefined)
    
    @scala.inline
    def setSetDynamic(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDynamic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDynamicUndefined: Self = StObject.set(x, "setDynamic", js.undefined)
    
    @scala.inline
    def setSetFallbackText(value: /* fallbackText */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFallbackText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFallbackTextUndefined: Self = StObject.set(x, "setFallbackText", js.undefined)
    
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
    
    @scala.inline
    def setSetMaxProgressInput(value: js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxProgressInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxProgressInputUndefined: Self = StObject.set(x, "setMaxProgressInput", js.undefined)
    
    @scala.inline
    def setSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxProgressOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxProgressOutputUndefined: Self = StObject.set(x, "setMaxProgressOutput", js.undefined)
    
    @scala.inline
    def setSetMinProgressInput(value: js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinProgressInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinProgressInputUndefined: Self = StObject.set(x, "setMinProgressInput", js.undefined)
    
    @scala.inline
    def setSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinProgressOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinProgressOutputUndefined: Self = StObject.set(x, "setMinProgressOutput", js.undefined)
    
    @scala.inline
    def setSetMonitoredStates(value: /* monitoredStates */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMonitoredStates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonitoredStatesUndefined: Self = StObject.set(x, "setMonitoredStates", js.undefined)
    
    @scala.inline
    def setSetState(value: /* state */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
    
    @scala.inline
    def setState(value: java.lang.String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
