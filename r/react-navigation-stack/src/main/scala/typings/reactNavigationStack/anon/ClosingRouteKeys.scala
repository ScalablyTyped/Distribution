package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosingRouteKeys extends StObject {
  
  var closingRouteKeys: js.UndefOr[scala.Nothing] = js.native
  
  var descriptors: StackDescriptorMap = js.native
  
  var openingRouteKeys: js.UndefOr[scala.Nothing] = js.native
  
  var previousDescriptors: StackDescriptorMap = js.native
  
  var previousRoutes: js.Array[NavigationRoute[NavigationParams]] = js.native
  
  var replacingRouteKeys: js.UndefOr[scala.Nothing] = js.native
  
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}
object ClosingRouteKeys {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[NavigationRoute[NavigationParams]],
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): ClosingRouteKeys = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosingRouteKeys]
  }
  
  @scala.inline
  implicit class ClosingRouteKeysMutableBuilder[Self <: ClosingRouteKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "previousRoutes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
