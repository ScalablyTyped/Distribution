package typings.reactMdAlert

import typings.reactMdAlert.messageQueueContextMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWindowBlurPauseMod {
  
  @JSImport("@react-md/alert/types/useWindowBlurPause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useWindowBlurPause(hasStartTimerStopTimerVisibleMessageDisabled: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowBlurPause")(hasStartTimerStopTimerVisibleMessageDisabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[Message] = js.undefined
    
    def startTimer(): Unit
    
    def stopTimer(): Unit
    
    var visible: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(startTimer: () => Unit, stopTimer: () => Unit, visible: Boolean): Options = {
      val __obj = js.Dynamic.literal(startTimer = js.Any.fromFunction0(startTimer), stopTimer = js.Any.fromFunction0(stopTimer), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStartTimer(value: () => Unit): Self = StObject.set(x, "startTimer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopTimer(value: () => Unit): Self = StObject.set(x, "stopTimer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
