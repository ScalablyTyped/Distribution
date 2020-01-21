package typings.proxyAddr

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-addr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  trait _Address extends js.Object
  
  def apply(req: IncomingMessage, trust: js.Array[Address]): String = js.native
  def apply(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): String = js.native
  def apply(req: IncomingMessage, trust: Address): String = js.native
  def all(req: IncomingMessage): js.Array[String] = js.native
  def all(req: IncomingMessage, trust: js.Array[Address]): js.Array[String] = js.native
  def all(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): js.Array[String] = js.native
  def all(req: IncomingMessage, trust: Address): js.Array[String] = js.native
  def compile(`val`: js.Array[Address]): js.Function2[/* addr */ String, /* i */ Double, Boolean] = js.native
  def compile(`val`: Address): js.Function2[/* addr */ String, /* i */ Double, Boolean] = js.native
  /* Rewritten from type alias, can be one of: 
    - typings.proxyAddr.proxyAddrStrings.loopback
    - typings.proxyAddr.proxyAddrStrings.linklocal
    - typings.proxyAddr.proxyAddrStrings.uniquelocal
    - java.lang.String
  */
  type Address = _Address | String
}

