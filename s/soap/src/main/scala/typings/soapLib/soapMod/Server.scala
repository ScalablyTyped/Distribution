package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends soapLib.libServerMod.Server {
  def this(server: soapLib.libServerMod.ServerType, path: java.lang.String, services: soapLib.libTypesMod.IServices, wsdl: soapLib.libWsdlMod.WSDL) = this()
  def this(server: soapLib.libServerMod.ServerType, path: java.lang.String, services: soapLib.libTypesMod.IServices, wsdl: soapLib.libWsdlMod.WSDL, options: soapLib.libTypesMod.IServerOptions) = this()
}

