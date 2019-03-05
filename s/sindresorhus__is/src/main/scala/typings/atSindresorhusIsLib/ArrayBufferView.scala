package typings
package atSindresorhusIsLib

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
  var byteLength: scala.Double
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: scala.Double
}

object ArrayBufferView {
  @scala.inline
  def apply(buffer: ArrayBufferLike, byteLength: scala.Double, byteOffset: scala.Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer, byteLength = byteLength, byteOffset = byteOffset)
  
    __obj.asInstanceOf[ArrayBufferView]
  }
}

