package typings.rcVirtualList

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillerMod extends Shortcut {
  
  /**
    * Fill component to provided the scroll content real height.
    */
  @JSImport("rc-virtual-list/es/Filler", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FillerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait FillerProps extends StObject {
    
    var children: ReactNode = js.native
    
    /** Virtual filler height. Should be `count * itemMinHeight` */
    var height: Double = js.native
    
    /** Set offset of visible items. Should be the top of start item position */
    var offset: js.UndefOr[Double] = js.native
    
    var onInnerResize: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object FillerProps {
    
    @scala.inline
    def apply(height: Double): FillerProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillerProps]
    }
    
    @scala.inline
    implicit class FillerPropsMutableBuilder[Self <: FillerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnInnerResize(value: () => Unit): Self = StObject.set(x, "onInnerResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInnerResizeUndefined: Self = StObject.set(x, "onInnerResize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FillerProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `fillerMod.foo` */
  override def _to: ForwardRefExoticComponent[FillerProps with RefAttributes[HTMLDivElement]] = default
}
