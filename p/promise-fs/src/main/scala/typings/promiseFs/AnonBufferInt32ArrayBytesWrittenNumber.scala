package typings.promiseFs

import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt32ArrayBytesWrittenNumber extends js.Object {
  var buffer: Int32Array
  var bytesWritten: Double
}

object AnonBufferInt32ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Int32Array, bytesWritten: Double): AnonBufferInt32ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferInt32ArrayBytesWrittenNumber]
  }
}

