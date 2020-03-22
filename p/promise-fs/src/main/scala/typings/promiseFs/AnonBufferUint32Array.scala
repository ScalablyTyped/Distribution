package typings.promiseFs

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferUint32Array extends js.Object {
  var buffer: Uint32Array
  var bytesRead: Double
}

object AnonBufferUint32Array {
  @scala.inline
  def apply(buffer: Uint32Array, bytesRead: Double): AnonBufferUint32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferUint32Array]
  }
}

