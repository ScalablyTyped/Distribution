package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView.State> */
@js.native
trait ReadonlyState extends StObject {
  
  val closingRouteKeys: js.Array[String] = js.native
  
  val descriptors: StackDescriptorMap = js.native
  
  val openingRouteKeys: js.Array[String] = js.native
  
  val previousDescriptors: StackDescriptorMap = js.native
  
  val previousRoutes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]] = js.native
  
  val replacingRouteKeys: js.Array[String] = js.native
  
  val routes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]] = js.native
}
object ReadonlyState {
  
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    openingRouteKeys: js.Array[String],
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]],
    replacingRouteKeys: js.Array[String],
    routes: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]]
  ): ReadonlyState = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  @scala.inline
  implicit class ReadonlyStateMutableBuilder[Self <: ReadonlyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutes(value: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutesVarargs(value: typings.reactNavigationStack.vendorTypesMod.Route[String]*): Self = StObject.set(x, "previousRoutes", js.Array(value :_*))
    
    @scala.inline
    def setReplacingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacingRouteKeysVarargs(value: String*): Self = StObject.set(x, "replacingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[typings.reactNavigationStack.vendorTypesMod.Route[String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: typings.reactNavigationStack.vendorTypesMod.Route[String]*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
