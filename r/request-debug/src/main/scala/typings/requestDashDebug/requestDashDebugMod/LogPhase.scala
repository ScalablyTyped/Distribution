package typings.requestDashDebug.requestDashDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.requestDashDebug.requestDashDebugStrings.request
  - typings.requestDashDebug.requestDashDebugStrings.response
  - typings.requestDashDebug.requestDashDebugStrings.redirect
  - typings.requestDashDebug.requestDashDebugStrings.auth
*/
trait LogPhase extends js.Object

object LogPhase {
  @scala.inline
  def auth: typings.requestDashDebug.requestDashDebugStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def redirect: typings.requestDashDebug.requestDashDebugStrings.redirect = this.cast("redirect")
  @scala.inline
  def request: typings.requestDashDebug.requestDashDebugStrings.request = this.cast("request")
  @scala.inline
  def response: typings.requestDashDebug.requestDashDebugStrings.response = this.cast("response")
}

