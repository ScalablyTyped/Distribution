package typings.recharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  var links: js.Array[Source]
  
  var nodes: js.Array[Any]
}
object Links {
  
  inline def apply(links: js.Array[Source], nodes: js.Array[Any]): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  extension [Self <: Links](x: Self) {
    
    inline def setLinks(value: js.Array[Source]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: Source*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Any*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
