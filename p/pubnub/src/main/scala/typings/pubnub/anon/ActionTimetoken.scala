package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTimetoken extends StObject {
  
  var actionTimetoken: String | Double
  
  var uuid: String
}
object ActionTimetoken {
  
  inline def apply(actionTimetoken: String | Double, uuid: String): ActionTimetoken = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTimetoken]
  }
  
  extension [Self <: ActionTimetoken](x: Self) {
    
    inline def setActionTimetoken(value: String | Double): Self = StObject.set(x, "actionTimetoken", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
