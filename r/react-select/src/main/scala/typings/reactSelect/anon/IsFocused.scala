package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocused extends StObject {
  
  var isFocused: Boolean
  
  var size: Double
}
object IsFocused {
  
  inline def apply(isFocused: Boolean, size: Double): IsFocused = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocused]
  }
  
  extension [Self <: IsFocused](x: Self) {
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
