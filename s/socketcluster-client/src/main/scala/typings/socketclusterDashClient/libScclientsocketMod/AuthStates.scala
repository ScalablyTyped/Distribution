package typings.socketclusterDashClient.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socketclusterDashClient.socketclusterDashClientStrings.authenticated
  - typings.socketclusterDashClient.socketclusterDashClientStrings.unauthenticated
*/
trait AuthStates extends js.Object

object AuthStates {
  @scala.inline
  def authenticated: typings.socketclusterDashClient.socketclusterDashClientStrings.authenticated = this.cast("authenticated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unauthenticated: typings.socketclusterDashClient.socketclusterDashClientStrings.unauthenticated = this.cast("unauthenticated")
}

