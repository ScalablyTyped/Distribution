package typings.reactAsync

import typings.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var `type`: start
  def payload(): js.Promise[Unit]
}

object AnonPayload {
  @scala.inline
  def apply(payload: () => js.Promise[Unit], `type`: start): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

