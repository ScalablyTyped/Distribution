package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeySessionEventMap extends js.Object {
  var keystatuseschange: Event = js.native
  var message: MediaKeyMessageEvent = js.native
}

object MediaKeySessionEventMap {
  @scala.inline
  def apply(keystatuseschange: Event, message: MediaKeyMessageEvent): MediaKeySessionEventMap = {
    val __obj = js.Dynamic.literal(keystatuseschange = keystatuseschange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySessionEventMap]
  }
  @scala.inline
  implicit class MediaKeySessionEventMapOps[Self <: MediaKeySessionEventMap] (val x: Self) extends AnyVal {
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
    def setKeystatuseschange(value: Event): Self = this.set("keystatuseschange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MediaKeyMessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

