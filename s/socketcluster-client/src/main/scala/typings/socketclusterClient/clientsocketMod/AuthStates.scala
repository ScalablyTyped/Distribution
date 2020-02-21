package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type WatcherFunction = (data: any) => void;
/* Rewritten from type alias, can be one of: 
  - typings.socketclusterClient.socketclusterClientStrings.authenticated
  - typings.socketclusterClient.socketclusterClientStrings.unauthenticated
*/
trait AuthStates extends js.Object

object AuthStates {
  @scala.inline
  def authenticated: typings.socketclusterClient.socketclusterClientStrings.authenticated = this.cast("authenticated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unauthenticated: typings.socketclusterClient.socketclusterClientStrings.unauthenticated = this.cast("unauthenticated")
}

