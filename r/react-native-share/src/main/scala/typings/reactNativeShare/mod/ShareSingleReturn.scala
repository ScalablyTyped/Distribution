package typings.reactNativeShare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareSingleReturn extends StObject {
  
  var message: String = js.native
}
object ShareSingleReturn {
  
  @scala.inline
  def apply(message: String): ShareSingleReturn = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSingleReturn]
  }
  
  @scala.inline
  implicit class ShareSingleReturnMutableBuilder[Self <: ShareSingleReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
