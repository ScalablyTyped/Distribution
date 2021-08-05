package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevToolsConfig[Instance, TextInstance] extends StObject {
  
  var bundleType: BundleType
  
  // Note: this actually *does* depend on Fiber internal fields.
  // Used by "inspect clicked DOM element" in React DevTools.
  var findFiberByHostInstance: js.UndefOr[js.Function1[/* instance */ Instance | TextInstance, Fiber]] = js.undefined
  
  // Used by RN in-app inspector.
  // This API is unfortunately RN-specific.
  // TODO: Change it to accept Fiber instead and type it properly.
  var getInspectorDataForViewTag: js.UndefOr[js.Function1[/* tag */ Double, js.Object]] = js.undefined
  
  var rendererPackageName: String
  
  var version: String
}
object DevToolsConfig {
  
  inline def apply[Instance, TextInstance](bundleType: BundleType, rendererPackageName: String, version: String): DevToolsConfig[Instance, TextInstance] = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], rendererPackageName = rendererPackageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance]]
  }
  
  extension [Self <: DevToolsConfig[?, ?], Instance, TextInstance](x: Self & (DevToolsConfig[Instance, TextInstance])) {
    
    inline def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
    
    inline def setFindFiberByHostInstance(value: /* instance */ Instance | TextInstance => Fiber): Self = StObject.set(x, "findFiberByHostInstance", js.Any.fromFunction1(value))
    
    inline def setFindFiberByHostInstanceUndefined: Self = StObject.set(x, "findFiberByHostInstance", js.undefined)
    
    inline def setGetInspectorDataForViewTag(value: /* tag */ Double => js.Object): Self = StObject.set(x, "getInspectorDataForViewTag", js.Any.fromFunction1(value))
    
    inline def setGetInspectorDataForViewTagUndefined: Self = StObject.set(x, "getInspectorDataForViewTag", js.undefined)
    
    inline def setRendererPackageName(value: String): Self = StObject.set(x, "rendererPackageName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
