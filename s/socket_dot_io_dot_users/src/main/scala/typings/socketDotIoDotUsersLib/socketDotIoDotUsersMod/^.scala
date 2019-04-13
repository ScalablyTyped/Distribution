package typings
package socketDotIoDotUsersLib.socketDotIoDotUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CONNECTION_EVENTS: js.Array[java.lang.String] = js.native
  var Middleware: js.Function0[
    js.Function2[
      /* socket */ socketDotIoLib.socketDotIoMod.Socket, 
      /* next */ js.Function0[js.Any], 
      scala.Unit
    ]
  ] = js.native
  var Session: js.Function2[
    /* app */ expressLib.expressMod.Application, 
    /* options */ js.UndefOr[expressDashSessionLib.expressDashSessionMod.SessionOptions], 
    scala.Unit
  ] = js.native
}

