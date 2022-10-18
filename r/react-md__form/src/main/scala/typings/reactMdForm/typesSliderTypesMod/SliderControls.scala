package typings.reactMdForm.typesSliderTypesMod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderControls extends StObject {
  
  def decrement(): Unit
  
  def decrementJump(): Unit
  
  def increment(): Unit
  
  def incrementJump(): Unit
  
  def maximum(): Unit
  
  def minimum(): Unit
  
  def persist(): Unit
  
  var setValue: Dispatch[SetStateAction[SliderValue]]
}
object SliderControls {
  
  inline def apply(
    decrement: () => Unit,
    decrementJump: () => Unit,
    increment: () => Unit,
    incrementJump: () => Unit,
    maximum: () => Unit,
    minimum: () => Unit,
    persist: () => Unit,
    setValue: SetStateAction[SliderValue] => Unit
  ): SliderControls = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction0(decrement), decrementJump = js.Any.fromFunction0(decrementJump), increment = js.Any.fromFunction0(increment), incrementJump = js.Any.fromFunction0(incrementJump), maximum = js.Any.fromFunction0(maximum), minimum = js.Any.fromFunction0(minimum), persist = js.Any.fromFunction0(persist), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[SliderControls]
  }
  
  extension [Self <: SliderControls](x: Self) {
    
    inline def setDecrement(value: () => Unit): Self = StObject.set(x, "decrement", js.Any.fromFunction0(value))
    
    inline def setDecrementJump(value: () => Unit): Self = StObject.set(x, "decrementJump", js.Any.fromFunction0(value))
    
    inline def setIncrement(value: () => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction0(value))
    
    inline def setIncrementJump(value: () => Unit): Self = StObject.set(x, "incrementJump", js.Any.fromFunction0(value))
    
    inline def setMaximum(value: () => Unit): Self = StObject.set(x, "maximum", js.Any.fromFunction0(value))
    
    inline def setMinimum(value: () => Unit): Self = StObject.set(x, "minimum", js.Any.fromFunction0(value))
    
    inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: SetStateAction[SliderValue] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
