package typings.senchaTouch.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpinner
  extends StObject
     with typings.senchaTouch.Ext.field.INumber {
  
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the value of accelerateOnTapHold
    * @returns Boolean
    */
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of cycle
    * @returns Boolean
    */
  var getCycle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of defaultValue
    * @returns Number
    */
  var getDefaultValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of groupButtons
    * @returns Boolean
    */
  var getGroupButtons: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var increment: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of accelerateOnTapHold
    * @param accelerateOnTapHold Boolean The new value.
    */
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of cycle
    * @param cycle Boolean The new value.
    */
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultValue
    * @param defaultValue Number The new value.
    */
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of groupButtons
    * @param groupButtons Boolean The new value.
    */
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Updates the component configuration
    * @param newComponent Object
    */
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object ISpinner {
  
  inline def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  
  extension [Self <: ISpinner](x: Self) {
    
    inline def setAccelerateOnTapHold(value: Boolean): Self = StObject.set(x, "accelerateOnTapHold", value.asInstanceOf[js.Any])
    
    inline def setAccelerateOnTapHoldUndefined: Self = StObject.set(x, "accelerateOnTapHold", js.undefined)
    
    inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setGetAccelerateOnTapHold(value: () => Boolean): Self = StObject.set(x, "getAccelerateOnTapHold", js.Any.fromFunction0(value))
    
    inline def setGetAccelerateOnTapHoldUndefined: Self = StObject.set(x, "getAccelerateOnTapHold", js.undefined)
    
    inline def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetCycle(value: () => Boolean): Self = StObject.set(x, "getCycle", js.Any.fromFunction0(value))
    
    inline def setGetCycleUndefined: Self = StObject.set(x, "getCycle", js.undefined)
    
    inline def setGetDefaultValue(value: () => Double): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction0(value))
    
    inline def setGetDefaultValueUndefined: Self = StObject.set(x, "getDefaultValue", js.undefined)
    
    inline def setGetGroupButtons(value: () => Boolean): Self = StObject.set(x, "getGroupButtons", js.Any.fromFunction0(value))
    
    inline def setGetGroupButtonsUndefined: Self = StObject.set(x, "getGroupButtons", js.undefined)
    
    inline def setGroupButtons(value: Boolean): Self = StObject.set(x, "groupButtons", value.asInstanceOf[js.Any])
    
    inline def setGroupButtonsUndefined: Self = StObject.set(x, "groupButtons", js.undefined)
    
    inline def setIncrement(value: String): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setIncrementValue(value: String): Self = StObject.set(x, "incrementValue", value.asInstanceOf[js.Any])
    
    inline def setIncrementValueUndefined: Self = StObject.set(x, "incrementValue", js.undefined)
    
    inline def setSetAccelerateOnTapHold(value: /* accelerateOnTapHold */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAccelerateOnTapHold", js.Any.fromFunction1(value))
    
    inline def setSetAccelerateOnTapHoldUndefined: Self = StObject.set(x, "setAccelerateOnTapHold", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetCycle(value: /* cycle */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setCycle", js.Any.fromFunction1(value))
    
    inline def setSetCycleUndefined: Self = StObject.set(x, "setCycle", js.undefined)
    
    inline def setSetDefaultValue(value: /* defaultValue */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDefaultValue", js.Any.fromFunction1(value))
    
    inline def setSetDefaultValueUndefined: Self = StObject.set(x, "setDefaultValue", js.undefined)
    
    inline def setSetGroupButtons(value: /* groupButtons */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setGroupButtons", js.Any.fromFunction1(value))
    
    inline def setSetGroupButtonsUndefined: Self = StObject.set(x, "setGroupButtons", js.undefined)
    
    inline def setUpdateComponent(value: /* newComponent */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updateComponent", js.Any.fromFunction1(value))
    
    inline def setUpdateComponentUndefined: Self = StObject.set(x, "updateComponent", js.undefined)
  }
}
