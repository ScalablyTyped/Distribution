package typings.promiseFs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFloat32Array extends js.Object {
  var buffer: Float32Array
  var bytesRead: Double
}

object AnonBufferFloat32Array {
  @scala.inline
  def apply(buffer: Float32Array, bytesRead: Double): AnonBufferFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferFloat32Array]
  }
}

