package typings.promiseFs.anon

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesWrittenNumber extends js.Object {
  var buffer: Uint32Array
  var bytesWritten: Double
}

object BytesWrittenNumber {
  @scala.inline
  def apply(buffer: Uint32Array, bytesWritten: Double): BytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWrittenNumber]
  }
}

