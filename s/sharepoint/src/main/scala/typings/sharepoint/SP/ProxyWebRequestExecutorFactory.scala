package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyWebRequestExecutorFactory
  extends StObject
     with IWebRequestExecutorFactory
object ProxyWebRequestExecutorFactory {
  
  inline def apply(createWebRequestExecutor: () => WebRequestExecutor): ProxyWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = js.Any.fromFunction0(createWebRequestExecutor))
    __obj.asInstanceOf[ProxyWebRequestExecutorFactory]
  }
}
