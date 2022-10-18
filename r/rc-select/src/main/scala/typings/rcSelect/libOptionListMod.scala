package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcVirtualList.esListMod.ScrollConfig
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionListMod extends Shortcut {
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]] = js.native
  
  type OptionListProps = Record[String, scala.Nothing]
  
  trait RefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var onKeyUp: KeyboardEventHandler[Element]
    
    var scrollTo: js.UndefOr[js.Function1[/* args */ Double | ScrollConfig, Unit]] = js.undefined
  }
  object RefOptionListProps {
    
    inline def apply(onKeyDown: KeyboardEvent[Element] => Unit, onKeyUp: KeyboardEvent[Element] => Unit): RefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
      __obj.asInstanceOf[RefOptionListProps]
    }
    
    extension [Self <: RefOptionListProps](x: Self) {
      
      inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setScrollTo(value: /* args */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libOptionListMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]] = default
}
