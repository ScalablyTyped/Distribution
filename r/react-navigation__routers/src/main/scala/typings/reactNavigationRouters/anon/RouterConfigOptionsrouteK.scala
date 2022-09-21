package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.RouterConfigOptions & {  routeKeyChanges :std.Array<string>} */
trait RouterConfigOptionsrouteK extends StObject {
  
  var routeGetIdList: Record[String, js.UndefOr[js.Function1[/* options */ `2`, js.UndefOr[String]]]]
  
  /**
    * List of routes whose key has changed even if they still have the same name.
    * This allows to remove screens declaratively.
    */
  var routeKeyChanges: js.Array[String]
  
  var routeNames: js.Array[String]
  
  var routeParamList: ParamListBase
}
object RouterConfigOptionsrouteK {
  
  inline def apply(
    routeGetIdList: Record[String, js.UndefOr[js.Function1[/* options */ `2`, js.UndefOr[String]]]],
    routeKeyChanges: js.Array[String],
    routeNames: js.Array[String],
    routeParamList: ParamListBase
  ): RouterConfigOptionsrouteK = {
    val __obj = js.Dynamic.literal(routeGetIdList = routeGetIdList.asInstanceOf[js.Any], routeKeyChanges = routeKeyChanges.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routeParamList = routeParamList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterConfigOptionsrouteK]
  }
  
  extension [Self <: RouterConfigOptionsrouteK](x: Self) {
    
    inline def setRouteGetIdList(value: Record[String, js.UndefOr[js.Function1[/* options */ `2`, js.UndefOr[String]]]]): Self = StObject.set(x, "routeGetIdList", value.asInstanceOf[js.Any])
    
    inline def setRouteKeyChanges(value: js.Array[String]): Self = StObject.set(x, "routeKeyChanges", value.asInstanceOf[js.Any])
    
    inline def setRouteKeyChangesVarargs(value: String*): Self = StObject.set(x, "routeKeyChanges", js.Array(value*))
    
    inline def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value*))
    
    inline def setRouteParamList(value: ParamListBase): Self = StObject.set(x, "routeParamList", value.asInstanceOf[js.Any])
  }
}
