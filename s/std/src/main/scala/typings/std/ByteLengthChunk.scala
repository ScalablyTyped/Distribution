package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteLengthChunk extends js.Object {
  var byteLength: js.UndefOr[Double] = js.native
}

object ByteLengthChunk {
  @scala.inline
  def apply(): ByteLengthChunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteLengthChunk]
  }
  @scala.inline
  implicit class ByteLengthChunkOps[Self <: ByteLengthChunk] (val x: Self) extends AnyVal {
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
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteLength: Self = this.set("byteLength", js.undefined)
  }
  
}

