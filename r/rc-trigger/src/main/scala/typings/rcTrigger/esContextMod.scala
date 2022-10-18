package typings.rcTrigger

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-trigger/es/context", JSImport.Default)
  @js.native
  val default: Context[TriggerContextProps] = js.native
  
  trait TriggerContextProps extends StObject {
    
    var onPopupMouseDown: MouseEventHandler[HTMLElement]
  }
  object TriggerContextProps {
    
    inline def apply(onPopupMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): TriggerContextProps = {
      val __obj = js.Dynamic.literal(onPopupMouseDown = js.Any.fromFunction1(onPopupMouseDown))
      __obj.asInstanceOf[TriggerContextProps]
    }
    
    extension [Self <: TriggerContextProps](x: Self) {
      
      inline def setOnPopupMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onPopupMouseDown", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[TriggerContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[TriggerContextProps] = default
}
