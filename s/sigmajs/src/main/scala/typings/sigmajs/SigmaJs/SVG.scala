package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.anon.DictrenderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVG extends js.Object {
  
  var edges: DictrenderType = js.native
  
  var labels: StringDictionary[SVGObject[Node]] = js.native
  
  var nodes: StringDictionary[SVGObject[Node]] = js.native
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
  implicit class SVGOps[Self <: SVG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdges(value: DictrenderType): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[SVGObject[Node]]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: StringDictionary[SVGObject[Node]]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
