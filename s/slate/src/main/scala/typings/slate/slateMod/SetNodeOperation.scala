package typings.slate.slateMod

import typings.slate.slateStrings.set_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNodeOperation extends Operation {
  var data: Data
  var newProperties: NodeProperties
  var path: Path
  var properties: NodeProperties
  var `type`: set_node
}

object SetNodeOperation {
  @scala.inline
  def apply(
    data: Data,
    newProperties: NodeProperties,
    path: Path,
    properties: NodeProperties,
    `type`: set_node
  ): SetNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, newProperties = newProperties, path = path.asInstanceOf[js.Any], properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetNodeOperation]
  }
}

