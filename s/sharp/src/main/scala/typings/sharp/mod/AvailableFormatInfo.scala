package typings.sharp.mod

import typings.sharp.AnonBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableFormatInfo extends js.Object {
  var id: String
  var input: AnonBuffer
  var output: AnonBuffer
}

object AvailableFormatInfo {
  @scala.inline
  def apply(id: String, input: AnonBuffer, output: AnonBuffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
}

