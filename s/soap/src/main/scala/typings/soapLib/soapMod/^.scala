package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* client */ soapLib.soapMod.Client, scala.Unit]
  ): scala.Unit = js.native
  def createClient(
    url: java.lang.String,
    options: soapLib.soapMod.IOptions,
    callback: js.Function2[/* err */ js.Any, /* client */ soapLib.soapMod.Client, scala.Unit]
  ): scala.Unit = js.native
  def createClientAsync(url: java.lang.String): bluebirdLib.bluebirdMod.namespaced[soapLib.soapMod.Client] = js.native
  def createClientAsync(url: java.lang.String, options: soapLib.soapMod.IOptions): bluebirdLib.bluebirdMod.namespaced[soapLib.soapMod.Client] = js.native
  def createClientAsync(url: java.lang.String, options: soapLib.soapMod.IOptions, endpoint: java.lang.String): bluebirdLib.bluebirdMod.namespaced[soapLib.soapMod.Client] = js.native
  def listen(server: js.Any, options: soapLib.soapMod.IServerOptions): soapLib.soapMod.Server = js.native
  def listen(server: js.Any, path: java.lang.String, service: js.Any, wsdl: java.lang.String): soapLib.soapMod.Server = js.native
  def passwordDigest(nonce: java.lang.String, created: java.lang.String, password: java.lang.String): java.lang.String = js.native
}

