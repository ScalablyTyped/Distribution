package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMouseDown extends StObject {
  
  def onMouseDown(e: js.Any): Unit
  
  def onMouseLeave(e: js.Any): Unit
  
  def onMouseMove(e: js.Any): Unit
  
  def onMouseOut(): Unit
  
  def onMouseOver(): Unit
  
  def onMouseUp(e: js.Any): Unit
}
object OnMouseDown {
  
  inline def apply(
    onMouseDown: js.Any => Unit,
    onMouseLeave: js.Any => Unit,
    onMouseMove: js.Any => Unit,
    onMouseOut: () => Unit,
    onMouseOver: () => Unit,
    onMouseUp: js.Any => Unit
  ): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOut = js.Any.fromFunction0(onMouseOut), onMouseOver = js.Any.fromFunction0(onMouseOver), onMouseUp = js.Any.fromFunction1(onMouseUp))
    __obj.asInstanceOf[OnMouseDown]
  }
  
  extension [Self <: OnMouseDown](x: Self) {
    
    inline def setOnMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeave(value: js.Any => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseMove(value: js.Any => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseOut(value: () => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction0(value))
    
    inline def setOnMouseOver(value: () => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction0(value))
    
    inline def setOnMouseUp(value: js.Any => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
  }
}
