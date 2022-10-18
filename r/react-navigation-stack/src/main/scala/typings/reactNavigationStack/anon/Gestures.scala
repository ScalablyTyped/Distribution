package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.libTypescriptSrcVendorViewsStackCardStackMod.GestureValues
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gestures extends StObject {
  
  var descriptors: StackDescriptorMap
  
  var gestures: GestureValues
  
  var headerHeights: Record[String, Double]
  
  var routes: js.Array[NavigationRoute[NavigationParams]]
  
  var scenes: js.Array[Scene[NavigationRoute[NavigationParams]]]
}
object Gestures {
  
  inline def apply(
    descriptors: StackDescriptorMap,
    gestures: GestureValues,
    headerHeights: Record[String, Double],
    routes: js.Array[NavigationRoute[NavigationParams]],
    scenes: js.Array[Scene[NavigationRoute[NavigationParams]]]
  ): Gestures = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gestures]
  }
  
  extension [Self <: Gestures](x: Self) {
    
    inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setGestures(value: GestureValues): Self = StObject.set(x, "gestures", value.asInstanceOf[js.Any])
    
    inline def setHeaderHeights(value: Record[String, Double]): Self = StObject.set(x, "headerHeights", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setScenes(value: js.Array[Scene[NavigationRoute[NavigationParams]]]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
    
    inline def setScenesVarargs(value: Scene[NavigationRoute[NavigationParams]]*): Self = StObject.set(x, "scenes", js.Array(value*))
  }
}
