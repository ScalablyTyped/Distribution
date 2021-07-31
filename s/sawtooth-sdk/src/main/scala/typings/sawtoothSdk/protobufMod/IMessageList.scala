package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageList extends StObject {
  
  /** MessageList messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
}
object IMessageList {
  
  @scala.inline
  def apply(): IMessageList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageList]
  }
  
  @scala.inline
  implicit class IMessageListMutableBuilder[Self <: IMessageList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[IMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: IMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
