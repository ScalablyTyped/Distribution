package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgnosticRouteMatch[ParamKey /* <: String */, RouteObjectType /* <: AgnosticRouteObject */] extends StObject {
  
  /**
    * The names and values of dynamic parameters in the URL.
    */
  var params: Params[ParamKey]
  
  /**
    * The portion of the URL pathname that was matched.
    */
  var pathname: String
  
  /**
    * The portion of the URL pathname that was matched before child routes.
    */
  var pathnameBase: String
  
  /**
    * The route object that was used to match.
    */
  var route: RouteObjectType
}
object AgnosticRouteMatch {
  
  inline def apply[ParamKey /* <: String */, RouteObjectType /* <: AgnosticRouteObject */](params: Params[ParamKey], pathname: String, pathnameBase: String, route: RouteObjectType): AgnosticRouteMatch[ParamKey, RouteObjectType] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], pathnameBase = pathnameBase.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgnosticRouteMatch[ParamKey, RouteObjectType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgnosticRouteMatch[?, ?], ParamKey /* <: String */, RouteObjectType /* <: AgnosticRouteObject */] (val x: Self & (AgnosticRouteMatch[ParamKey, RouteObjectType])) extends AnyVal {
    
    inline def setParams(value: Params[ParamKey]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameBase(value: String): Self = StObject.set(x, "pathnameBase", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteObjectType): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
