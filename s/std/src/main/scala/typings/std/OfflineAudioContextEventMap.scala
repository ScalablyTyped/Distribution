package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineAudioContextEventMap extends BaseAudioContextEventMap {
  var complete: OfflineAudioCompletionEvent = js.native
}

object OfflineAudioContextEventMap {
  @scala.inline
  def apply(complete: OfflineAudioCompletionEvent, statechange: Event): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
  @scala.inline
  implicit class OfflineAudioContextEventMapOps[Self <: OfflineAudioContextEventMap] (val x: Self) extends AnyVal {
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
    def setComplete(value: OfflineAudioCompletionEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
  }
  
}

