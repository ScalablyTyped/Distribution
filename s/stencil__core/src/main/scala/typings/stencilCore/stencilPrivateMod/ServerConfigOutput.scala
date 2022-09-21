package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Config
import typings.stencilCore.stencilPublicCompilerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfigOutput extends StObject {
  
  var config: Config
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var logger: Logger
  
  var wwwDir: String
}
object ServerConfigOutput {
  
  inline def apply(config: Config, logger: Logger, wwwDir: String): ServerConfigOutput = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], wwwDir = wwwDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfigOutput]
  }
  
  extension [Self <: ServerConfigOutput](x: Self) {
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setWwwDir(value: String): Self = StObject.set(x, "wwwDir", value.asInstanceOf[js.Any])
  }
}
