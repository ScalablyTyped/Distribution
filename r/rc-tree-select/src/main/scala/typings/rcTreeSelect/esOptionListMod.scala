package typings.rcTreeSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcVirtualList.esListMod.ScrollConfig
import typings.rcVirtualList.esListMod.ScrollTo
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefAttributes
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RefAttributes[ReviseRefOptionListProps]] = js.native
  
  /* Inlined std.Omit<rc-select.rc-select/lib/OptionList.RefOptionListProps, 'scrollTo'> & {  scrollTo :rc-tree.rc-tree/es/interface.ScrollTo} */
  trait ReviseRefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var onKeyUp: KeyboardEventHandler[Element]
    
    var scrollTo: ScrollTo
  }
  object ReviseRefOptionListProps {
    
    inline def apply(
      onKeyDown: KeyboardEvent[Element] => Unit,
      onKeyUp: KeyboardEvent[Element] => Unit,
      scrollTo: /* arg */ Double | ScrollConfig => Unit
    ): ReviseRefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[ReviseRefOptionListProps]
    }
    
    extension [Self <: ReviseRefOptionListProps](x: Self) {
      
      inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[RefAttributes[ReviseRefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListMod.foo` */
  override def _to: ForwardRefExoticComponent[RefAttributes[ReviseRefOptionListProps]] = default
}
