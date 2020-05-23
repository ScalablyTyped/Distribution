package typings.sharp.mod

import typings.sharp.anon.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableFormatInfo extends js.Object {
  var id: String
  var input: Buffer
  var output: Buffer
}

object AvailableFormatInfo {
  @scala.inline
  def apply(id: String, input: Buffer, output: Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
}

