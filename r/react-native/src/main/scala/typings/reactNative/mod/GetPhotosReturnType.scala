package typings.reactNative.mod

import typings.reactNative.anon.Hasnextpage
import typings.reactNative.anon.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhotosReturnType extends StObject {
  
  var edges: js.Array[Node]
  
  var page_info: Hasnextpage
}
object GetPhotosReturnType {
  
  inline def apply(edges: js.Array[Node], page_info: Hasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosReturnType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPhotosReturnType] (val x: Self) extends AnyVal {
    
    inline def setEdges(value: js.Array[Node]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: Node*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setPage_info(value: Hasnextpage): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
