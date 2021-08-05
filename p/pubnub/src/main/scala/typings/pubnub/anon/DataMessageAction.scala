package typings.pubnub.anon

import typings.pubnub.mod.MessageAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMessageAction extends StObject {
  
  var data: MessageAction
}
object DataMessageAction {
  
  inline def apply(data: MessageAction): DataMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMessageAction]
  }
  
  extension [Self <: DataMessageAction](x: Self) {
    
    inline def setData(value: MessageAction): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
