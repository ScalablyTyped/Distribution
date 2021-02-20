package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Websocket extends StObject {
  
  var authorizer: js.UndefOr[WebsocketAuthorizer] = js.native
  
  var route: String = js.native
  
  var routeResponseSelectionExpression: js.UndefOr[String] = js.native
}
object Websocket {
  
  @scala.inline
  def apply(route: String): Websocket = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Websocket]
  }
  
  @scala.inline
  implicit class WebsocketMutableBuilder[Self <: Websocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizer(value: WebsocketAuthorizer): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    @scala.inline
    def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseSelectionExpression(value: String): Self = StObject.set(x, "routeResponseSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseSelectionExpressionUndefined: Self = StObject.set(x, "routeResponseSelectionExpression", js.undefined)
  }
}
