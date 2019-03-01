package typings
package pusherDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackoffConnected extends js.Object {
  def backoff(): scala.Unit
  def connected(handshake: js.Any): scala.Unit
  def refused(): scala.Unit
  def retry(): scala.Unit
  def ssl_only(): scala.Unit
}

object Anon_BackoffConnected {
  @scala.inline
  def apply(
    backoff: js.Function0[scala.Unit],
    connected: js.Function1[js.Any, scala.Unit],
    refused: js.Function0[scala.Unit],
    retry: js.Function0[scala.Unit],
    ssl_only: js.Function0[scala.Unit]
  ): Anon_BackoffConnected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backoff")(backoff)
    __obj.updateDynamic("connected")(connected)
    __obj.updateDynamic("refused")(refused)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("ssl_only")(ssl_only)
    __obj.asInstanceOf[Anon_BackoffConnected]
  }
}

