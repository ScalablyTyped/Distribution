package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsocketAuthorizer extends js.Object {
  
  var arn: js.UndefOr[String] = js.native
  
  var identitySource: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object WebsocketAuthorizer {
  
  @scala.inline
  def apply(): WebsocketAuthorizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketAuthorizer]
  }
  
  @scala.inline
  implicit class WebsocketAuthorizerOps[Self <: WebsocketAuthorizer] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setIdentitySourceVarargs(value: String*): Self = this.set("identitySource", js.Array(value :_*))
    
    @scala.inline
    def setIdentitySource(value: js.Array[String]): Self = this.set("identitySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentitySource: Self = this.set("identitySource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
