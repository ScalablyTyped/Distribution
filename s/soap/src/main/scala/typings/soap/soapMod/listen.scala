package typings.soap.soapMod

import typings.soap.libServerMod.ServerType
import typings.soap.libTypesMod.IServerOptions
import typings.soap.libTypesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "listen")
@js.native
object listen extends js.Object {
  def apply(server: ServerType, options: IServerOptions): typings.soap.libServerMod.Server = js.native
  def apply(server: ServerType, path: String, services: IServices, wsdl: String): typings.soap.libServerMod.Server = js.native
  def apply(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typings.soap.libServerMod.Server = js.native
}

