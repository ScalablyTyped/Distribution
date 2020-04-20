package typings.promiseFs

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesWrittenNumber extends js.Object {
  var buffer: Uint32Array
  var bytesWritten: Double
}

object AnonBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Uint32Array, bytesWritten: Double): AnonBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesWrittenNumber]
  }
}

