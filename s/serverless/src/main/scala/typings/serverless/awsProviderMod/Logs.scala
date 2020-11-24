package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logs extends js.Object {
  
  var frameworkLambda: js.UndefOr[Boolean] = js.native
  
  var httpApi: js.UndefOr[Boolean | HttpApiLogs] = js.native
  
  var restApi: js.UndefOr[RestApiLogs] = js.native
  
  var websocket: js.UndefOr[WebsocketLogs] = js.native
}
object Logs {
  
  @scala.inline
  def apply(): Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logs]
  }
  
  @scala.inline
  implicit class LogsOps[Self <: Logs] (val x: Self) extends AnyVal {
    
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
    def setFrameworkLambda(value: Boolean): Self = this.set("frameworkLambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkLambda: Self = this.set("frameworkLambda", js.undefined)
    
    @scala.inline
    def setHttpApi(value: Boolean | HttpApiLogs): Self = this.set("httpApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpApi: Self = this.set("httpApi", js.undefined)
    
    @scala.inline
    def setRestApi(value: RestApiLogs): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
    
    @scala.inline
    def setWebsocket(value: WebsocketLogs): Self = this.set("websocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsocket: Self = this.set("websocket", js.undefined)
  }
}
