package typings.rcVirtualList

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.AriaRole
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFillerMod extends Shortcut {
  
  /**
    * Fill component to provided the scroll content real height.
    */
  @JSImport("rc-virtual-list/es/Filler", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FillerProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait FillerProps extends StObject {
    
    var children: ReactNode
    
    /** Virtual filler height. Should be `count * itemMinHeight` */
    var height: Double
    
    var innerProps: js.UndefOr[InnerProps] = js.undefined
    
    /** Set offset of visible items. Should be the top of start item position */
    var offset: js.UndefOr[Double] = js.undefined
    
    var onInnerResize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object FillerProps {
    
    inline def apply(height: Double): FillerProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FillerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInnerProps(value: InnerProps): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      inline def setInnerPropsUndefined: Self = StObject.set(x, "innerProps", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnInnerResize(value: () => Unit): Self = StObject.set(x, "onInnerResize", js.Any.fromFunction0(value))
      
      inline def setOnInnerResizeUndefined: Self = StObject.set(x, "onInnerResize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'role' | 'id'> */
  trait InnerProps extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
  }
  object InnerProps {
    
    inline def apply(): InnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerProps] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FillerProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esFillerMod.foo` */
  override def _to: ForwardRefExoticComponent[FillerProps & RefAttributes[HTMLDivElement]] = default
}
