package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtmfSenderEventMap extends js.Object {
  var tonechange: RTCDTMFToneChangeEvent
}

object RTCDtmfSenderEventMap {
  @scala.inline
  def apply(tonechange: RTCDTMFToneChangeEvent): RTCDtmfSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtmfSenderEventMap]
  }
}

