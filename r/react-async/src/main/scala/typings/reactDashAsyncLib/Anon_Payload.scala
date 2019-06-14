package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var `type`: reactDashAsyncLib.reactDashAsyncLibStrings.start
  def payload(): js.Promise[scala.Unit]
}

object Anon_Payload {
  @scala.inline
  def apply(payload: () => js.Promise[scala.Unit], `type`: reactDashAsyncLib.reactDashAsyncLibStrings.start): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Payload]
  }
}

