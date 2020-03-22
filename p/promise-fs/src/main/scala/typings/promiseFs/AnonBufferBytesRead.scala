package typings.promiseFs

import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesRead extends js.Object {
  var buffer: Uint16Array
  var bytesRead: Double
}

object AnonBufferBytesRead {
  @scala.inline
  def apply(buffer: Uint16Array, bytesRead: Double): AnonBufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesRead]
  }
}

