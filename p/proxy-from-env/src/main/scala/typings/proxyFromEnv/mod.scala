package typings.proxyFromEnv

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proxy-from-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProxyForUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxyForUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getProxyForUrl(url: Url): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxyForUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
