package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinementItem[T] extends StObject {
  
  var label: String
  
  var value: T
}
object RefinementItem {
  
  inline def apply[T](label: String, value: T): RefinementItem[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementItem[T]]
  }
  
  extension [Self <: RefinementItem[?], T](x: Self & RefinementItem[T]) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
