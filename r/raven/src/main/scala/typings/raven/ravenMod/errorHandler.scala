package typings.raven.ravenMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "errorHandler")
@js.native
object errorHandler extends js.Object {
  def apply(): js.Function4[
    /* e */ Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
}

