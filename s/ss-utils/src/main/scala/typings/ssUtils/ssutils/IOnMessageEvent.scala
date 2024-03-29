package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOnMessageEvent extends StObject {
  
  var data: String
}
object IOnMessageEvent {
  
  inline def apply(data: String): IOnMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOnMessageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOnMessageEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
