package typings.soap.mod

import typings.soap.serverMod.ServerType
import typings.soap.typesMod.IServerOptions
import typings.soap.typesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends typings.soap.serverMod.Server {
  def this(server: ServerType, path: String, services: IServices, wsdl: typings.soap.wsdlMod.WSDL) = this()
  def this(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: typings.soap.wsdlMod.WSDL,
    options: IServerOptions
  ) = this()
}

