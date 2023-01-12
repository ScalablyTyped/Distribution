package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeTokenResponse extends StObject {
  
  var data: js.Object
  
  var status: Double
}
object RevokeTokenResponse {
  
  inline def apply(data: js.Object, status: Double): RevokeTokenResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
