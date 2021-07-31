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

object stickyScrollBarMod extends Shortcut {
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[js.Any]] = js.native
  
  trait StickyScrollBarProps extends StObject {
    
    var container: HTMLElement | Window
    
    var offsetScroll: Double
    
    def onScroll(params: `0`): Unit
    
    var scrollBodyRef: RefObject[HTMLDivElement]
  }
  object StickyScrollBarProps {
    
    @scala.inline
    def apply(
      container: HTMLElement | Window,
      offsetScroll: Double,
      onScroll: `0` => Unit,
      scrollBodyRef: RefObject[HTMLDivElement]
    ): StickyScrollBarProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyScrollBarProps]
    }
    
    @scala.inline
    implicit class StickyScrollBarPropsMutableBuilder[Self <: StickyScrollBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement | Window): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: `0` => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollBodyRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "scrollBodyRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `stickyScrollBarMod.foo` */
  override def _to: ForwardRefExoticComponent[StickyScrollBarProps & RefAttributes[js.Any]] = default
}
