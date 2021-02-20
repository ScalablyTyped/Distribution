package typings.proxyAddr

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proxy-addr", JSImport.Namespace)
  @js.native
  def apply(req: IncomingMessage, trust: js.Array[Address]): String = js.native
  @JSImport("proxy-addr", JSImport.Namespace)
  @js.native
  def apply(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): String = js.native
  @JSImport("proxy-addr", JSImport.Namespace)
  @js.native
  def apply(req: IncomingMessage, trust: Address): String = js.native
  
  @JSImport("proxy-addr", "all")
  @js.native
  def all(req: IncomingMessage): js.Array[String] = js.native
  @JSImport("proxy-addr", "all")
  @js.native
  def all(req: IncomingMessage, trust: js.Array[Address]): js.Array[String] = js.native
  @JSImport("proxy-addr", "all")
  @js.native
  def all(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): js.Array[String] = js.native
  @JSImport("proxy-addr", "all")
  @js.native
  def all(req: IncomingMessage, trust: Address): js.Array[String] = js.native
  
  @JSImport("proxy-addr", "compile")
  @js.native
  def compile(`val`: js.Array[Address]): js.Function2[/* addr */ String, /* i */ Double, Boolean] = js.native
  @JSImport("proxy-addr", "compile")
  @js.native
  def compile(`val`: Address): js.Function2[/* addr */ String, /* i */ Double, Boolean] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.proxyAddr.proxyAddrStrings.loopback
    - typings.proxyAddr.proxyAddrStrings.linklocal
    - typings.proxyAddr.proxyAddrStrings.uniquelocal
    - java.lang.String
  */
  type Address = _Address | String
  
  trait _Address extends StObject
}
