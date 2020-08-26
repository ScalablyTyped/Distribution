package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codec extends js.Object {
  var codec: String = js.native
  var encoding: js.UndefOr[Double] = js.native
  var payload: Double = js.native
  var rate: js.UndefOr[Double] = js.native
}

object Codec {
  @scala.inline
  def apply(codec: String, payload: Double): Codec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  @scala.inline
  implicit class CodecOps[Self <: Codec] (val x: Self) extends AnyVal {
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
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Double): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: Double): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
  }
  
}

