package typings
package proxyDashAddrLib.proxyDashAddrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-addr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    req: nodeLib.httpMod.IncomingMessage,
    trust: proxyDashAddrLib.proxyDashAddrMod.proxyAddrNs.Address | js.Array[proxyDashAddrLib.proxyDashAddrMod.proxyAddrNs.Address] | (js.Function2[/* addr */ java.lang.String, /* i */ scala.Double, scala.Boolean])
  ): java.lang.String = js.native
  def all(req: nodeLib.httpMod.IncomingMessage): js.Array[java.lang.String] = js.native
  def all(
    req: nodeLib.httpMod.IncomingMessage,
    trust: js.Array[proxyDashAddrLib.proxyDashAddrMod.proxyAddrNs.Address]
  ): js.Array[java.lang.String] = js.native
  def all(
    req: nodeLib.httpMod.IncomingMessage,
    trust: js.Function2[/* addr */ java.lang.String, /* i */ scala.Double, scala.Boolean]
  ): js.Array[java.lang.String] = js.native
  def all(req: nodeLib.httpMod.IncomingMessage, trust: proxyDashAddrLib.proxyDashAddrMod.proxyAddrNs.Address): js.Array[java.lang.String] = js.native
  def compile(`val`: js.Array[proxyDashAddrLib.proxyDashAddrMod.proxyAddrNs.Address]): js.Function2[/* addr */ java.lang.String, /* i */ scala.Double, scala.Boolean] = js.native
  def compile(`val`: proxyDashAddrLib.proxyDashAddrMod.proxyAddrNs.Address): js.Function2[/* addr */ java.lang.String, /* i */ scala.Double, scala.Boolean] = js.native
}

