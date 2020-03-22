package typings.promiseFs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesWritten extends js.Object {
  var buffer: Uint8Array
  var bytesWritten: Double
}

object AnonBytesWritten {
  @scala.inline
  def apply(buffer: Uint8Array, bytesWritten: Double): AnonBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesWritten]
  }
}

