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
  
  @scala.inline
  def apply[Instance, TextInstance](bundleType: BundleType, rendererPackageName: String, version: String): DevToolsConfig[Instance, TextInstance] = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], rendererPackageName = rendererPackageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance]]
  }
  
  @scala.inline
  implicit class DevToolsConfigMutableBuilder[Self <: DevToolsConfig[?, ?], Instance, TextInstance] (val x: Self & (DevToolsConfig[Instance, TextInstance])) extends AnyVal {
    
    @scala.inline
    def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindFiberByHostInstance(value: /* instance */ Instance | TextInstance => Fiber): Self = StObject.set(x, "findFiberByHostInstance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindFiberByHostInstanceUndefined: Self = StObject.set(x, "findFiberByHostInstance", js.undefined)
    
    @scala.inline
    def setGetInspectorDataForViewTag(value: /* tag */ Double => js.Object): Self = StObject.set(x, "getInspectorDataForViewTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInspectorDataForViewTagUndefined: Self = StObject.set(x, "getInspectorDataForViewTag", js.undefined)
    
    @scala.inline
    def setRendererPackageName(value: String): Self = StObject.set(x, "rendererPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
