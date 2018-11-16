package typings
package reduxDashSocketDotIoLib.reduxDashSocketDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MiddlewareOptions extends js.Object {
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  var execute: js.UndefOr[
    js.Function4[
      /* action */ reduxLib.reduxMod.Action[_], 
      /* emitBound */ socketDotIoDashClientLib.SocketIOClientNs.Socket, 
      /* next */ reduxLib.reduxMod.Dispatch[_], 
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      _
    ]
  ] = js.undefined
}

