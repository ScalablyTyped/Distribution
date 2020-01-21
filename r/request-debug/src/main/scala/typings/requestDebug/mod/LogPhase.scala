package typings.requestDebug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.requestDebug.requestDebugStrings.request
  - typings.requestDebug.requestDebugStrings.response
  - typings.requestDebug.requestDebugStrings.redirect
  - typings.requestDebug.requestDebugStrings.auth
*/
trait LogPhase extends js.Object

object LogPhase {
  @scala.inline
  def auth: typings.requestDebug.requestDebugStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def redirect: typings.requestDebug.requestDebugStrings.redirect = this.cast("redirect")
  @scala.inline
  def request: typings.requestDebug.requestDebugStrings.request = this.cast("request")
  @scala.inline
  def response: typings.requestDebug.requestDebugStrings.response = this.cast("response")
}

