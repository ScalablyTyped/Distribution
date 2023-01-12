package typings.reactSelect.anon

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  val name: String
  
  val onFocus: FocusEventHandler[HTMLInputElement]
}
object Name {
  
  inline def apply(name: String, onFocus: FocusEvent[HTMLInputElement, Element] => Unit): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus))
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
  }
}
