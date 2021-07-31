package typings.reactMdAlert

import typings.reactMdAlert.messageQueueContextMod.AddMessage
import typings.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.messageQueueContextMod.Message
import typings.reactMdAlert.messageQueueContextMod.MessageQueueActions
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMessageQueueMod {
  
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
  
  @scala.inline
  def addMessage[M /* <: Message */](message: M, duplicates: DuplicateBehavior): AddMessageAction[ToastMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMessage")(message.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[AddMessageAction[ToastMessage]]
  
  @scala.inline
  def handleAddMessage[M /* <: Message */](state: js.Array[M], message: M, duplicates: DuplicateBehavior): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAddMessage")(state.asInstanceOf[js.Any], message.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  @scala.inline
  def popMessage(): PopMessageAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popMessage")().asInstanceOf[PopMessageAction]
  
  @scala.inline
  def reducer[M /* <: Message */](state: js.Array[M], action: MessageActions[M]): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  @scala.inline
  def resetQueue(): ResetQueueAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetQueue")().asInstanceOf[ResetQueueAction]
  
  @scala.inline
  def useMessageQueue[M /* <: Message */](hasTimeoutDuplicatesDefaultQueue: MessageQueueOptions[M]): MessageQueueResult[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessageQueue")(hasTimeoutDuplicatesDefaultQueue.asInstanceOf[js.Any]).asInstanceOf[MessageQueueResult[M]]
  
  trait AddMessageAction[M /* <: Message */]
    extends StObject
       with MessageActions[M] {
    
    var duplicates: DuplicateBehavior
    
    var message: M
    
    var `type`: /* "ADD_MESSAGE" */ String
  }
  object AddMessageAction {
    
    @scala.inline
    def apply[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): AddMessageAction[M] = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMessageAction[M]]
    }
    
    @scala.inline
    implicit class AddMessageActionMutableBuilder[Self <: AddMessageAction[?], M /* <: Message */] (val x: Self & AddMessageAction[M]) extends AnyVal {
      
      @scala.inline
      def setDuplicates(value: DuplicateBehavior): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: M): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "ADD_MESSAGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdAlert.useMessageQueueMod.AddMessageAction[M]
    - typings.reactMdAlert.useMessageQueueMod.PopMessageAction
    - typings.reactMdAlert.useMessageQueueMod.ResetQueueAction
  */
  trait MessageActions[M /* <: Message */] extends StObject
  object MessageActions {
    
    @scala.inline
    def AddMessageAction[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): typings.reactMdAlert.useMessageQueueMod.AddMessageAction[M] = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdAlert.useMessageQueueMod.AddMessageAction[M]]
    }
    
    @scala.inline
    def PopMessageAction(`type`: /* "POP_MESSAGE" */ String): typings.reactMdAlert.useMessageQueueMod.PopMessageAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdAlert.useMessageQueueMod.PopMessageAction]
    }
    
    @scala.inline
    def ResetQueueAction(`type`: /* "RESET_QUEUE" */ String): typings.reactMdAlert.useMessageQueueMod.ResetQueueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdAlert.useMessageQueueMod.ResetQueueAction]
    }
  }
  
  trait MessageQueueOptions[M /* <: Message */] extends StObject {
    
    var defaultQueue: js.UndefOr[js.Array[M]] = js.undefined
    
    var duplicates: js.UndefOr[DuplicateBehavior] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MessageQueueOptions {
    
    @scala.inline
    def apply[M /* <: Message */](): MessageQueueOptions[M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageQueueOptions[M]]
    }
    
    @scala.inline
    implicit class MessageQueueOptionsMutableBuilder[Self <: MessageQueueOptions[?], M /* <: Message */] (val x: Self & MessageQueueOptions[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultQueue(value: js.Array[M]): Self = StObject.set(x, "defaultQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultQueueUndefined: Self = StObject.set(x, "defaultQueue", js.undefined)
      
      @scala.inline
      def setDefaultQueueVarargs(value: M*): Self = StObject.set(x, "defaultQueue", js.Array(value :_*))
      
      @scala.inline
      def setDuplicates(value: DuplicateBehavior): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
    
    @scala.inline
    def apply[M /* <: Message */](
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
    
    @scala.inline
    implicit class MessageQueueResultMutableBuilder[Self <: MessageQueueResult[?], M /* <: Message */] (val x: Self & MessageQueueResult[M]) extends AnyVal {
      
      @scala.inline
      def setAddMessage(value: M => Unit): Self = StObject.set(x, "addMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueue(value: js.Array[M]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueVarargs(value: M*): Self = StObject.set(x, "queue", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopMessageAction
    extends StObject
       with MessageActions[js.Any] {
    
    var `type`: /* "POP_MESSAGE" */ String
  }
  object PopMessageAction {
    
    @scala.inline
    def apply(`type`: /* "POP_MESSAGE" */ String): PopMessageAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopMessageAction]
    }
    
    @scala.inline
    implicit class PopMessageActionMutableBuilder[Self <: PopMessageAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: /* "POP_MESSAGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResetQueueAction
    extends StObject
       with MessageActions[js.Any] {
    
    var `type`: /* "RESET_QUEUE" */ String
  }
  object ResetQueueAction {
    
    @scala.inline
    def apply(`type`: /* "RESET_QUEUE" */ String): ResetQueueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetQueueAction]
    }
    
    @scala.inline
    implicit class ResetQueueActionMutableBuilder[Self <: ResetQueueAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: /* "RESET_QUEUE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
