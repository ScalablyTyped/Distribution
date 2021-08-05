package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnTouchCancel extends StObject {
  
  def onTouchCancel(e: js.Any): Unit
  
  def onTouchEnd(e: js.Any): Unit
  
  def onTouchMove(e: js.Any): Unit
  
  def onTouchStart(e: js.Any): Unit
}
object OnTouchCancel {
  
  inline def apply(
    onTouchCancel: js.Any => Unit,
    onTouchEnd: js.Any => Unit,
    onTouchMove: js.Any => Unit,
    onTouchStart: js.Any => Unit
  ): OnTouchCancel = {
    val __obj = js.Dynamic.literal(onTouchCancel = js.Any.fromFunction1(onTouchCancel), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[OnTouchCancel]
  }
  
  extension [Self <: OnTouchCancel](x: Self) {
    
    inline def setOnTouchCancel(value: js.Any => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchEnd(value: js.Any => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchMove(value: js.Any => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchStart(value: js.Any => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
  }
}
