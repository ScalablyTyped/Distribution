package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateYTransform extends StObject {
  
  var rotateY: String
}
object RotateYTransform {
  
  inline def apply(rotateY: String): RotateYTransform = {
    val __obj = js.Dynamic.literal(rotateY = rotateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateYTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateYTransform] (val x: Self) extends AnyVal {
    
    inline def setRotateY(value: String): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
  }
}
