package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolatedNode extends StObject {
  
  var __nodeId: Double
}
object InterpolatedNode {
  
  inline def apply(__nodeId: Double): InterpolatedNode = {
    val __obj = js.Dynamic.literal(__nodeId = __nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolatedNode]
  }
  
  extension [Self <: InterpolatedNode](x: Self) {
    
    inline def set__nodeId(value: Double): Self = StObject.set(x, "__nodeId", value.asInstanceOf[js.Any])
  }
}
