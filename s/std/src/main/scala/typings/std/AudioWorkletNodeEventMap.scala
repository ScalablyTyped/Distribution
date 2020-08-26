package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioWorkletNodeEventMap extends js.Object {
  var processorerror: Event = js.native
}

object AudioWorkletNodeEventMap {
  @scala.inline
  def apply(processorerror: Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  @scala.inline
  implicit class AudioWorkletNodeEventMapOps[Self <: AudioWorkletNodeEventMap] (val x: Self) extends AnyVal {
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
    def setProcessorerror(value: Event): Self = this.set("processorerror", value.asInstanceOf[js.Any])
  }
  
}

