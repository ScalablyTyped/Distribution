package typings.promiseFs

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt8ArrayBytesWrittenNumber extends js.Object {
  var buffer: Int8Array
  var bytesWritten: Double
}

object AnonBufferInt8ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Int8Array, bytesWritten: Double): AnonBufferInt8ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferInt8ArrayBytesWrittenNumber]
  }
}

