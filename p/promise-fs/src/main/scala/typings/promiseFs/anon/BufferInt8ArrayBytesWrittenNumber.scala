package typings.promiseFs.anon

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt8ArrayBytesWrittenNumber extends js.Object {
  var buffer: Int8Array
  var bytesWritten: Double
}

object BufferInt8ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Int8Array, bytesWritten: Double): BufferInt8ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8ArrayBytesWrittenNumber]
  }
}

