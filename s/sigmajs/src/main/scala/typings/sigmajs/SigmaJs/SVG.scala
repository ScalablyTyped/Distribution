package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.anon.DictrenderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVG extends StObject {
  
  var edges: DictrenderType
  
  var labels: StringDictionary[SVGObject[Node]]
  
  var nodes: StringDictionary[SVGObject[Node]]
}
object SVG {
  
  @scala.inline
  def apply(
    edges: DictrenderType,
    labels: StringDictionary[SVGObject[Node]],
    nodes: StringDictionary[SVGObject[Node]]
  ): SVG = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVG]
  }
  
  @scala.inline
  implicit class SVGMutableBuilder[Self <: SVG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: DictrenderType): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[SVGObject[Node]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: StringDictionary[SVGObject[Node]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
