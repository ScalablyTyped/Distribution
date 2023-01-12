package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  def focus(): Unit
  
  def start(): Unit
  
  def stop(): Unit
}
object Focus {
  
  inline def apply(focus: () => Unit, start: () => Unit, stop: () => Unit): Focus = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Focus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
