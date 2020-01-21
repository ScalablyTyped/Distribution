package typings.soap.mod

import typings.soap.serverMod.ServerType
import typings.soap.typesMod.IServerOptions
import typings.soap.typesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "listen")
@js.native
object listen extends js.Object {
  def apply(server: ServerType, options: IServerOptions): typings.soap.serverMod.Server = js.native
  def apply(server: ServerType, path: String, services: IServices, wsdl: String): typings.soap.serverMod.Server = js.native
  def apply(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typings.soap.serverMod.Server = js.native
}

