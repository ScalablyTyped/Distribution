package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSourceEventMap extends js.Object {
  var sourceclose: Event = js.native
  var sourceended: Event = js.native
  var sourceopen: Event = js.native
}

object MediaSourceEventMap {
  @scala.inline
  def apply(sourceclose: Event, sourceended: Event, sourceopen: Event): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
  @scala.inline
  implicit class MediaSourceEventMapOps[Self <: MediaSourceEventMap] (val x: Self) extends AnyVal {
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
    def setSourceclose(value: Event): Self = this.set("sourceclose", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceended(value: Event): Self = this.set("sourceended", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceopen(value: Event): Self = this.set("sourceopen", value.asInstanceOf[js.Any])
  }
  
}

