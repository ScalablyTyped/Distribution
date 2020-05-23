package typings.promiseFs.anon

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesRead extends js.Object {
  var buffer: Uint8ClampedArray
  var bytesRead: Double
}

object BytesRead {
  @scala.inline
  def apply(buffer: Uint8ClampedArray, bytesRead: Double): BytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
}

