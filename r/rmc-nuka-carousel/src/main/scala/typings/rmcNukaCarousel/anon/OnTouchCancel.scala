package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTouchCancel extends StObject {
  
  def onTouchCancel(e: js.Any): Unit = js.native
  
  def onTouchEnd(e: js.Any): Unit = js.native
  
  def onTouchMove(e: js.Any): Unit = js.native
  
  def onTouchStart(e: js.Any): Unit = js.native
}
object OnTouchCancel {
  
  @scala.inline
  def apply(
    onTouchCancel: js.Any => Unit,
    onTouchEnd: js.Any => Unit,
    onTouchMove: js.Any => Unit,
    onTouchStart: js.Any => Unit
  ): OnTouchCancel = {
    val __obj = js.Dynamic.literal(onTouchCancel = js.Any.fromFunction1(onTouchCancel), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[OnTouchCancel]
  }
  
  @scala.inline
  implicit class OnTouchCancelMutableBuilder[Self <: OnTouchCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnTouchCancel(value: js.Any => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: js.Any => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMove(value: js.Any => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: js.Any => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
  }
}
