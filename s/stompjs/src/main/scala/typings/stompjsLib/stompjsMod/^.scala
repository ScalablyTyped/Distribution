package typings
package stompjsLib.stompjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSIONS: stompjsLib.Anon_SupportedVersions = js.native
  def clearInterval(id: nodeLib.NodeJSNs.Timer): scala.Unit = js.native
  def client(url: java.lang.String): Client = js.native
  def client(url: java.lang.String, protocols: java.lang.String): Client = js.native
  def client(url: java.lang.String, protocols: js.Array[java.lang.String]): Client = js.native
  def over(ws: stdLib.WebSocket): Client = js.native
  def overTCP(host: java.lang.String, port: scala.Double): Client = js.native
  def overWS(url: java.lang.String): Client = js.native
  def setInterval(interval: scala.Double, f: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.NodeJSNs.Timer = js.native
}

