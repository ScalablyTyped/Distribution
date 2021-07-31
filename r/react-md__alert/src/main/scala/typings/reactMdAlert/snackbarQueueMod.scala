package typings.reactMdAlert

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import typings.reactMdAlert.snackbarMod.SnackbarProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarQueueMod {
  
  @JSImport("@react-md/alert/types/SnackbarQueue", "SnackbarQueue")
  @js.native
  val SnackbarQueue: ForwardRefExoticComponent[SnackbarQueueProps[js.Any] & RefAttributes[HTMLDivElement]] = js.native
  
  type ActionEventHandler[M /* <: ToastMessage */] = js.Function2[/* message */ M, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]
  
  trait SnackbarQueueProps[M /* <: ToastMessage */]
    extends StObject
       with SnackbarProps {
    
    var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.undefined
    
    var queue: js.Array[M]
  }
  object SnackbarQueueProps {
    
    @scala.inline
    def apply[M /* <: ToastMessage */](id: String, queue: js.Array[M]): SnackbarQueueProps[M] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarQueueProps[M]]
    }
    
    @scala.inline
    implicit class SnackbarQueuePropsMutableBuilder[Self <: SnackbarQueueProps[?], M /* <: ToastMessage */] (val x: Self & SnackbarQueueProps[M]) extends AnyVal {
      
      @scala.inline
      def setOnActionClick(value: (M, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      @scala.inline
      def setQueue(value: js.Array[M]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueVarargs(value: M*): Self = StObject.set(x, "queue", js.Array(value :_*))
    }
  }
}
