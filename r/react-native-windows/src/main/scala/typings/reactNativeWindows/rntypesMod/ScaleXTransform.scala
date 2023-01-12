package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleXTransform extends StObject {
  
  var scaleX: Double
}
object ScaleXTransform {
  
  inline def apply(scaleX: Double): ScaleXTransform = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleXTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleXTransform] (val x: Self) extends AnyVal {
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
  }
}
