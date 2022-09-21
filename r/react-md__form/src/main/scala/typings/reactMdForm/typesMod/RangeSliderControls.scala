package typings.reactMdForm.typesMod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSliderControls extends StObject {
  
  def decrement(index: ThumbIndex): Unit
  
  def decrementJump(index: ThumbIndex): Unit
  
  def increment(index: ThumbIndex): Unit
  
  def incrementJump(index: ThumbIndex): Unit
  
  def maximum(index: ThumbIndex): Unit
  
  def minimum(index: ThumbIndex): Unit
  
  def persist(): Unit
  
  var setValue: Dispatch[SetStateAction[RangeSliderValue]]
}
object RangeSliderControls {
  
  inline def apply(
    decrement: ThumbIndex => Unit,
    decrementJump: ThumbIndex => Unit,
    increment: ThumbIndex => Unit,
    incrementJump: ThumbIndex => Unit,
    maximum: ThumbIndex => Unit,
    minimum: ThumbIndex => Unit,
    persist: () => Unit,
    setValue: SetStateAction[RangeSliderValue] => Unit
  ): RangeSliderControls = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), decrementJump = js.Any.fromFunction1(decrementJump), increment = js.Any.fromFunction1(increment), incrementJump = js.Any.fromFunction1(incrementJump), maximum = js.Any.fromFunction1(maximum), minimum = js.Any.fromFunction1(minimum), persist = js.Any.fromFunction0(persist), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[RangeSliderControls]
  }
  
  extension [Self <: RangeSliderControls](x: Self) {
    
    inline def setDecrement(value: ThumbIndex => Unit): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
    
    inline def setDecrementJump(value: ThumbIndex => Unit): Self = StObject.set(x, "decrementJump", js.Any.fromFunction1(value))
    
    inline def setIncrement(value: ThumbIndex => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
    
    inline def setIncrementJump(value: ThumbIndex => Unit): Self = StObject.set(x, "incrementJump", js.Any.fromFunction1(value))
    
    inline def setMaximum(value: ThumbIndex => Unit): Self = StObject.set(x, "maximum", js.Any.fromFunction1(value))
    
    inline def setMinimum(value: ThumbIndex => Unit): Self = StObject.set(x, "minimum", js.Any.fromFunction1(value))
    
    inline def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: SetStateAction[RangeSliderValue] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
