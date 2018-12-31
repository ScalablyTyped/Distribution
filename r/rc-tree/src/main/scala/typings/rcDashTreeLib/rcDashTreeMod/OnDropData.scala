package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDropData extends js.Object {
  var dragNode: InternalTreeNode
  var dragNodesKeys: js.Array[java.lang.String]
  var dropPosition: scala.Double
  var dropToGap: js.UndefOr[scala.Boolean] = js.undefined
  var event: reactLib.Event
  var node: InternalTreeNode
}

