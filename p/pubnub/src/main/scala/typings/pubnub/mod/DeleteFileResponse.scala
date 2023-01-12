package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileResponse extends StObject {
  
  var status: Double
}
object DeleteFileResponse {
  
  inline def apply(status: Double): DeleteFileResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
