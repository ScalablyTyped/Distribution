package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ProxyWebRequestExecutorFactory")
@js.native
open class ProxyWebRequestExecutorFactory protected ()
  extends StObject
     with typings.sharepoint.SP.ProxyWebRequestExecutorFactory {
  def this(url: String) = this()
  def this(url: String, options: Any) = this()
  
  /* CompleteClass */
  override def createWebRequestExecutor(): WebRequestExecutor = js.native
}
