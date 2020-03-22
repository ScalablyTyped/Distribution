package typings.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnected extends js.Object {
  def backoff(): Unit
  def connected(handshake: js.Any): Unit
  def refused(): Unit
  def retry(): Unit
  def ssl_only(): Unit
}

object AnonConnected {
  @scala.inline
  def apply(
    backoff: () => Unit,
    connected: js.Any => Unit,
    refused: () => Unit,
    retry: () => Unit,
    ssl_only: () => Unit
  ): AnonConnected = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), connected = js.Any.fromFunction1(connected), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
  
    __obj.asInstanceOf[AnonConnected]
  }
}

