package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferListEventMap extends js.Object {
  var addsourcebuffer: Event = js.native
  var removesourcebuffer: Event = js.native
}

object SourceBufferListEventMap {
  @scala.inline
  def apply(addsourcebuffer: Event, removesourcebuffer: Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  @scala.inline
  implicit class SourceBufferListEventMapOps[Self <: SourceBufferListEventMap] (val x: Self) extends AnyVal {
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
    def setAddsourcebuffer(value: Event): Self = this.set("addsourcebuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovesourcebuffer(value: Event): Self = this.set("removesourcebuffer", value.asInstanceOf[js.Any])
  }
  
}

