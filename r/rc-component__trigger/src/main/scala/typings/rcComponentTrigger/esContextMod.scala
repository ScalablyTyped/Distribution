package typings.rcComponentTrigger

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/context", JSImport.Default)
  @js.native
  val default: Context[TriggerContextProps] = js.native
  
  trait TriggerContextProps extends StObject {
    
    def registerSubPopup(id: String, node: HTMLElement): Unit
  }
  object TriggerContextProps {
    
    inline def apply(registerSubPopup: (String, HTMLElement) => Unit): TriggerContextProps = {
      val __obj = js.Dynamic.literal(registerSubPopup = js.Any.fromFunction2(registerSubPopup))
      __obj.asInstanceOf[TriggerContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerContextProps] (val x: Self) extends AnyVal {
      
      inline def setRegisterSubPopup(value: (String, HTMLElement) => Unit): Self = StObject.set(x, "registerSubPopup", js.Any.fromFunction2(value))
    }
  }
  
  type _To = Context[TriggerContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[TriggerContextProps] = default
}
