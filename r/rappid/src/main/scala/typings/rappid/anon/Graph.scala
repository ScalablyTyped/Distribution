package typings.rappid.anon

import typings.backbone.mod.Collection
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.Paper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph extends js.Object {
  
  var graph: typings.jointjs.mod.dia.Graph = js.native
  
  var model: Collection[Cell] = js.native
  
  var paper: Paper = js.native
}
object Graph {
  
  @scala.inline
  def apply(graph: typings.jointjs.mod.dia.Graph, model: Collection[Cell], paper: Paper): Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    
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
    def setGraph(value: typings.jointjs.mod.dia.Graph): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: Collection[Cell]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaper(value: Paper): Self = this.set("paper", value.asInstanceOf[js.Any])
  }
}
