package typings.rabbitJs.mod

import typings.rabbitJs.anon.CorrelationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMessage extends js.Object {
  
  var content: js.Any = js.native
  
  var properties: CorrelationId = js.native
}
object RequestMessage {
  
  @scala.inline
  def apply(content: js.Any, properties: CorrelationId): RequestMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMessage]
  }
  
  @scala.inline
  implicit class RequestMessageOps[Self <: RequestMessage] (val x: Self) extends AnyVal {
    
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CorrelationId): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
