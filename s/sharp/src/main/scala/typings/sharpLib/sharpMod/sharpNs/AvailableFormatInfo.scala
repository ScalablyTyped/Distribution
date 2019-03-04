package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableFormatInfo extends js.Object {
  var id: java.lang.String
  var input: sharpLib.Anon_Buffer
  var output: sharpLib.Anon_Buffer
}

object AvailableFormatInfo {
  @scala.inline
  def apply(id: java.lang.String, input: sharpLib.Anon_Buffer, output: sharpLib.Anon_Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id, input = input, output = output)
  
    __obj.asInstanceOf[AvailableFormatInfo]
  }
}

