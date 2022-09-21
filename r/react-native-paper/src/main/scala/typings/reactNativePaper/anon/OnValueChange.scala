package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValueChange extends StObject {
  
  var children: ReactNode
  
  def onValueChange(value: String): Unit
  
  var value: String
}
object OnValueChange {
  
  inline def apply(onValueChange: String => Unit, value: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  
  extension [Self <: OnValueChange](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnValueChange(value: String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
