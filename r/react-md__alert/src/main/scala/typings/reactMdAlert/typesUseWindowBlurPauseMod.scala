package typings.reactMdAlert

import typings.reactMdAlert.typesMessageQueueContextMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseWindowBlurPauseMod {
  
  @JSImport("@react-md/alert/types/useWindowBlurPause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useWindowBlurPause(param0: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowBlurPause")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[Message] = js.undefined
    
    def startTimer(): Unit
    
    def stopTimer(): Unit
    
    var visible: Boolean
  }
  object Options {
    
    inline def apply(startTimer: () => Unit, stopTimer: () => Unit, visible: Boolean): Options = {
      val __obj = js.Dynamic.literal(startTimer = js.Any.fromFunction0(startTimer), stopTimer = js.Any.fromFunction0(stopTimer), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStartTimer(value: () => Unit): Self = StObject.set(x, "startTimer", js.Any.fromFunction0(value))
      
      inline def setStopTimer(value: () => Unit): Self = StObject.set(x, "stopTimer", js.Any.fromFunction0(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
