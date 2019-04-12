package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSelectionOperation extends Operation {
  var data: Data
  var newProperties: SelectionProperties
  var properties: SelectionProperties
  var `type`: slateLib.slateLibStrings.set_selection
}

object SetSelectionOperation {
  @scala.inline
  def apply(
    data: Data,
    newProperties: SelectionProperties,
    properties: SelectionProperties,
    `type`: slateLib.slateLibStrings.set_selection
  ): SetSelectionOperation = {
    val __obj = js.Dynamic.literal(data = data, newProperties = newProperties, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetSelectionOperation]
  }
}

