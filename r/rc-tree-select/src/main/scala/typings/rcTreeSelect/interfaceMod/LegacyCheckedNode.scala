package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyCheckedNode extends js.Object {
  var children: js.UndefOr[js.Array[LegacyCheckedNode]] = js.undefined
  var node: ReactElement
  var pos: String
}

object LegacyCheckedNode {
  @scala.inline
  def apply(node: ReactElement, pos: String, children: js.Array[LegacyCheckedNode] = null): LegacyCheckedNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyCheckedNode]
  }
}

