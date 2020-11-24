package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.SecretId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIGatewayRequestContext extends js.Object {
  
  var httpMethod: String = js.native
  
  var identity: SecretId = js.native
  
  var path: String = js.native
  
  var requestId: js.UndefOr[String] = js.native
  
  var serviceId: String = js.native
  
  var sourceIp: String = js.native
  
  var stage: String = js.native
}
object APIGatewayRequestContext {
  
  @scala.inline
  def apply(
    httpMethod: String,
    identity: SecretId,
    path: String,
    serviceId: String,
    sourceIp: String,
    stage: String
  ): APIGatewayRequestContext = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayRequestContext]
  }
  
  @scala.inline
  implicit class APIGatewayRequestContextOps[Self <: APIGatewayRequestContext] (val x: Self) extends AnyVal {
    
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
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: SecretId): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIp(value: String): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
