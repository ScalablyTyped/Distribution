package typings.promiseFs

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferDataViewBytesWrittenNumber extends js.Object {
  var buffer: DataView
  var bytesWritten: Double
}

object AnonBufferDataViewBytesWrittenNumber {
  @scala.inline
  def apply(buffer: DataView, bytesWritten: Double): AnonBufferDataViewBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferDataViewBytesWrittenNumber]
  }
}

