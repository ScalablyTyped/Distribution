package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(event: js.Any): Unit
  
  def onMouseDown(event: js.Any): Unit
  
  def onTouchEnd(event: js.Any): Unit
}
object OnClick {
  
  @scala.inline
  def apply(onClick: js.Any => Unit, onMouseDown: js.Any => Unit, onTouchEnd: js.Any => Unit): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: js.Any => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
  }
}
