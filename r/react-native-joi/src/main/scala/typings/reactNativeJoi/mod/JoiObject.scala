package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoiObject extends StObject {
  
  var isJoi: Boolean
}
object JoiObject {
  
  inline def apply(isJoi: Boolean): JoiObject = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoiObject]
  }
  
  extension [Self <: JoiObject](x: Self) {
    
    inline def setIsJoi(value: Boolean): Self = StObject.set(x, "isJoi", value.asInstanceOf[js.Any])
  }
}
