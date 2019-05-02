package typings
package simplecrawlerLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var globalAgent: Agent = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: js.Function): Server = js.native
  def get(options: RequestOptions): simplecrawlerLib.httpMod.ClientRequest = js.native
  def get(
    options: RequestOptions,
    callback: js.Function1[/* res */ simplecrawlerLib.httpMod.IncomingMessage, scala.Unit]
  ): simplecrawlerLib.httpMod.ClientRequest = js.native
  def request(options: java.lang.String): simplecrawlerLib.httpMod.ClientRequest = js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ simplecrawlerLib.httpMod.IncomingMessage, scala.Unit]
  ): simplecrawlerLib.httpMod.ClientRequest = js.native
  def request(options: RequestOptions): simplecrawlerLib.httpMod.ClientRequest = js.native
  def request(
    options: RequestOptions,
    callback: js.Function1[/* res */ simplecrawlerLib.httpMod.IncomingMessage, scala.Unit]
  ): simplecrawlerLib.httpMod.ClientRequest = js.native
}

