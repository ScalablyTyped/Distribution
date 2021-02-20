package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOnMessageEvent extends StObject {
  
  var data: String = js.native
}
object IOnMessageEvent {
  
  @scala.inline
  def apply(data: String): IOnMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOnMessageEvent]
  }
  
  @scala.inline
  implicit class IOnMessageEventMutableBuilder[Self <: IOnMessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
