package typings.sharp.sharpMod

import typings.sharp.Anon_Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableFormatInfo extends js.Object {
  var id: String
  var input: Anon_Buffer
  var output: Anon_Buffer
}

object AvailableFormatInfo {
  @scala.inline
  def apply(id: String, input: Anon_Buffer, output: Anon_Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id, input = input, output = output)
  
    __obj.asInstanceOf[AvailableFormatInfo]
  }
}

