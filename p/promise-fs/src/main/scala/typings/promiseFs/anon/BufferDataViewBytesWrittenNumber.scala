package typings.promiseFs.anon

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferDataViewBytesWrittenNumber extends js.Object {
  var buffer: DataView
  var bytesWritten: Double
}

object BufferDataViewBytesWrittenNumber {
  @scala.inline
  def apply(buffer: DataView, bytesWritten: Double): BufferDataViewBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataViewBytesWrittenNumber]
  }
}

