package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeNodeOperation extends Operation {
  var data: Data
  var path: Path
  var position: scala.Double
  var properties: NodeProperties
  var `type`: slateLib.slateLibStrings.merge_node
}

object MergeNodeOperation {
  @scala.inline
  def apply(
    data: Data,
    path: Path,
    position: scala.Double,
    properties: NodeProperties,
    `type`: slateLib.slateLibStrings.merge_node
  ): MergeNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, path = path.asInstanceOf[js.Any], position = position, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MergeNodeOperation]
  }
}

