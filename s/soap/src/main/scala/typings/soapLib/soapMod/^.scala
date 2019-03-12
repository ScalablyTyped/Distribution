package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(url: java.lang.String, callback: js.Function2[/* err */ js.Any, /* client */ Client, scala.Unit]): scala.Unit = js.native
  def createClient(
    url: java.lang.String,
    options: IOptions,
    callback: js.Function2[/* err */ js.Any, /* client */ Client, scala.Unit]
  ): scala.Unit = js.native
  def createClientAsync(url: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Client] = js.native
  def createClientAsync(url: java.lang.String, options: IOptions): bluebirdLib.bluebirdMod.namespaced[Client] = js.native
  def createClientAsync(url: java.lang.String, options: IOptions, endpoint: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Client] = js.native
  def listen(server: js.Any, options: IServerOptions): Server = js.native
  def listen(server: js.Any, path: java.lang.String, service: js.Any, wsdl: java.lang.String): Server = js.native
  def passwordDigest(nonce: java.lang.String, created: java.lang.String, password: java.lang.String): java.lang.String = js.native
}

