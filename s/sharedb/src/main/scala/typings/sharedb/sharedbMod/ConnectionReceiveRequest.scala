package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionReceiveRequest extends StObject {
  
  var data: Any
}
object ConnectionReceiveRequest {
  
  inline def apply(data: Any): ConnectionReceiveRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionReceiveRequest]
  }
  
  extension [Self <: ConnectionReceiveRequest](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
