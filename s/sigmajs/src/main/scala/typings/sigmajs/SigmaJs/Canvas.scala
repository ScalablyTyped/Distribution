package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends StObject {
  
  var edges: StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
  ] = js.native
  
  var labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]] = js.native
  
  var nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]] = js.native
}
object Canvas {
  
  @scala.inline
  def apply(
    edges: StringDictionary[
      js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
    ],
    labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]],
    nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]
  ): Canvas = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  @scala.inline
  implicit class CanvasMutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(
      value: StringDictionary[
          js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
        ]
    ): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
