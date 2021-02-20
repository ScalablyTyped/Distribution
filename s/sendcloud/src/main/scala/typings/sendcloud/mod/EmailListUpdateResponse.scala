package typings.sendcloud.mod

import typings.sendcloud.anon.Description
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailListUpdateResponse extends StObject {
  
  var list: Description = js.native
  
  var message: success = js.native
}
object EmailListUpdateResponse {
  
  @scala.inline
  def apply(list: Description, message: success): EmailListUpdateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateResponse]
  }
  
  @scala.inline
  implicit class EmailListUpdateResponseMutableBuilder[Self <: EmailListUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: Description): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
