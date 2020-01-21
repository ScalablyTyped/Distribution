package typings.reactAdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactAdal.reactAdalStrings.LOGIN
  - typings.reactAdal.reactAdalStrings.RENEW_TOKEN
  - typings.reactAdal.reactAdalStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typings.reactAdal.reactAdalStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typings.reactAdal.reactAdalStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typings.reactAdal.reactAdalStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

