package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpApiEvent extends js.Object {
  
  var authorizer: js.UndefOr[NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
}
object HttpApiEvent {
  
  @scala.inline
  def apply(method: String, path: String): HttpApiEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiEvent]
  }
  
  @scala.inline
  implicit class HttpApiEventOps[Self <: HttpApiEvent] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizer(value: NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer): Self = this.set("authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizer: Self = this.set("authorizer", js.undefined)
  }
}
