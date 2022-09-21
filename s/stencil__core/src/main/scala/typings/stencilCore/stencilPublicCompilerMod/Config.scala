package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.configFlagsMod.ConfigFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config
  extends StObject
     with StencilConfig {
  
  var _isTesting: js.UndefOr[Boolean] = js.undefined
  
  var _isValidated: js.UndefOr[Boolean] = js.undefined
  
  var buildAppCore: js.UndefOr[Boolean] = js.undefined
  
  var buildDocs: js.UndefOr[Boolean] = js.undefined
  
  var configPath: js.UndefOr[String] = js.undefined
  
  @JSName("devServer")
  var devServer_Config: js.UndefOr[DevServerConfig] = js.undefined
  
  var flags: js.UndefOr[ConfigFlags] = js.undefined
  
  var fsNamespace: js.UndefOr[String] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var packageJsonFilePath: js.UndefOr[String] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var suppressLogs: js.UndefOr[Boolean] = js.undefined
  
  var tsCompilerOptions: js.UndefOr[Any] = js.undefined
  
  var writeLog: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setBuildAppCore(value: Boolean): Self = StObject.set(x, "buildAppCore", value.asInstanceOf[js.Any])
    
    inline def setBuildAppCoreUndefined: Self = StObject.set(x, "buildAppCore", js.undefined)
    
    inline def setBuildDocs(value: Boolean): Self = StObject.set(x, "buildDocs", value.asInstanceOf[js.Any])
    
    inline def setBuildDocsUndefined: Self = StObject.set(x, "buildDocs", js.undefined)
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
    
    inline def setDevServer(value: DevServerConfig): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    inline def setFlags(value: ConfigFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFsNamespace(value: String): Self = StObject.set(x, "fsNamespace", value.asInstanceOf[js.Any])
    
    inline def setFsNamespaceUndefined: Self = StObject.set(x, "fsNamespace", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setPackageJsonFilePath(value: String): Self = StObject.set(x, "packageJsonFilePath", value.asInstanceOf[js.Any])
    
    inline def setPackageJsonFilePathUndefined: Self = StObject.set(x, "packageJsonFilePath", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setSuppressLogs(value: Boolean): Self = StObject.set(x, "suppressLogs", value.asInstanceOf[js.Any])
    
    inline def setSuppressLogsUndefined: Self = StObject.set(x, "suppressLogs", js.undefined)
    
    inline def setTsCompilerOptions(value: Any): Self = StObject.set(x, "tsCompilerOptions", value.asInstanceOf[js.Any])
    
    inline def setTsCompilerOptionsUndefined: Self = StObject.set(x, "tsCompilerOptions", js.undefined)
    
    inline def setWriteLog(value: Boolean): Self = StObject.set(x, "writeLog", value.asInstanceOf[js.Any])
    
    inline def setWriteLogUndefined: Self = StObject.set(x, "writeLog", js.undefined)
    
    inline def set_isTesting(value: Boolean): Self = StObject.set(x, "_isTesting", value.asInstanceOf[js.Any])
    
    inline def set_isTestingUndefined: Self = StObject.set(x, "_isTesting", js.undefined)
    
    inline def set_isValidated(value: Boolean): Self = StObject.set(x, "_isValidated", value.asInstanceOf[js.Any])
    
    inline def set_isValidatedUndefined: Self = StObject.set(x, "_isValidated", js.undefined)
  }
}
