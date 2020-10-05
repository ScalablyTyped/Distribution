package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackCueEventMap extends js.Object {
  var enter: Event = js.native
  var exit: Event = js.native
}

object TextTrackCueEventMap {
  @scala.inline
  def apply(enter: Event, exit: Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
  @scala.inline
  implicit class TextTrackCueEventMapOps[Self <: TextTrackCueEventMap] (val x: Self) extends AnyVal {
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
    def setEnter(value: Event): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: Event): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
  
}

