package typings.pusherDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backoff extends js.Object {
  def backoff(): Unit
  def refused(): Unit
  def retry(): Unit
  def ssl_only(): Unit
}

object Anon_Backoff {
  @scala.inline
  def apply(backoff: () => Unit, refused: () => Unit, retry: () => Unit, ssl_only: () => Unit): Anon_Backoff = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
  
    __obj.asInstanceOf[Anon_Backoff]
  }
}

