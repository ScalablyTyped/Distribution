package typings.rcResizeObserver

import org.scalablytyped.runtime.Shortcut
import typings.rcResizeObserver.mod.ResizeObserverProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSingleObserverMod extends Shortcut {
  
  @JSImport("rc-resize-observer/es/SingleObserver", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SingleObserverProps & RefAttributes[HTMLElement]] = js.native
  
  trait SingleObserverProps
    extends StObject
       with ResizeObserverProps {
    
    @JSName("children")
    var children_SingleObserverProps: ReactElement | (js.Function1[/* ref */ RefObject[Element], ReactElement])
  }
  object SingleObserverProps {
    
    inline def apply(children: ReactElement | (js.Function1[/* ref */ RefObject[Element], ReactElement])): SingleObserverProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleObserverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleObserverProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement | (js.Function1[/* ref */ RefObject[Element], ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ref */ RefObject[Element] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[SingleObserverProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esSingleObserverMod.foo` */
  override def _to: ForwardRefExoticComponent[SingleObserverProps & RefAttributes[HTMLElement]] = default
}
