package typings.slate.slateMod

import typings.slate.slateStrings.merge_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeNodeOperation extends Operation {
  var data: Data
  var path: Path
  var position: Double
  var properties: NodeProperties
  var `type`: merge_node
}

object MergeNodeOperation {
  @scala.inline
  def apply(data: Data, path: Path, position: Double, properties: NodeProperties, `type`: merge_node): MergeNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, path = path.asInstanceOf[js.Any], position = position, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MergeNodeOperation]
  }
}

