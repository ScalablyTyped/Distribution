package typings.recorderJs.mod

import typings.std.Blob
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderResult extends js.Object {
  var blob: Blob = js.native
  var buffer: js.Array[Float32Array] = js.native
}

object RecorderResult {
  @scala.inline
  def apply(blob: Blob, buffer: js.Array[Float32Array]): RecorderResult = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderResult]
  }
  @scala.inline
  implicit class RecorderResultOps[Self <: RecorderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlob(value: Blob): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferVarargs(value: Float32Array*): Self = this.set("buffer", js.Array(value :_*))
    @scala.inline
    def setBuffer(value: js.Array[Float32Array]): Self = this.set("buffer", value.asInstanceOf[js.Any])
  }
  
}

