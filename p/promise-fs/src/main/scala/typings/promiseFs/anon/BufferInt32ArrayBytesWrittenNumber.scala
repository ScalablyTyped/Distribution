package typings.promiseFs.anon

import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt32ArrayBytesWrittenNumber extends js.Object {
  var buffer: Int32Array
  var bytesWritten: Double
}

object BufferInt32ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Int32Array, bytesWritten: Double): BufferInt32ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt32ArrayBytesWrittenNumber]
  }
}

