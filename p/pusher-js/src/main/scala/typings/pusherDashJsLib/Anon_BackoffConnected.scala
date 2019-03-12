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
    backoff: () => scala.Unit,
    connected: js.Any => scala.Unit,
    refused: () => scala.Unit,
    retry: () => scala.Unit,
    ssl_only: () => scala.Unit
  ): Anon_BackoffConnected = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), connected = js.Any.fromFunction1(connected), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
  
    __obj.asInstanceOf[Anon_BackoffConnected]
  }
}

