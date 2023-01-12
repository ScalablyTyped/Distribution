package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageList extends StObject {
  
  /** MessageList messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
}
object IMessageList {
  
  inline def apply(): IMessageList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMessageList] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[IMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: IMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
