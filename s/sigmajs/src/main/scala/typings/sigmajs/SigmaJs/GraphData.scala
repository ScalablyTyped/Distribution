package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphData extends js.Object {
  var edges: js.Array[Edge]
  var nodes: js.Array[Node]
}

object GraphData {
  @scala.inline
  def apply(edges: js.Array[Edge], nodes: js.Array[Node]): GraphData = {
    val __obj = js.Dynamic.literal(edges = edges, nodes = nodes)
  
    __obj.asInstanceOf[GraphData]
  }
}

