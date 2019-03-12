package typings
package pusherDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backoff extends js.Object {
  def backoff(): scala.Unit
  def refused(): scala.Unit
  def retry(): scala.Unit
  def ssl_only(): scala.Unit
}

object Anon_Backoff {
  @scala.inline
  def apply(
    backoff: () => scala.Unit,
    refused: () => scala.Unit,
    retry: () => scala.Unit,
    ssl_only: () => scala.Unit
  ): Anon_Backoff = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
  
    __obj.asInstanceOf[Anon_Backoff]
  }
}

