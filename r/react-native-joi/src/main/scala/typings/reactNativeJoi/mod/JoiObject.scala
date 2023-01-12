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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoiObject] (val x: Self) extends AnyVal {
    
    inline def setIsJoi(value: Boolean): Self = StObject.set(x, "isJoi", value.asInstanceOf[js.Any])
  }
}
