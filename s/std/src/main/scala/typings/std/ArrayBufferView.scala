package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBufferView extends BufferSource {
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  var buffer: ArrayBufferLike
  /**
    * The length in bytes of the array.
    */
  var byteLength: Double
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: Double
}

object ArrayBufferView {
  @scala.inline
  def apply(buffer: ArrayBufferLike, byteLength: Double, byteOffset: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
}

