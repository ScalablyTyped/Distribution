package typings.promiseFs

import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferUint16Array extends js.Object {
  var buffer: Uint16Array
  var bytesWritten: Double
}

object AnonBufferUint16Array {
  @scala.inline
  def apply(buffer: Uint16Array, bytesWritten: Double): AnonBufferUint16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferUint16Array]
  }
}

