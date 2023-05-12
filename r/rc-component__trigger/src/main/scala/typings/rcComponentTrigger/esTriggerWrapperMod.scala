package typings.rcComponentTrigger

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTriggerWrapperMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/TriggerWrapper", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TriggerWrapperProps & RefAttributes[HTMLElement]] = js.native
  
  trait TriggerWrapperProps extends StObject {
    
    var children: ReactElement
    
    var getTriggerDOMNode: js.UndefOr[js.Function1[/* node */ ReactInstance, HTMLElement]] = js.undefined
  }
  object TriggerWrapperProps {
    
    inline def apply(children: ReactElement): TriggerWrapperProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerWrapperProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setGetTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): Self = StObject.set(x, "getTriggerDOMNode", js.Any.fromFunction1(value))
      
      inline def setGetTriggerDOMNodeUndefined: Self = StObject.set(x, "getTriggerDOMNode", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TriggerWrapperProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTriggerWrapperMod.foo` */
  override def _to: ForwardRefExoticComponent[TriggerWrapperProps & RefAttributes[HTMLElement]] = default
}
