package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDTMFSenderEventMap extends js.Object {
  var tonechange: RTCDTMFToneChangeEvent
}

trait RTCDtmfSenderEventMap extends js.Object {
  var tonechange: RTCDTMFToneChangeEvent
}

object RTCDTMFSenderEventMap {
  @scala.inline
  def apply(tonechange: RTCDTMFToneChangeEvent): RTCDTMFSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange)
  
    __obj.asInstanceOf[RTCDTMFSenderEventMap]
  }
}

object RTCDtmfSenderEventMap {
  @scala.inline
  def apply(tonechange: RTCDTMFToneChangeEvent): RTCDtmfSenderEventMap = {
    val __obj = js.Dynamic.literal(tonechange = tonechange)
  
    __obj.asInstanceOf[RTCDtmfSenderEventMap]
  }
}

