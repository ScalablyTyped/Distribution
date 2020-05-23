package typings.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRecipientMode extends js.Object {
  /** @type {number} Returns the selected recipient mode. */
  var mode: Double
  /** @type {any} Returns the moderator/administrator message target, according to the selected recipient mode. */
  var target: js.Any
}

object MessageRecipientMode {
  @scala.inline
  def apply(mode: Double, target: js.Any): MessageRecipientMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipientMode]
  }
}

