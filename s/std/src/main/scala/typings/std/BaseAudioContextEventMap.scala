package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAudioContextEventMap extends js.Object {
  var statechange: Event = js.native
}

object BaseAudioContextEventMap {
  @scala.inline
  def apply(statechange: Event): BaseAudioContextEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAudioContextEventMap]
  }
  @scala.inline
  implicit class BaseAudioContextEventMapOps[Self <: BaseAudioContextEventMap] (val x: Self) extends AnyVal {
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
    def setStatechange(value: Event): Self = this.set("statechange", value.asInstanceOf[js.Any])
  }
  
}

