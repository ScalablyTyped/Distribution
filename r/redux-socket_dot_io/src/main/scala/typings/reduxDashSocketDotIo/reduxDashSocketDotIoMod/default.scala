package typings.reduxDashSocketDotIo.reduxDashSocketDotIoMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.socketDotIoDashClient.SocketIOClient.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-socket.io", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(socket: Socket, criteria: String): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(socket: Socket, criteria: String, options: MiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(socket: Socket, criteria: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(socket: Socket, criteria: js.Array[String], options: MiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(socket: Socket, criteria: js.Function2[/* type */ String, /* action */ Action[_], Boolean]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(
    socket: Socket,
    criteria: js.Function2[/* type */ String, /* action */ Action[_], Boolean],
    options: MiddlewareOptions
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

