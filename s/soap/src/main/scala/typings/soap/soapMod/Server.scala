package typings.soap.soapMod

import typings.soap.libServerMod.ServerType
import typings.soap.libTypesMod.IServerOptions
import typings.soap.libTypesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends typings.soap.libServerMod.Server {
  def this(server: ServerType, path: String, services: IServices, wsdl: typings.soap.libWsdlMod.WSDL) = this()
  def this(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: typings.soap.libWsdlMod.WSDL,
    options: IServerOptions
  ) = this()
}

