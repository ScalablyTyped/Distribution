package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDTMFSenderEventMap_ extends js.Object {
  var tonechange: RTCDTMFToneChangeEvent = js.native
}

object RTCDTMFSenderEventMap_ {
  @scala.inline
  def apply(tonechange: RTCDTMFToneChangeEvent): RTCDTMFSenderEventMap_ = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFSenderEventMap_]
  }
  @scala.inline
  implicit class RTCDTMFSenderEventMap_Ops[Self <: RTCDTMFSenderEventMap_] (val x: Self) extends AnyVal {
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
    def setTonechange(value: RTCDTMFToneChangeEvent): Self = this.set("tonechange", value.asInstanceOf[js.Any])
  }
  
}

