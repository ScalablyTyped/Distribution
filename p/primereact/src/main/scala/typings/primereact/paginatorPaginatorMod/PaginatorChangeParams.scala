package typings.primereact.paginatorPaginatorMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorChangeParams extends StObject {
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  def preventDefault(): Unit
  
  def stopPropagation(): Unit
  
  var target: PaginatorChangeTargetOptions
  
  var value: js.UndefOr[String | Null] = js.undefined
}
object PaginatorChangeParams {
  
  inline def apply(
    originalEvent: SyntheticEvent[Element, Event],
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: PaginatorChangeTargetOptions
  ): PaginatorChangeParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorChangeParams]
  }
  
  extension [Self <: PaginatorChangeParams](x: Self) {
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: PaginatorChangeTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
