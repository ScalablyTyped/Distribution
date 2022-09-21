package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRegistry extends StObject {
  
  var components: js.UndefOr[AppRegistryComponents] = js.undefined
  
  var core: js.UndefOr[String] = js.undefined
  
  var corePolyfilled: js.UndefOr[String] = js.undefined
  
  var fsNamespace: js.UndefOr[String] = js.undefined
  
  var global: js.UndefOr[String] = js.undefined
  
  var loader: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
}
object AppRegistry {
  
  inline def apply(): AppRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRegistry]
  }
  
  extension [Self <: AppRegistry](x: Self) {
    
    inline def setComponents(value: AppRegistryComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setCore(value: String): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setCorePolyfilled(value: String): Self = StObject.set(x, "corePolyfilled", value.asInstanceOf[js.Any])
    
    inline def setCorePolyfilledUndefined: Self = StObject.set(x, "corePolyfilled", js.undefined)
    
    inline def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
    
    inline def setFsNamespace(value: String): Self = StObject.set(x, "fsNamespace", value.asInstanceOf[js.Any])
    
    inline def setFsNamespaceUndefined: Self = StObject.set(x, "fsNamespace", js.undefined)
    
    inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
