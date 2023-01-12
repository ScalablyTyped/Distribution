package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTransform extends StObject {
  
  var scale: Double
}
object ScaleTransform {
  
  inline def apply(scale: Double): ScaleTransform = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleTransform] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
