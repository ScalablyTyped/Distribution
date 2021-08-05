package typings.reactCytoscapejs

import typings.cytoscape.mod.ElementDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Edges extends StObject {
    
    var edges: js.Array[ElementDefinition]
    
    var nodes: js.Array[ElementDefinition]
  }
  object Edges {
    
    inline def apply(edges: js.Array[ElementDefinition], nodes: js.Array[ElementDefinition]): Edges = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edges]
    }
    
    extension [Self <: Edges](x: Self) {
      
      inline def setEdges(value: js.Array[ElementDefinition]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: ElementDefinition*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      inline def setNodes(value: js.Array[ElementDefinition]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ElementDefinition*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
}
