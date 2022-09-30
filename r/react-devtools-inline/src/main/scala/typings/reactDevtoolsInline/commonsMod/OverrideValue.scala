package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideValue
  extends StObject
     with ElementAndRendererID {
  
  var path: js.Array[String | Double]
  
  var value: Any
  
  var wasForwarded: js.UndefOr[Boolean] = js.undefined
}
object OverrideValue {
  
  inline def apply(id: Double, path: js.Array[String | Double], rendererID: RendererID, value: Any): OverrideValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideValue]
  }
  
  extension [Self <: OverrideValue](x: Self) {
    
    inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWasForwarded(value: Boolean): Self = StObject.set(x, "wasForwarded", value.asInstanceOf[js.Any])
    
    inline def setWasForwardedUndefined: Self = StObject.set(x, "wasForwarded", js.undefined)
  }
}
