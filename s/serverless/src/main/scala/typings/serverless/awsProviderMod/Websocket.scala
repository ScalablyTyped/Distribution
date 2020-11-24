package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Websocket extends js.Object {
  
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
  implicit class WebsocketOps[Self <: Websocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizer(value: WebsocketAuthorizer): Self = this.set("authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizer: Self = this.set("authorizer", js.undefined)
    
    @scala.inline
    def setRouteResponseSelectionExpression(value: String): Self = this.set("routeResponseSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteResponseSelectionExpression: Self = this.set("routeResponseSelectionExpression", js.undefined)
  }
}
