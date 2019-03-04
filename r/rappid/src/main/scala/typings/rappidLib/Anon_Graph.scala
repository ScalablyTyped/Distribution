package typings
package rappidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Graph extends js.Object {
  var graph: jointjsLib.jointjsMod.diaNs.Graph
  var model: backboneLib.backboneMod.Collection[jointjsLib.jointjsMod.diaNs.Cell]
  var paper: jointjsLib.jointjsMod.diaNs.Paper
}

object Anon_Graph {
  @scala.inline
  def apply(
    graph: jointjsLib.jointjsMod.diaNs.Graph,
    model: backboneLib.backboneMod.Collection[jointjsLib.jointjsMod.diaNs.Cell],
    paper: jointjsLib.jointjsMod.diaNs.Paper
  ): Anon_Graph = {
    val __obj = js.Dynamic.literal(graph = graph, model = model, paper = paper)
  
    __obj.asInstanceOf[Anon_Graph]
  }
}

