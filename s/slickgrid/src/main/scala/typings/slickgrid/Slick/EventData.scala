package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventData extends StObject {
  
  /***
    * Returns whether stopImmediatePropagation was called on this event object.\
    * @method isImmediatePropagationStopped
    * @return {Boolean}
    */
  def isImmediatePropagationStopped(): Boolean
  
  /***
    * Returns whether stopPropagation was called on this event object.
    * @method isPropagationStopped
    * @return {Boolean}
    */
  def isPropagationStopped(): Boolean
  
  /***
    * Prevents the rest of the handlers from being executed.
    * @method stopImmediatePropagation
    */
  def stopImmediatePropagation(): Unit
  
  /***
    * Stops event from propagating up the DOM tree.
    * @method stopPropagation
    */
  def stopPropagation(): Unit
}
object EventData {
  
  inline def apply(
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit
  ): EventData = {
    val __obj = js.Dynamic.literal(isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[EventData]
  }
  
  extension [Self <: EventData](x: Self) {
    
    inline def setIsImmediatePropagationStopped(value: () => Boolean): Self = StObject.set(x, "isImmediatePropagationStopped", js.Any.fromFunction0(value))
    
    inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
    
    inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
