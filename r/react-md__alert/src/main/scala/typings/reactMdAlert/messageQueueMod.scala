package typings.reactMdAlert

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import typings.reactMdAlert.snackbarMod.SnackbarProps
import typings.reactMdAlert.snackbarQueueMod.ActionEventHandler
import typings.reactMdAlert.useMessageQueueMod.MessageQueueOptions
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageQueueMod {
  
  object MessageQueue {
    
    @scala.inline
    def apply[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasTimeoutDuplicatesDefaultQueueChildrenProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.defaultQueue")
      @js.native
      def defaultQueue: js.Any = js.native
      @scala.inline
      def defaultQueue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultQueue")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.duplicates")
      @js.native
      def duplicates: js.Any = js.native
      @scala.inline
      def duplicates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.onActionClick")
      @js.native
      def onActionClick: js.Any = js.native
      @scala.inline
      def onActionClick_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  trait MessageQueueProps[M /* <: ToastMessage */]
    extends StObject
       with MessageQueueOptions[M]
       with SnackbarProps {
    
    /**
      * The children are required in this component since the message queue relies
      * on setting up React Context and provide hooks to add a message to the
      * queue. If there are no children, the message queue will not work.
      */
    @JSName("children")
    var children_MessageQueueProps: ReactNode
    
    /**
      * An optional function to call when the action button is clicked. This will
      * be applied to **all** toasts that appear in this message queue. You will be
      * provided the current message followed by the click event.
      */
    var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.undefined
  }
  object MessageQueueProps {
    
    @scala.inline
    def apply[M /* <: ToastMessage */](id: String): MessageQueueProps[M] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageQueueProps[M]]
    }
    
    @scala.inline
    implicit class MessageQueuePropsMutableBuilder[Self <: MessageQueueProps[?], M /* <: ToastMessage */] (val x: Self & MessageQueueProps[M]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnActionClick(value: (M, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    }
  }
}
