package typings.reactNative.mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraRollEdgeInfo] (val x: Self) extends AnyVal {
    
    inline def setNode(value: CameraRollNodeInfo): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
