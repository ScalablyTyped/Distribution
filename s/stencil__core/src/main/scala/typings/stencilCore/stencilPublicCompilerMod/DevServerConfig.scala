package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.http
import typings.stencilCore.stencilCoreStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevServerConfig
  extends StObject
     with StencilDevServerConfig {
  
  var browserUrl: js.UndefOr[String] = js.undefined
  
  var devServerDir: js.UndefOr[String] = js.undefined
  
  var excludeHmr: js.UndefOr[js.Array[String]] = js.undefined
  
  var historyApiFallback: js.UndefOr[HistoryApiFallback] = js.undefined
  
  var prerenderConfig: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[http | https] = js.undefined
  
  var srcIndexHtml: js.UndefOr[String] = js.undefined
}
object DevServerConfig {
  
  inline def apply(): DevServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevServerConfig]
  }
  
  extension [Self <: DevServerConfig](x: Self) {
    
    inline def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
    
    inline def setBrowserUrlUndefined: Self = StObject.set(x, "browserUrl", js.undefined)
    
    inline def setDevServerDir(value: String): Self = StObject.set(x, "devServerDir", value.asInstanceOf[js.Any])
    
    inline def setDevServerDirUndefined: Self = StObject.set(x, "devServerDir", js.undefined)
    
    inline def setExcludeHmr(value: js.Array[String]): Self = StObject.set(x, "excludeHmr", value.asInstanceOf[js.Any])
    
    inline def setExcludeHmrUndefined: Self = StObject.set(x, "excludeHmr", js.undefined)
    
    inline def setExcludeHmrVarargs(value: String*): Self = StObject.set(x, "excludeHmr", js.Array(value*))
    
    inline def setHistoryApiFallback(value: HistoryApiFallback): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
    
    inline def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
    
    inline def setPrerenderConfig(value: String): Self = StObject.set(x, "prerenderConfig", value.asInstanceOf[js.Any])
    
    inline def setPrerenderConfigUndefined: Self = StObject.set(x, "prerenderConfig", js.undefined)
    
    inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSrcIndexHtml(value: String): Self = StObject.set(x, "srcIndexHtml", value.asInstanceOf[js.Any])
    
    inline def setSrcIndexHtmlUndefined: Self = StObject.set(x, "srcIndexHtml", js.undefined)
  }
}
