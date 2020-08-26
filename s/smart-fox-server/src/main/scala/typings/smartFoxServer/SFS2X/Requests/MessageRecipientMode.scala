package typings.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRecipientMode extends js.Object {
  /** @type {number} Returns the selected recipient mode. */
  var mode: Double = js.native
  /** @type {any} Returns the moderator/administrator message target, according to the selected recipient mode. */
  var target: js.Any = js.native
}

object MessageRecipientMode {
  @scala.inline
  def apply(mode: Double, target: js.Any): MessageRecipientMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipientMode]
  }
  @scala.inline
  implicit class MessageRecipientModeOps[Self <: MessageRecipientMode] (val x: Self) extends AnyVal {
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
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

