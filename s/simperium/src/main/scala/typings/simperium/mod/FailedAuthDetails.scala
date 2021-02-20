package typings.simperium.mod

import typings.simperium.simperiumNumbers.`400`
import typings.simperium.simperiumNumbers.`401`
import typings.simperium.simperiumNumbers.`500`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedAuthDetails extends StObject {
  
  var code: `400` | `401` | `500` = js.native
  
  var msg: String = js.native
}
object FailedAuthDetails {
  
  @scala.inline
  def apply(code: `400` | `401` | `500`, msg: String): FailedAuthDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAuthDetails]
  }
  
  @scala.inline
  implicit class FailedAuthDetailsMutableBuilder[Self <: FailedAuthDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: `400` | `401` | `500`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
