package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLogger_ extends js.Object {
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var log: js.UndefOr[js.Any] = js.native
  
  var properties: js.UndefOr[js.Any] = js.native
  
  var serializers: js.UndefOr[js.Any] = js.native
}
object RequestLogger_ {
  
  @scala.inline
  def apply(): RequestLogger_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLogger_]
  }
  
  @scala.inline
  implicit class RequestLogger_Ops[Self <: RequestLogger_] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setSerializers(value: js.Any): Self = this.set("serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
  }
}
