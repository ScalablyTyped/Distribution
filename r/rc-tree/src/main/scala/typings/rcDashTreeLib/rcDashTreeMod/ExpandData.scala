package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandData extends js.Object {
  var expanded: scala.Boolean
  var node: InternalTreeNode
}

object ExpandData {
  @scala.inline
  def apply(expanded: scala.Boolean, node: InternalTreeNode): ExpandData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[ExpandData]
  }
}

