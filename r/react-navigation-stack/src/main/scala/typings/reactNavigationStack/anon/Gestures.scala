package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.cardStackMod.GestureValues
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gestures extends StObject {
  
  var descriptors: StackDescriptorMap = js.native
  
  var gestures: GestureValues = js.native
  
  var headerHeights: Record[String, Double] = js.native
  
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
  
  var scenes: js.Array[Scene[NavigationRoute[NavigationParams]]] = js.native
}
object Gestures {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    gestures: GestureValues,
    headerHeights: Record[String, Double],
    routes: js.Array[NavigationRoute[NavigationParams]],
    scenes: js.Array[Scene[NavigationRoute[NavigationParams]]]
  ): Gestures = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gestures]
  }
  
  @scala.inline
  implicit class GesturesMutableBuilder[Self <: Gestures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestures(value: GestureValues): Self = StObject.set(x, "gestures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeights(value: Record[String, Double]): Self = StObject.set(x, "headerHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setScenes(value: js.Array[Scene[NavigationRoute[NavigationParams]]]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenesVarargs(value: Scene[NavigationRoute[NavigationParams]]*): Self = StObject.set(x, "scenes", js.Array(value :_*))
  }
}
