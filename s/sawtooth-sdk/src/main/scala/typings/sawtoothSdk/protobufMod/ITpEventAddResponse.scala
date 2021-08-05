package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpEventAddResponse extends StObject {
  
  /** TpEventAddResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpEventAddResponse {
  
  inline def apply(): ITpEventAddResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpEventAddResponse]
  }
  
  extension [Self <: ITpEventAddResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
