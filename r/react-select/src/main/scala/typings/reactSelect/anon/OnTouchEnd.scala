package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnTouchEnd extends StObject {
  
  var className: String
  
  def onClick(event: js.Any): Unit
  
  def onMouseDown(event: js.Any): Unit
  
  def onTouchEnd(event: js.Any): Unit
}
object OnTouchEnd {
  
  @scala.inline
  def apply(
    className: String,
    onClick: js.Any => Unit,
    onMouseDown: js.Any => Unit,
    onTouchEnd: js.Any => Unit
  ): OnTouchEnd = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[OnTouchEnd]
  }
  
  @scala.inline
  implicit class OnTouchEndMutableBuilder[Self <: OnTouchEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: js.Any => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: js.Any => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
  }
}
