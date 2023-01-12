package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenContext extends StObject {
  
  var active: Boolean
  
  def onBlur(e: Any): Unit
  
  def onClick(e: Any): Unit
  
  def onFocus(e: Any): Unit
  
  def onKeyDown(e: Any): Unit
}
object TokenContext {
  
  inline def apply(
    active: Boolean,
    onBlur: Any => Unit,
    onClick: Any => Unit,
    onFocus: Any => Unit,
    onKeyDown: Any => Unit
  ): TokenContext = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[TokenContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenContext] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: Any => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
  }
}
