package typings.reactMdAlert

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdAlert.typesMessageQueueContextMod.ToastMessage
import typings.reactMdAlert.typesSnackbarMod.SnackbarProps
import typings.reactMdAlert.typesSnackbarQueueMod.ActionEventHandler
import typings.reactMdAlert.typesUseMessageQueueMod.MessageQueueOptions
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageQueueMod {
  
  @JSImport("@react-md/alert/types/MessageQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MessageQueue[M /* <: ToastMessage */](param0: MessageQueueProps[M]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MessageQueue")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
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
      * be applied to **all** toasts that appear in this message queue. You will
      * be provided the current message followed by the click event.
      */
    var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.undefined
  }
  object MessageQueueProps {
    
    inline def apply[M /* <: ToastMessage */](id: String): MessageQueueProps[M] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageQueueProps[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageQueueProps[?], M /* <: ToastMessage */] (val x: Self & MessageQueueProps[M]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnActionClick(value: (M, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    }
  }
}
