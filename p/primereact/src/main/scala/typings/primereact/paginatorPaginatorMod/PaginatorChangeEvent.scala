package typings.primereact.paginatorPaginatorMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom change event.
  * @see {@link PaginatorRowsPerPageDropdownOptions.onChange}
  * @event
  */
trait PaginatorChangeEvent extends StObject {
  
  /**
    * Browser event.
    */
  var originalEvent: SyntheticEvent[Element, Event]
  
  /**
    * Prevents the default action of the event.
    */
  def preventDefault(): Unit
  
  /**
    * Stops the event from propagating.
    */
  def stopPropagation(): Unit
  
  /**
    * Target options.
    */
  var target: PaginatorChangeTargetOptions
  
  /**
    * New value of the element.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object PaginatorChangeEvent {
  
  inline def apply(
    originalEvent: SyntheticEvent[Element, Event],
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: PaginatorChangeTargetOptions
  ): PaginatorChangeEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: PaginatorChangeTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
