package typings.reactNative.mod

import typings.reactNative.anon.Endcursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraRollAssetInfo extends StObject {
  
  var edges: js.Array[CameraRollEdgeInfo]
  
  var page_info: Endcursor
}
object CameraRollAssetInfo {
  
  inline def apply(edges: js.Array[CameraRollEdgeInfo], page_info: Endcursor): CameraRollAssetInfo = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollAssetInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraRollAssetInfo] (val x: Self) extends AnyVal {
    
    inline def setEdges(value: js.Array[CameraRollEdgeInfo]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: CameraRollEdgeInfo*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setPage_info(value: Endcursor): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
