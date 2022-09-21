package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Smooch allows you to set a delegate to receive callbacks when important changes happen in the conversation.
  *
  * To set a delegate, pass the `delegate` parameter in to [init options](#Smooch::init), or use the [setDelegate](#Smooch::setDelegate) method. The `delegate` object may optionally contain
  * `beforeDisplay`, `beforeSend`, `beforePostbackSend` and `onInvalidAuth` delegate functions.
  * Passing `delegate` as part of `init` options is the preferred method. The `setDelegate` method can be used to change or remove delegate behaviors after a conversation has been initialized.
  *
  * A `data` object is passed down with all the delegate events except `onInvalidAuth`. This is a read-only object containing a truncated version of the conversation associated with the event.
  *
  * `beforeSend` delegate will apply to the `formResponse` message sent when a [Prechat Capture](https://docs.smooch.io/guide/web-messenger/#prechat-capture) form is completed.
  */
trait Delegate extends StObject {
  
  var beforeDisplay: js.UndefOr[js.Function2[/* message */ Message, /* data */ ConversationData, Message | Null]] = js.undefined
  
  var beforePostbackSend: js.UndefOr[js.Function2[/* postback */ Any, /* data */ ConversationData, Any]] = js.undefined
  
  var beforeSend: js.UndefOr[js.Function2[/* message */ Message, /* data */ ConversationData, Message | Null]] = js.undefined
  
  var onInvalidAuth: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.undefined
}
object Delegate {
  
  inline def apply(): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delegate]
  }
  
  extension [Self <: Delegate](x: Self) {
    
    inline def setBeforeDisplay(value: (/* message */ Message, /* data */ ConversationData) => Message | Null): Self = StObject.set(x, "beforeDisplay", js.Any.fromFunction2(value))
    
    inline def setBeforeDisplayUndefined: Self = StObject.set(x, "beforeDisplay", js.undefined)
    
    inline def setBeforePostbackSend(value: (/* postback */ Any, /* data */ ConversationData) => Any): Self = StObject.set(x, "beforePostbackSend", js.Any.fromFunction2(value))
    
    inline def setBeforePostbackSendUndefined: Self = StObject.set(x, "beforePostbackSend", js.undefined)
    
    inline def setBeforeSend(value: (/* message */ Message, /* data */ ConversationData) => Message | Null): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setOnInvalidAuth(value: () => String | js.Promise[String]): Self = StObject.set(x, "onInvalidAuth", js.Any.fromFunction0(value))
    
    inline def setOnInvalidAuthUndefined: Self = StObject.set(x, "onInvalidAuth", js.undefined)
  }
}
