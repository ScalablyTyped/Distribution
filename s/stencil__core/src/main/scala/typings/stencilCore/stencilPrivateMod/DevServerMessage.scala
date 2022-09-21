package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Message
import typings.stencilCore.anon.Method
import typings.stencilCore.stencilPublicCompilerMod.BuildLog
import typings.stencilCore.stencilPublicCompilerMod.CompilerBuildResults
import typings.stencilCore.stencilPublicCompilerMod.CompilerRequestResponse
import typings.stencilCore.stencilPublicCompilerMod.DevServerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevServerMessage extends StObject {
  
  var buildLog: js.UndefOr[BuildLog] = js.undefined
  
  var buildResults: js.UndefOr[CompilerBuildResults] = js.undefined
  
  var buildStart: js.UndefOr[Boolean] = js.undefined
  
  var closeServer: js.UndefOr[Boolean] = js.undefined
  
  var compilerRequestPath: js.UndefOr[String] = js.undefined
  
  var compilerRequestResults: js.UndefOr[CompilerRequestResponse] = js.undefined
  
  var error: js.UndefOr[Message] = js.undefined
  
  var isActivelyBuilding: js.UndefOr[Boolean] = js.undefined
  
  var requestBuildResults: js.UndefOr[Boolean] = js.undefined
  
  var requestLog: js.UndefOr[Method] = js.undefined
  
  var serverClosed: js.UndefOr[Boolean] = js.undefined
  
  var serverStarted: js.UndefOr[DevServerConfig] = js.undefined
  
  var startServer: js.UndefOr[DevServerConfig] = js.undefined
}
object DevServerMessage {
  
  inline def apply(): DevServerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevServerMessage]
  }
  
  extension [Self <: DevServerMessage](x: Self) {
    
    inline def setBuildLog(value: BuildLog): Self = StObject.set(x, "buildLog", value.asInstanceOf[js.Any])
    
    inline def setBuildLogUndefined: Self = StObject.set(x, "buildLog", js.undefined)
    
    inline def setBuildResults(value: CompilerBuildResults): Self = StObject.set(x, "buildResults", value.asInstanceOf[js.Any])
    
    inline def setBuildResultsUndefined: Self = StObject.set(x, "buildResults", js.undefined)
    
    inline def setBuildStart(value: Boolean): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    inline def setBuildStartUndefined: Self = StObject.set(x, "buildStart", js.undefined)
    
    inline def setCloseServer(value: Boolean): Self = StObject.set(x, "closeServer", value.asInstanceOf[js.Any])
    
    inline def setCloseServerUndefined: Self = StObject.set(x, "closeServer", js.undefined)
    
    inline def setCompilerRequestPath(value: String): Self = StObject.set(x, "compilerRequestPath", value.asInstanceOf[js.Any])
    
    inline def setCompilerRequestPathUndefined: Self = StObject.set(x, "compilerRequestPath", js.undefined)
    
    inline def setCompilerRequestResults(value: CompilerRequestResponse): Self = StObject.set(x, "compilerRequestResults", value.asInstanceOf[js.Any])
    
    inline def setCompilerRequestResultsUndefined: Self = StObject.set(x, "compilerRequestResults", js.undefined)
    
    inline def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsActivelyBuilding(value: Boolean): Self = StObject.set(x, "isActivelyBuilding", value.asInstanceOf[js.Any])
    
    inline def setIsActivelyBuildingUndefined: Self = StObject.set(x, "isActivelyBuilding", js.undefined)
    
    inline def setRequestBuildResults(value: Boolean): Self = StObject.set(x, "requestBuildResults", value.asInstanceOf[js.Any])
    
    inline def setRequestBuildResultsUndefined: Self = StObject.set(x, "requestBuildResults", js.undefined)
    
    inline def setRequestLog(value: Method): Self = StObject.set(x, "requestLog", value.asInstanceOf[js.Any])
    
    inline def setRequestLogUndefined: Self = StObject.set(x, "requestLog", js.undefined)
    
    inline def setServerClosed(value: Boolean): Self = StObject.set(x, "serverClosed", value.asInstanceOf[js.Any])
    
    inline def setServerClosedUndefined: Self = StObject.set(x, "serverClosed", js.undefined)
    
    inline def setServerStarted(value: DevServerConfig): Self = StObject.set(x, "serverStarted", value.asInstanceOf[js.Any])
    
    inline def setServerStartedUndefined: Self = StObject.set(x, "serverStarted", js.undefined)
    
    inline def setStartServer(value: DevServerConfig): Self = StObject.set(x, "startServer", value.asInstanceOf[js.Any])
    
    inline def setStartServerUndefined: Self = StObject.set(x, "startServer", js.undefined)
  }
}
