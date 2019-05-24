package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(url: java.lang.String, callback: CreateClientCallback): scala.Unit = js.native
  def createClient(url: java.lang.String, callback: CreateClientCallback, endpoint: java.lang.String): scala.Unit = js.native
  def createClient(url: java.lang.String, options: soapLib.libTypesMod.IOptions, callback: CreateClientCallback): scala.Unit = js.native
  def createClient(
    url: java.lang.String,
    options: soapLib.libTypesMod.IOptions,
    callback: CreateClientCallback,
    endpoint: java.lang.String
  ): scala.Unit = js.native
  def createClientAsync(url: java.lang.String, options: soapLib.libTypesMod.IOptions): bluebirdLib.bluebirdMod.^[soapLib.libClientMod.Client] = js.native
  def createClientAsync(url: java.lang.String, options: soapLib.libTypesMod.IOptions, endpoint: java.lang.String): bluebirdLib.bluebirdMod.^[soapLib.libClientMod.Client] = js.native
  def listen(server: soapLib.libServerMod.ServerType, options: soapLib.libTypesMod.IServerOptions): soapLib.libServerMod.Server = js.native
  def listen(
    server: soapLib.libServerMod.ServerType,
    path: java.lang.String,
    services: soapLib.libTypesMod.IServices,
    wsdl: java.lang.String
  ): soapLib.libServerMod.Server = js.native
  def listen(
    server: soapLib.libServerMod.ServerType,
    path: java.lang.String,
    services: soapLib.libTypesMod.IServices,
    wsdl: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, scala.Unit]
  ): soapLib.libServerMod.Server = js.native
  def passwordDigest(nonce: java.lang.String, created: java.lang.String, password: java.lang.String): java.lang.String = js.native
}

