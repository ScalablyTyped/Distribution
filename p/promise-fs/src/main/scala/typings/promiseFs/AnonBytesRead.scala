package typings.promiseFs

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesRead extends js.Object {
  var buffer: Uint8ClampedArray
  var bytesRead: Double
}

object AnonBytesRead {
  @scala.inline
  def apply(buffer: Uint8ClampedArray, bytesRead: Double): AnonBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesRead]
  }
}

