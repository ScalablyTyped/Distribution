package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateZTransform extends StObject {
  
  var rotateZ: String
}
object RotateZTransform {
  
  inline def apply(rotateZ: String): RotateZTransform = {
    val __obj = js.Dynamic.literal(rotateZ = rotateZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateZTransform]
  }
  
  extension [Self <: RotateZTransform](x: Self) {
    
    inline def setRotateZ(value: String): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
  }
}
