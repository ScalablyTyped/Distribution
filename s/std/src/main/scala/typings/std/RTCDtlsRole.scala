package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.auto
  - typings.std.stdStrings.client
  - typings.std.stdStrings.server
*/
trait RTCDtlsRole extends js.Object

object RTCDtlsRole {
  @scala.inline
  def auto: typings.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client: typings.std.stdStrings.client = this.cast("client")
  @scala.inline
  def server: typings.std.stdStrings.server = this.cast("server")
}

