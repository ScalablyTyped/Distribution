package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberDeleteResposne extends StObject {
  
  var del_count: Double = js.native
  
  var message: success = js.native
}
object ListMemberDeleteResposne {
  
  @scala.inline
  def apply(del_count: Double, message: success): ListMemberDeleteResposne = {
    val __obj = js.Dynamic.literal(del_count = del_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberDeleteResposne]
  }
  
  @scala.inline
  implicit class ListMemberDeleteResposneMutableBuilder[Self <: ListMemberDeleteResposne] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDel_count(value: Double): Self = StObject.set(x, "del_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
