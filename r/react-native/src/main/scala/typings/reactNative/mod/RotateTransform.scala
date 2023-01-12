package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTransform extends StObject {
  
  var rotate: String
}
object RotateTransform {
  
  inline def apply(rotate: String): RotateTransform = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateTransform] (val x: Self) extends AnyVal {
    
    inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
