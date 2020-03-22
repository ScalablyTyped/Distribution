package typings.promiseFs

import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt32Array extends js.Object {
  var buffer: Int32Array
  var bytesRead: Double
}

object AnonBufferInt32Array {
  @scala.inline
  def apply(buffer: Int32Array, bytesRead: Double): AnonBufferInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferInt32Array]
  }
}

