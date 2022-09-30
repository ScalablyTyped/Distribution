package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateXTransform extends StObject {
  
  var rotateX: String
}
object RotateXTransform {
  
  inline def apply(rotateX: String): RotateXTransform = {
    val __obj = js.Dynamic.literal(rotateX = rotateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateXTransform]
  }
  
  extension [Self <: RotateXTransform](x: Self) {
    
    inline def setRotateX(value: String): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
  }
}
