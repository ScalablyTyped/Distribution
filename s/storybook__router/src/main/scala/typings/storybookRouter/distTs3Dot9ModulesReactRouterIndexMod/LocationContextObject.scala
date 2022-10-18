package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import typings.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.Action
import typings.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationContextObject extends StObject {
  
  var location: Location
  
  var navigationType: Action
}
object LocationContextObject {
  
  inline def apply(location: Location, navigationType: Action): LocationContextObject = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationContextObject]
  }
  
  extension [Self <: LocationContextObject](x: Self) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNavigationType(value: Action): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
  }
}
