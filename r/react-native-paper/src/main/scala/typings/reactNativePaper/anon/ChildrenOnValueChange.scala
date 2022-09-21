package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenOnValueChange extends StObject {
  
  var children: ReactNode
  
  def onValueChange(value: String): Unit | Null
  
  var value: String | Null
}
object ChildrenOnValueChange {
  
  inline def apply(onValueChange: String => Unit | Null): ChildrenOnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = null)
    __obj.asInstanceOf[ChildrenOnValueChange]
  }
  
  extension [Self <: ChildrenOnValueChange](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnValueChange(value: String => Unit | Null): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
