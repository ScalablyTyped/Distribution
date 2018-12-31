package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckData extends js.Object {
  var checked: scala.Boolean
  var checkedNodes: js.Array[InternalTreeNode]
  var event: rcDashTreeLib.rcDashTreeLibStrings.check
  var halfCheckedKeys: js.Array[java.lang.String]
  var node: InternalTreeNode
}

