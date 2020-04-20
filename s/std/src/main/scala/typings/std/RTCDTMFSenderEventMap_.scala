package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDTMFSenderEventMap_ extends js.Object {
  var tonechange: RTCDTMFToneChangeEvent
}

object RTCDTMFSenderEventMap_ {
  @scala.inline
  def apply(tonechange: RTCDTMFToneChangeEvent): RTCDTMFSenderEventMap_ = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFSenderEventMap_]
  }
}

