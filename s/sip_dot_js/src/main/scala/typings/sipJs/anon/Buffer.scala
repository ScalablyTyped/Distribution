package typings.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  var buffer: String = js.native
  var buflen: Double = js.native
  var length: Double = js.native
  var state: js.Array[Double] = js.native
}

object Buffer {
  @scala.inline
  def apply(buffer: String, buflen: Double, length: Double, state: js.Array[Double]): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], buflen = buflen.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
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
    def setBuffer(value: String): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuflen(value: Double): Self = this.set("buflen", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateVarargs(value: Double*): Self = this.set("state", js.Array(value :_*))
    @scala.inline
    def setState(value: js.Array[Double]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

