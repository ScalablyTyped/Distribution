package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.DevServerEditor
import typings.stencilCore.stencilPublicCompilerMod.PageReloadStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevClientConfig extends StObject {
  
  var basePath: String
  
  var editors: js.Array[DevServerEditor]
  
  var reloadStrategy: PageReloadStrategy
  
  var socketUrl: js.UndefOr[String] = js.undefined
}
object DevClientConfig {
  
  inline def apply(basePath: String, editors: js.Array[DevServerEditor]): DevClientConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], editors = editors.asInstanceOf[js.Any], reloadStrategy = null)
    __obj.asInstanceOf[DevClientConfig]
  }
  
  extension [Self <: DevClientConfig](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setEditors(value: js.Array[DevServerEditor]): Self = StObject.set(x, "editors", value.asInstanceOf[js.Any])
    
    inline def setEditorsVarargs(value: DevServerEditor*): Self = StObject.set(x, "editors", js.Array(value*))
    
    inline def setReloadStrategy(value: PageReloadStrategy): Self = StObject.set(x, "reloadStrategy", value.asInstanceOf[js.Any])
    
    inline def setReloadStrategyNull: Self = StObject.set(x, "reloadStrategy", null)
    
    inline def setSocketUrl(value: String): Self = StObject.set(x, "socketUrl", value.asInstanceOf[js.Any])
    
    inline def setSocketUrlUndefined: Self = StObject.set(x, "socketUrl", js.undefined)
  }
}
