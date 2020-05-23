package typings.snykDepGraph.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var info: NodeInfo
}

object Node {
  @scala.inline
  def apply(info: NodeInfo): Node = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

