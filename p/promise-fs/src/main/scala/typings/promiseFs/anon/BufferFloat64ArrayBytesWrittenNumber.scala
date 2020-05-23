package typings.promiseFs.anon

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferFloat64ArrayBytesWrittenNumber extends js.Object {
  var buffer: Float64Array
  var bytesWritten: Double
}

object BufferFloat64ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Float64Array, bytesWritten: Double): BufferFloat64ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat64ArrayBytesWrittenNumber]
  }
}

