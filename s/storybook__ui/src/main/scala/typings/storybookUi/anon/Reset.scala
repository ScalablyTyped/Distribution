package typings.storybookUi.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reset extends StObject {
  
  var reset: MouseEventHandler[Element]
  
  var zoomIn: MouseEventHandler[Element]
  
  var zoomOut: MouseEventHandler[Element]
}
object Reset {
  
  inline def apply(
    reset: MouseEvent[Element, NativeMouseEvent] => Unit,
    zoomIn: MouseEvent[Element, NativeMouseEvent] => Unit,
    zoomOut: MouseEvent[Element, NativeMouseEvent] => Unit
  ): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), zoomIn = js.Any.fromFunction1(zoomIn), zoomOut = js.Any.fromFunction1(zoomOut))
    __obj.asInstanceOf[Reset]
  }
  
  extension [Self <: Reset](x: Self) {
    
    inline def setReset(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setZoomIn(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
    
    inline def setZoomOut(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction1(value))
  }
}
