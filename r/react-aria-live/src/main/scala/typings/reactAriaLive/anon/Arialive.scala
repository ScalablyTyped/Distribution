package typings.reactAriaLive.anon

import typings.reactAriaLive.reactAriaLiveStrings.assertive
import typings.reactAriaLive.reactAriaLiveStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arialive extends js.Object {
  var `aria-live`: assertive | polite = js.native
  var clearOnUnmount: js.UndefOr[Boolean] = js.native
  var message: String = js.native
}

object Arialive {
  @scala.inline
  def apply(`aria-live`: assertive | polite, message: String): Arialive = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialive]
  }
  @scala.inline
  implicit class ArialiveOps[Self <: Arialive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-live`(value: assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearOnUnmount(value: Boolean): Self = this.set("clearOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearOnUnmount: Self = this.set("clearOnUnmount", js.undefined)
  }
  
}

