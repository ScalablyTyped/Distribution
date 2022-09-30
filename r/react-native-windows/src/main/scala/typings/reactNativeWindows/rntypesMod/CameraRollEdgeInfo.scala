package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraRollEdgeInfo extends StObject {
  
  var node: CameraRollNodeInfo
}
object CameraRollEdgeInfo {
  
  inline def apply(node: CameraRollNodeInfo): CameraRollEdgeInfo = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollEdgeInfo]
  }
  
  extension [Self <: CameraRollEdgeInfo](x: Self) {
    
    inline def setNode(value: CameraRollNodeInfo): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
