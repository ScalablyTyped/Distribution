package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseDown extends StObject {
  
  def onMouseDown(e: js.Any): Unit = js.native
  
  def onMouseLeave(e: js.Any): Unit = js.native
  
  def onMouseMove(e: js.Any): Unit = js.native
  
  def onMouseOut(): Unit = js.native
  
  def onMouseOver(): Unit = js.native
  
  def onMouseUp(e: js.Any): Unit = js.native
}
object OnMouseDown {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OnMouseDownMutableBuilder[Self <: OnMouseDown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeave(value: js.Any => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMove(value: js.Any => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOut(value: () => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseOver(value: () => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseUp(value: js.Any => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
  }
}
