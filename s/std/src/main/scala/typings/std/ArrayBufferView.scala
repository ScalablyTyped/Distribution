package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayBufferView extends BufferSource {
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  var buffer: ArrayBufferLike = js.native
  /**
    * The length in bytes of the array.
    */
  var byteLength: Double = js.native
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: Double = js.native
}

object ArrayBufferView {
  @scala.inline
  def apply(buffer: ArrayBufferLike, byteLength: Double, byteOffset: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
  @scala.inline
  implicit class ArrayBufferViewOps[Self <: ArrayBufferView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: ArrayBufferLike): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteOffset(value: Double): Self = this.set("byteOffset", value.asInstanceOf[js.Any])
  }
  
}

