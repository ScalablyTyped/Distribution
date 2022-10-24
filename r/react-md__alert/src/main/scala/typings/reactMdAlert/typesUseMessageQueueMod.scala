package typings.reactMdAlert

import typings.reactMdAlert.typesMessageQueueContextMod.AddMessage
import typings.reactMdAlert.typesMessageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.typesMessageQueueContextMod.Message
import typings.reactMdAlert.typesMessageQueueContextMod.MessageQueueActions
import typings.reactMdAlert.typesMessageQueueContextMod.ToastMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseMessageQueueMod {
  
  @JSImport("@react-md/alert/types/useMessageQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/alert/types/useMessageQueue", "ADD_MESSAGE")
  @js.native
  val ADD_MESSAGE: /* "ADD_MESSAGE" */ String = js.native
  
  @JSImport("@react-md/alert/types/useMessageQueue", "POP_MESSAGE")
  @js.native
  val POP_MESSAGE: /* "POP_MESSAGE" */ String = js.native
  
  @JSImport("@react-md/alert/types/useMessageQueue", "RESET_QUEUE")
  @js.native
  val RESET_QUEUE: /* "RESET_QUEUE" */ String = js.native
  
  inline def addMessage[M /* <: Message */](message: M, duplicates: DuplicateBehavior): AddMessageAction[ToastMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMessage")(message.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[AddMessageAction[ToastMessage]]
  
  inline def handleAddMessage[M /* <: Message */](state: js.Array[M], message: M, duplicates: DuplicateBehavior): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAddMessage")(state.asInstanceOf[js.Any], message.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  inline def popMessage(): PopMessageAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popMessage")().asInstanceOf[PopMessageAction]
  
  inline def reducer[M /* <: Message */](state: js.Array[M], action: MessageActions[M]): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  inline def resetQueue(): ResetQueueAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetQueue")().asInstanceOf[ResetQueueAction]
  
  inline def useMessageQueue[M /* <: Message */](param0: MessageQueueOptions[M]): MessageQueueResult[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessageQueue")(param0.asInstanceOf[js.Any]).asInstanceOf[MessageQueueResult[M]]
  
  trait AddMessageAction[M /* <: Message */]
    extends StObject
       with MessageActions[M] {
    
    var duplicates: DuplicateBehavior
    
    var message: M
    
    var `type`: /* "ADD_MESSAGE" */ String
  }
  object AddMessageAction {
    
    inline def apply[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): AddMessageAction[M] = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMessageAction[M]]
    }
    
    extension [Self <: AddMessageAction[?], M /* <: Message */](x: Self & AddMessageAction[M]) {
      
      inline def setDuplicates(value: DuplicateBehavior): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: M): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "ADD_MESSAGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdAlert.typesUseMessageQueueMod.AddMessageAction[M]
    - typings.reactMdAlert.typesUseMessageQueueMod.PopMessageAction
    - typings.reactMdAlert.typesUseMessageQueueMod.ResetQueueAction
  */
  trait MessageActions[M /* <: Message */] extends StObject
  object MessageActions {
    
    inline def AddMessageAction[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): typings.reactMdAlert.typesUseMessageQueueMod.AddMessageAction[M] = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdAlert.typesUseMessageQueueMod.AddMessageAction[M]]
    }
    
    inline def PopMessageAction(`type`: /* "POP_MESSAGE" */ String): typings.reactMdAlert.typesUseMessageQueueMod.PopMessageAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdAlert.typesUseMessageQueueMod.PopMessageAction]
    }
    
    inline def ResetQueueAction(`type`: /* "RESET_QUEUE" */ String): typings.reactMdAlert.typesUseMessageQueueMod.ResetQueueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdAlert.typesUseMessageQueueMod.ResetQueueAction]
    }
  }
  
  trait MessageQueueOptions[M /* <: Message */] extends StObject {
    
    var defaultQueue: js.UndefOr[js.Array[M]] = js.undefined
    
    var duplicates: js.UndefOr[DuplicateBehavior] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MessageQueueOptions {
    
    inline def apply[M /* <: Message */](): MessageQueueOptions[M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageQueueOptions[M]]
    }
    
    extension [Self <: MessageQueueOptions[?], M /* <: Message */](x: Self & MessageQueueOptions[M]) {
      
      inline def setDefaultQueue(value: js.Array[M]): Self = StObject.set(x, "defaultQueue", value.asInstanceOf[js.Any])
      
      inline def setDefaultQueueUndefined: Self = StObject.set(x, "defaultQueue", js.undefined)
      
      inline def setDefaultQueueVarargs(value: M*): Self = StObject.set(x, "defaultQueue", js.Array(value*))
      
      inline def setDuplicates(value: DuplicateBehavior): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait MessageQueueResult[M /* <: Message */]
    extends StObject
       with MessageQueueActions[M] {
    
    var addMessage: AddMessage[M]
    
    var queue: js.Array[M]
    
    var visible: Boolean
  }
  object MessageQueueResult {
    
    inline def apply[M /* <: Message */](
      addMessage: M => Unit,
      hideMessage: () => Unit,
      popMessage: () => Unit,
      queue: js.Array[M],
      resetQueue: () => js.Array[M],
      restartTimer: () => Unit,
      startTimer: () => Unit,
      stopTimer: () => Unit,
      visible: Boolean
    ): MessageQueueResult[M] = {
      val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1(addMessage), hideMessage = js.Any.fromFunction0(hideMessage), popMessage = js.Any.fromFunction0(popMessage), queue = queue.asInstanceOf[js.Any], resetQueue = js.Any.fromFunction0(resetQueue), restartTimer = js.Any.fromFunction0(restartTimer), startTimer = js.Any.fromFunction0(startTimer), stopTimer = js.Any.fromFunction0(stopTimer), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageQueueResult[M]]
    }
    
    extension [Self <: MessageQueueResult[?], M /* <: Message */](x: Self & MessageQueueResult[M]) {
      
      inline def setAddMessage(value: M => Unit): Self = StObject.set(x, "addMessage", js.Any.fromFunction1(value))
      
      inline def setQueue(value: js.Array[M]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: M*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopMessageAction
    extends StObject
       with MessageActions[Any] {
    
    var `type`: /* "POP_MESSAGE" */ String
  }
  object PopMessageAction {
    
    inline def apply(`type`: /* "POP_MESSAGE" */ String): PopMessageAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopMessageAction]
    }
    
    extension [Self <: PopMessageAction](x: Self) {
      
      inline def setType(value: /* "POP_MESSAGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResetQueueAction
    extends StObject
       with MessageActions[Any] {
    
    var `type`: /* "RESET_QUEUE" */ String
  }
  object ResetQueueAction {
    
    inline def apply(`type`: /* "RESET_QUEUE" */ String): ResetQueueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetQueueAction]
    }
    
    extension [Self <: ResetQueueAction](x: Self) {
      
      inline def setType(value: /* "RESET_QUEUE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
