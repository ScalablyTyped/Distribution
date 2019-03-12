package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetValueOperation extends Operation {
  var properties: ValueProperties
  var `type`: slateLib.slateLibStrings.set_value
  var value: Value
}

object SetValueOperation {
  @scala.inline
  def apply(properties: ValueProperties, `type`: slateLib.slateLibStrings.set_value, value: Value): SetValueOperation = {
    val __obj = js.Dynamic.literal(properties = properties, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetValueOperation]
  }
}

