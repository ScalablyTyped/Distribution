package typings.socketDotIoDotUsers.socketDotIoDotUsersMod

import typings.express.expressMod.Application
import typings.expressDashSession.expressDashSessionMod.SessionOptions
import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CONNECTION_EVENTS: js.Array[String] = js.native
  var Middleware: js.Function0[js.Function2[/* socket */ Socket, /* next */ js.Function0[js.Any], Unit]] = js.native
  var Session: js.Function2[/* app */ Application, /* options */ js.UndefOr[SessionOptions], Unit] = js.native
}

