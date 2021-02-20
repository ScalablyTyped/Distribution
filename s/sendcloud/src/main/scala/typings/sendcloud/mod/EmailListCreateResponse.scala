package typings.sendcloud.mod

import typings.sendcloud.anon.Createdat
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailListCreateResponse extends StObject {
  
  var list: Createdat = js.native
  
  var message: success = js.native
}
object EmailListCreateResponse {
  
  @scala.inline
  def apply(list: Createdat, message: success): EmailListCreateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListCreateResponse]
  }
  
  @scala.inline
  implicit class EmailListCreateResponseMutableBuilder[Self <: EmailListCreateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: Createdat): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
