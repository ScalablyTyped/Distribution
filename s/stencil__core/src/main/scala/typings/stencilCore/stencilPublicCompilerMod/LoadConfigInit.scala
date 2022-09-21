package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadConfigInit extends StObject {
  
  /**
    * User config object to merge into default config and
    * config loaded from a file path.
    */
  var config: js.UndefOr[UnvalidatedConfig] = js.undefined
  
  /**
    * Absolute path to a Stencil config file. This path cannot be
    * relative and it does not resolve config files within a directory.
    */
  var configPath: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, if the "tsconfig.json" file is not found
    * it'll automatically generate and save a default tsconfig
    * within the root directory.
    */
  var initTsConfig: js.UndefOr[Boolean] = js.undefined
  
  var logger: js.UndefOr[Logger] = js.undefined
  
  var sys: js.UndefOr[CompilerSystem] = js.undefined
}
object LoadConfigInit {
  
  inline def apply(): LoadConfigInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadConfigInit]
  }
  
  extension [Self <: LoadConfigInit](x: Self) {
    
    inline def setConfig(value: UnvalidatedConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setInitTsConfig(value: Boolean): Self = StObject.set(x, "initTsConfig", value.asInstanceOf[js.Any])
    
    inline def setInitTsConfigUndefined: Self = StObject.set(x, "initTsConfig", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setSys(value: CompilerSystem): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
  }
}
