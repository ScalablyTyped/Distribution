package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var `type`: start
  def payload(): js.Promise[Unit]
}

object Anon_Payload {
  @scala.inline
  def apply(payload: () => js.Promise[Unit], `type`: start): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Payload]
  }
}

