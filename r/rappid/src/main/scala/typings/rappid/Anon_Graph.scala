package typings.rappid

import typings.backbone.backboneMod.Collection
import typings.jointjs.jointjsMod.diaNs.Cell
import typings.jointjs.jointjsMod.diaNs.Graph
import typings.jointjs.jointjsMod.diaNs.Paper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Graph extends js.Object {
  var graph: Graph
  var model: Collection[Cell]
  var paper: Paper
}

object Anon_Graph {
  @scala.inline
  def apply(graph: Graph, model: Collection[Cell], paper: Paper): Anon_Graph = {
    val __obj = js.Dynamic.literal(graph = graph, model = model, paper = paper)
  
    __obj.asInstanceOf[Anon_Graph]
  }
}

