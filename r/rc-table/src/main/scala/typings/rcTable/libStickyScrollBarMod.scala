package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.`0`
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStickyScrollBarMod extends Shortcut {
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[Any]] = js.native
  
  trait StickyScrollBarProps extends StObject {
    
    var container: HTMLElement | Window
    
    var offsetScroll: Double
    
    def onScroll(params: `0`): Unit
    
    var scrollBodyRef: RefObject[HTMLDivElement]
  }
  object StickyScrollBarProps {
    
    inline def apply(
      container: HTMLElement | Window,
      offsetScroll: Double,
      onScroll: `0` => Unit,
      scrollBodyRef: RefObject[HTMLDivElement]
    ): StickyScrollBarProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyScrollBarProps]
    }
    
    extension [Self <: StickyScrollBarProps](x: Self) {
      
      inline def setContainer(value: HTMLElement | Window): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: `0` => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setScrollBodyRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "scrollBodyRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libStickyScrollBarMod.foo` */
  override def _to: ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[Any]] = default
}
