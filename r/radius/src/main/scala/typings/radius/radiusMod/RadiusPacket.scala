package typings.radius.radiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusPacket extends js.Object {
  var attributes: js.Any
  var code: String
  var identifier: Double
  var length: Double
  var raw_attributes: js.Array[js.Array[_]]
}

object RadiusPacket {
  @scala.inline
  def apply(
    attributes: js.Any,
    code: String,
    identifier: Double,
    length: Double,
    raw_attributes: js.Array[js.Array[_]]
  ): RadiusPacket = {
    val __obj = js.Dynamic.literal(attributes = attributes, code = code, identifier = identifier, length = length, raw_attributes = raw_attributes)
  
    __obj.asInstanceOf[RadiusPacket]
  }
}

