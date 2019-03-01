package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: stdLib.Node
  var offset: scala.Double
}

object Anon_Node {
  @scala.inline
  def apply(node: stdLib.Node, offset: scala.Double): Anon_Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Node]
  }
}

