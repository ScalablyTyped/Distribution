package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Websocket extends StObject {
  
  var authorizer: js.UndefOr[WebsocketAuthorizer] = js.undefined
  
  var route: String
  
  var routeResponseSelectionExpression: js.UndefOr[String] = js.undefined
}
object Websocket {
  
  inline def apply(route: String): Websocket = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Websocket]
  }
  
  extension [Self <: Websocket](x: Self) {
    
    inline def setAuthorizer(value: WebsocketAuthorizer): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteResponseSelectionExpression(value: String): Self = StObject.set(x, "routeResponseSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setRouteResponseSelectionExpressionUndefined: Self = StObject.set(x, "routeResponseSelectionExpression", js.undefined)
  }
}
