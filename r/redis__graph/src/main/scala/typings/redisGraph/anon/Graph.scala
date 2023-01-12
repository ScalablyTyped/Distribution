package typings.redisGraph.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph extends StObject {
  
  var graph: Query
}
object Graph {
  
  inline def apply(graph: Query): Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
    
    inline def setGraph(value: Query): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
  }
}
