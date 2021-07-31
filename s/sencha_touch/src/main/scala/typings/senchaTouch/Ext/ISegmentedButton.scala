package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISegmentedButton
  extends StObject
     with IContainer {
  
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowToggle: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] We override initItems so we can check for the pressed config  */
  var applyItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of allowDepress
    * @returns Boolean
    */
  var getAllowDepress: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of allowMultiple
    * @returns Boolean
    */
  var getAllowMultiple: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of allowToggle
    * @returns Boolean
    */
  var getAllowToggle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets the currently pressed button s */
  var getPressed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of pressedButtons
    * @returns Array
    */
  var getPressedButtons: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of pressedCls
    * @returns String
    */
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns true if a specified Ext Button is pressed
    * @param button Ext.Button The button to check if pressed.
    * @returns Boolean pressed
    */
  var isPressed: js.UndefOr[js.Function1[/* button */ js.UndefOr[IButton], Boolean]] = js.undefined
  
  /** [Config Option] (Array) */
  var pressedButtons: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of allowDepress
    * @param allowDepress Boolean The new value.
    */
  var setAllowDepress: js.UndefOr[js.Function1[/* allowDepress */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of allowMultiple
    * @param allowMultiple Boolean The new value.
    */
  var setAllowMultiple: js.UndefOr[js.Function1[/* allowMultiple */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of allowToggle
    * @param allowToggle Boolean The new value.
    */
  var setAllowToggle: js.UndefOr[js.Function1[/* allowToggle */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Activates a button
    * @param button Number/String/Ext.Button The button to activate.
    * @param pressed Boolean If defined, sets the pressed state of the button, otherwise the pressed state is toggled.
    * @param suppressEvents Boolean true to suppress toggle events during the action. If allowMultiple is true, then setPressed will toggle the button state.
    */
  var setPressed: js.UndefOr[
    js.Function3[
      /* button */ js.UndefOr[js.Any], 
      /* pressed */ js.UndefOr[Boolean], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of pressedButtons
    * @param pressedButtons Array The new value.
    */
  var setPressedButtons: js.UndefOr[js.Function1[/* pressedButtons */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of pressedCls
    * @param pressedCls String The new value.
    */
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}
object ISegmentedButton {
  
  @scala.inline
  def apply(): ISegmentedButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentedButton]
  }
  
  @scala.inline
  implicit class ISegmentedButtonMutableBuilder[Self <: ISegmentedButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDepress(value: Boolean): Self = StObject.set(x, "allowDepress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDepressUndefined: Self = StObject.set(x, "allowDepress", js.undefined)
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    @scala.inline
    def setAllowToggle(value: Boolean): Self = StObject.set(x, "allowToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowToggleUndefined: Self = StObject.set(x, "allowToggle", js.undefined)
    
    @scala.inline
    def setApplyItems(value: () => Unit): Self = StObject.set(x, "applyItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyItemsUndefined: Self = StObject.set(x, "applyItems", js.undefined)
    
    @scala.inline
    def setGetAllowDepress(value: () => Boolean): Self = StObject.set(x, "getAllowDepress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowDepressUndefined: Self = StObject.set(x, "getAllowDepress", js.undefined)
    
    @scala.inline
    def setGetAllowMultiple(value: () => Boolean): Self = StObject.set(x, "getAllowMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowMultipleUndefined: Self = StObject.set(x, "getAllowMultiple", js.undefined)
    
    @scala.inline
    def setGetAllowToggle(value: () => Boolean): Self = StObject.set(x, "getAllowToggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowToggleUndefined: Self = StObject.set(x, "getAllowToggle", js.undefined)
    
    @scala.inline
    def setGetLayout(value: () => js.Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
    
    @scala.inline
    def setGetPressed(value: () => Unit): Self = StObject.set(x, "getPressed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPressedButtons(value: () => Array): Self = StObject.set(x, "getPressedButtons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPressedButtonsUndefined: Self = StObject.set(x, "getPressedButtons", js.undefined)
    
    @scala.inline
    def setGetPressedCls(value: () => java.lang.String): Self = StObject.set(x, "getPressedCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPressedClsUndefined: Self = StObject.set(x, "getPressedCls", js.undefined)
    
    @scala.inline
    def setGetPressedUndefined: Self = StObject.set(x, "getPressed", js.undefined)
    
    @scala.inline
    def setIsPressed(value: /* button */ js.UndefOr[IButton] => Boolean): Self = StObject.set(x, "isPressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPressedUndefined: Self = StObject.set(x, "isPressed", js.undefined)
    
    @scala.inline
    def setPressedButtons(value: Array): Self = StObject.set(x, "pressedButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedButtonsUndefined: Self = StObject.set(x, "pressedButtons", js.undefined)
    
    @scala.inline
    def setPressedCls(value: java.lang.String): Self = StObject.set(x, "pressedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedClsUndefined: Self = StObject.set(x, "pressedCls", js.undefined)
    
    @scala.inline
    def setSetAllowDepress(value: /* allowDepress */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowDepress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowDepressUndefined: Self = StObject.set(x, "setAllowDepress", js.undefined)
    
    @scala.inline
    def setSetAllowMultiple(value: /* allowMultiple */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowMultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowMultipleUndefined: Self = StObject.set(x, "setAllowMultiple", js.undefined)
    
    @scala.inline
    def setSetAllowToggle(value: /* allowToggle */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowToggleUndefined: Self = StObject.set(x, "setAllowToggle", js.undefined)
    
    @scala.inline
    def setSetPressed(
      value: (/* button */ js.UndefOr[js.Any], /* pressed */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "setPressed", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPressedButtons(value: /* pressedButtons */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setPressedButtons", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPressedButtonsUndefined: Self = StObject.set(x, "setPressedButtons", js.undefined)
    
    @scala.inline
    def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPressedCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPressedClsUndefined: Self = StObject.set(x, "setPressedCls", js.undefined)
    
    @scala.inline
    def setSetPressedUndefined: Self = StObject.set(x, "setPressed", js.undefined)
  }
}
