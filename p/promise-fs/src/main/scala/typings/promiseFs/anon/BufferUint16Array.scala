package typings.promiseFs.anon

import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUint16Array extends js.Object {
  var buffer: Uint16Array
  var bytesWritten: Double
}

object BufferUint16Array {
  @scala.inline
  def apply(buffer: Uint16Array, bytesWritten: Double): BufferUint16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint16Array]
  }
}

