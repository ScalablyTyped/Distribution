package typings.reactDashNativeDashNavigation.libDistCommandsLayoutTreeCrawlerMod

import typings.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutNode extends js.Object {
  var children: js.Array[LayoutNode]
  var data: Data
  var id: String
  var `type`: LayoutType
}

object LayoutNode {
  @scala.inline
  def apply(children: js.Array[LayoutNode], data: Data, id: String, `type`: LayoutType): LayoutNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutNode]
  }
}

