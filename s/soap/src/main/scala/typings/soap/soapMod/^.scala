package typings.soap.soapMod

import typings.soap.libServerMod.ServerType
import typings.soap.libTypesMod.IOptions
import typings.soap.libTypesMod.IServerOptions
import typings.soap.libTypesMod.IServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(url: String, callback: CreateClientCallback): Unit = js.native
  def createClient(url: String, callback: CreateClientCallback, endpoint: String): Unit = js.native
  def createClient(url: String, options: IOptions, callback: CreateClientCallback): Unit = js.native
  def createClient(url: String, options: IOptions, callback: CreateClientCallback, endpoint: String): Unit = js.native
  def createClientAsync(url: String): typings.bluebird.bluebirdMod.^[typings.soap.libClientMod.Client] = js.native
  def createClientAsync(url: String, options: IOptions): typings.bluebird.bluebirdMod.^[typings.soap.libClientMod.Client] = js.native
  def createClientAsync(url: String, options: IOptions, endpoint: String): typings.bluebird.bluebirdMod.^[typings.soap.libClientMod.Client] = js.native
  def listen(server: ServerType, options: IServerOptions): typings.soap.libServerMod.Server = js.native
  def listen(server: ServerType, path: String, services: IServices, wsdl: String): typings.soap.libServerMod.Server = js.native
  def listen(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typings.soap.libServerMod.Server = js.native
  def passwordDigest(nonce: String, created: String, password: String): String = js.native
}

