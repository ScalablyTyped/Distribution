package typings.promiseFs.anon

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferBytesWritten extends js.Object {
  var buffer: Uint8ClampedArray
  var bytesWritten: Double
}

object BufferBytesWritten {
  @scala.inline
  def apply(buffer: Uint8ClampedArray, bytesWritten: Double): BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesWritten]
  }
}

