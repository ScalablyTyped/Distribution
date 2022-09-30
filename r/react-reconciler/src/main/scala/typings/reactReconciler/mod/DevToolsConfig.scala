package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevToolsConfig[Instance, TextInstance, RendererInspectionConfig] extends StObject {
  
  var bundleType: BundleType
  
  // Note: this actually *does* depend on Fiber internal fields.
  // Used by "inspect clicked DOM element" in React DevTools.
  var findFiberByHostInstance: js.UndefOr[js.Function1[/* instance */ Instance | TextInstance, Fiber | Null]] = js.undefined
  
  var rendererConfig: js.UndefOr[RendererInspectionConfig] = js.undefined
  
  var rendererPackageName: String
  
  var version: String
}
object DevToolsConfig {
  
  inline def apply[Instance, TextInstance, RendererInspectionConfig](bundleType: BundleType, rendererPackageName: String, version: String): DevToolsConfig[Instance, TextInstance, RendererInspectionConfig] = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], rendererPackageName = rendererPackageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance, RendererInspectionConfig]]
  }
  
  extension [Self <: DevToolsConfig[?, ?, ?], Instance, TextInstance, RendererInspectionConfig](x: Self & (DevToolsConfig[Instance, TextInstance, RendererInspectionConfig])) {
    
    inline def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
    
    inline def setFindFiberByHostInstance(value: /* instance */ Instance | TextInstance => Fiber | Null): Self = StObject.set(x, "findFiberByHostInstance", js.Any.fromFunction1(value))
    
    inline def setFindFiberByHostInstanceUndefined: Self = StObject.set(x, "findFiberByHostInstance", js.undefined)
    
    inline def setRendererConfig(value: RendererInspectionConfig): Self = StObject.set(x, "rendererConfig", value.asInstanceOf[js.Any])
    
    inline def setRendererConfigUndefined: Self = StObject.set(x, "rendererConfig", js.undefined)
    
    inline def setRendererPackageName(value: String): Self = StObject.set(x, "rendererPackageName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
