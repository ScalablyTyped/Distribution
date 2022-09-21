package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateComponent extends StObject {
  
  var count: Double
  
  var depth: Double
  
  var mode: String
  
  var tag: String
}
object HydrateComponent {
  
  inline def apply(count: Double, depth: Double, mode: String, tag: String): HydrateComponent = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateComponent]
  }
  
  extension [Self <: HydrateComponent](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
