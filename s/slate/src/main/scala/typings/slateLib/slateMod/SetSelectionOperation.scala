package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSelectionOperation extends Operation {
  var properties: RangeProperties
  var selection: Range
  var `type`: slateLib.slateLibStrings.set_selection
}

object SetSelectionOperation {
  @scala.inline
  def apply(properties: RangeProperties, selection: Range, `type`: slateLib.slateLibStrings.set_selection): SetSelectionOperation = {
    val __obj = js.Dynamic.literal(properties = properties, selection = selection)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetSelectionOperation]
  }
}

