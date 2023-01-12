package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.IProgressable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined dynamic, maxProgressInput, maxProgressOutput, minProgressInput, minProgressOutput, state, getDynamic, getMaxProgressInput, getMaxProgressOutput, getMinProgressInput, getMinProgressOutput, getState, setDynamic, setMaxProgressInput, setMaxProgressOutput, setMinProgressInput, setMinProgressOutput, setState */ trait IProgressIndicator
  extends StObject
     with IContainer {
  
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/Object) */
  var fallbackText: js.UndefOr[Any] = js.undefined
  
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
  var getMonitoredStates: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of state
    * @returns String
    */
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Config Option] (String/Ext.XTemplate/Object) */
  var loadingText: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Object) */
  var monitoredStates: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of dynamic
    * @param dynamic Boolean The new value.
    */
  var setDynamic: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of fallbackText
    * @param fallbackText String/Object The new value.
    */
  var setFallbackText: js.UndefOr[js.Function1[/* fallbackText */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of loadingText
    * @param loadingText String/Ext.XTemplate/Object The new value.
    */
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of state
    * @param state String The new value.
    */
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.undefined
}
object IProgressIndicator {
  
  inline def apply(): IProgressIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProgressIndicator] (val x: Self) extends AnyVal {
    
    inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    inline def setFallbackText(value: Any): Self = StObject.set(x, "fallbackText", value.asInstanceOf[js.Any])
    
    inline def setFallbackTextUndefined: Self = StObject.set(x, "fallbackText", js.undefined)
    
    inline def setGetDynamic(value: () => Boolean): Self = StObject.set(x, "getDynamic", js.Any.fromFunction0(value))
    
    inline def setGetDynamicUndefined: Self = StObject.set(x, "getDynamic", js.undefined)
    
    inline def setGetMaxProgressInput(value: () => Double): Self = StObject.set(x, "getMaxProgressInput", js.Any.fromFunction0(value))
    
    inline def setGetMaxProgressInputUndefined: Self = StObject.set(x, "getMaxProgressInput", js.undefined)
    
    inline def setGetMaxProgressOutput(value: () => Double): Self = StObject.set(x, "getMaxProgressOutput", js.Any.fromFunction0(value))
    
    inline def setGetMaxProgressOutputUndefined: Self = StObject.set(x, "getMaxProgressOutput", js.undefined)
    
    inline def setGetMinProgressInput(value: () => Double): Self = StObject.set(x, "getMinProgressInput", js.Any.fromFunction0(value))
    
    inline def setGetMinProgressInputUndefined: Self = StObject.set(x, "getMinProgressInput", js.undefined)
    
    inline def setGetMinProgressOutput(value: () => Double): Self = StObject.set(x, "getMinProgressOutput", js.Any.fromFunction0(value))
    
    inline def setGetMinProgressOutputUndefined: Self = StObject.set(x, "getMinProgressOutput", js.undefined)
    
    inline def setGetMonitoredStates(value: () => Any): Self = StObject.set(x, "getMonitoredStates", js.Any.fromFunction0(value))
    
    inline def setGetMonitoredStatesUndefined: Self = StObject.set(x, "getMonitoredStates", js.undefined)
    
    inline def setGetState(value: () => java.lang.String): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    inline def setLoadingText(value: Any): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    inline def setMaxProgressInput(value: Double): Self = StObject.set(x, "maxProgressInput", value.asInstanceOf[js.Any])
    
    inline def setMaxProgressInputUndefined: Self = StObject.set(x, "maxProgressInput", js.undefined)
    
    inline def setMaxProgressOutput(value: Double): Self = StObject.set(x, "maxProgressOutput", value.asInstanceOf[js.Any])
    
    inline def setMaxProgressOutputUndefined: Self = StObject.set(x, "maxProgressOutput", js.undefined)
    
    inline def setMinProgressInput(value: Double): Self = StObject.set(x, "minProgressInput", value.asInstanceOf[js.Any])
    
    inline def setMinProgressInputUndefined: Self = StObject.set(x, "minProgressInput", js.undefined)
    
    inline def setMinProgressOutput(value: Double): Self = StObject.set(x, "minProgressOutput", value.asInstanceOf[js.Any])
    
    inline def setMinProgressOutputUndefined: Self = StObject.set(x, "minProgressOutput", js.undefined)
    
    inline def setMonitoredStates(value: Any): Self = StObject.set(x, "monitoredStates", value.asInstanceOf[js.Any])
    
    inline def setMonitoredStatesUndefined: Self = StObject.set(x, "monitoredStates", js.undefined)
    
    inline def setSetDynamic(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDynamic", js.Any.fromFunction1(value))
    
    inline def setSetDynamicUndefined: Self = StObject.set(x, "setDynamic", js.undefined)
    
    inline def setSetFallbackText(value: /* fallbackText */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setFallbackText", js.Any.fromFunction1(value))
    
    inline def setSetFallbackTextUndefined: Self = StObject.set(x, "setFallbackText", js.undefined)
    
    inline def setSetLoadingText(value: /* loadingText */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
    
    inline def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
    
    inline def setSetMaxProgressInput(value: js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxProgressInput", js.Any.fromFunction1(value))
    
    inline def setSetMaxProgressInputUndefined: Self = StObject.set(x, "setMaxProgressInput", js.undefined)
    
    inline def setSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxProgressOutput", js.Any.fromFunction1(value))
    
    inline def setSetMaxProgressOutputUndefined: Self = StObject.set(x, "setMaxProgressOutput", js.undefined)
    
    inline def setSetMinProgressInput(value: js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinProgressInput", js.Any.fromFunction1(value))
    
    inline def setSetMinProgressInputUndefined: Self = StObject.set(x, "setMinProgressInput", js.undefined)
    
    inline def setSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinProgressOutput", js.Any.fromFunction1(value))
    
    inline def setSetMinProgressOutputUndefined: Self = StObject.set(x, "setMinProgressOutput", js.undefined)
    
    inline def setSetMonitoredStates(value: /* monitoredStates */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMonitoredStates", js.Any.fromFunction1(value))
    
    inline def setSetMonitoredStatesUndefined: Self = StObject.set(x, "setMonitoredStates", js.undefined)
    
    inline def setSetState(value: /* state */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    inline def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
    
    inline def setState(value: java.lang.String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
