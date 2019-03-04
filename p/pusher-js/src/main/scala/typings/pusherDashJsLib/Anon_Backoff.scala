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
    backoff: js.Function0[scala.Unit],
    refused: js.Function0[scala.Unit],
    retry: js.Function0[scala.Unit],
    ssl_only: js.Function0[scala.Unit]
  ): Anon_Backoff = {
    val __obj = js.Dynamic.literal(backoff = backoff, refused = refused, retry = retry, ssl_only = ssl_only)
  
    __obj.asInstanceOf[Anon_Backoff]
  }
}

