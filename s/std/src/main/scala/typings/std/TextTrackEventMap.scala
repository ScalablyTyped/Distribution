package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackEventMap extends js.Object {
  var cuechange: Event = js.native
}

object TextTrackEventMap {
  @scala.inline
  def apply(cuechange: Event): TextTrackEventMap = {
    val __obj = js.Dynamic.literal(cuechange = cuechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackEventMap]
  }
  @scala.inline
  implicit class TextTrackEventMapOps[Self <: TextTrackEventMap] (val x: Self) extends AnyVal {
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
    def setCuechange(value: Event): Self = this.set("cuechange", value.asInstanceOf[js.Any])
  }
  
}

