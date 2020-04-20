package typings.promiseFs

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFloat64ArrayBytesWrittenNumber extends js.Object {
  var buffer: Float64Array
  var bytesWritten: Double
}

object AnonBufferFloat64ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Float64Array, bytesWritten: Double): AnonBufferFloat64ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferFloat64ArrayBytesWrittenNumber]
  }
}

