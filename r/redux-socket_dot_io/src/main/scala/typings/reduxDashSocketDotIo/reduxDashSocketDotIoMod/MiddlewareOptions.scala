package typings.reduxDashSocketDotIo.reduxDashSocketDotIoMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Dispatch
import typings.socketDotIoDashClient.SocketIOClient.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var eventName: js.UndefOr[String] = js.undefined
  var execute: js.UndefOr[
    js.Function4[
      /* action */ Action[_], 
      /* emitBound */ Socket, 
      /* next */ Dispatch[_], 
      /* dispatch */ Dispatch[_], 
      _
    ]
  ] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    eventName: String = null,
    execute: (/* action */ Action[_], /* emitBound */ Socket, /* next */ Dispatch[_], /* dispatch */ Dispatch[_]) => _ = null
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction4(execute))
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

