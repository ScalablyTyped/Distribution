package typings.reactNavigationStack.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosingRouteKeys extends StObject {
  
  var closingRouteKeys: Unit
  
  var descriptors: StackDescriptorMap
  
  var openingRouteKeys: Unit
  
  var previousDescriptors: StackDescriptorMap
  
  var previousRoutes: js.Array[NavigationRoute[NavigationParams]]
  
  var replacingRouteKeys: Unit
  
  var routes: js.Array[NavigationRoute[NavigationParams]]
}
object ClosingRouteKeys {
  
  @scala.inline
  def apply(
    closingRouteKeys: Unit,
    descriptors: StackDescriptorMap,
    openingRouteKeys: Unit,
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[NavigationRoute[NavigationParams]],
    replacingRouteKeys: Unit,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): ClosingRouteKeys = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosingRouteKeys]
  }
  
  @scala.inline
  implicit class ClosingRouteKeysMutableBuilder[Self <: ClosingRouteKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosingRouteKeys(value: Unit): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningRouteKeys(value: Unit): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "previousRoutes", js.Array(value :_*))
    
    @scala.inline
    def setReplacingRouteKeys(value: Unit): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
