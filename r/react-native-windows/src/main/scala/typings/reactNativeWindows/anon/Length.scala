package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var index: Double
  
  var length: Double
  
  var offset: Double
}
object Length {
  
  inline def apply(index: Double, length: Double, offset: Double): Length = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
