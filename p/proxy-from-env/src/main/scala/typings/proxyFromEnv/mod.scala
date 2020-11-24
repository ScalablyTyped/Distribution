package typings.proxyFromEnv

import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proxy-from-env", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getProxyForUrl(url: String): String = js.native
  def getProxyForUrl(url: Url): String = js.native
}
