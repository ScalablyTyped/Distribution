package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiddlewareConfig extends StObject {
  
  var config: String | Config
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object MiddlewareConfig {
  
  inline def apply(config: String | Config): MiddlewareConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareConfig]
  }
  
  extension [Self <: MiddlewareConfig](x: Self) {
    
    inline def setConfig(value: String | Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
