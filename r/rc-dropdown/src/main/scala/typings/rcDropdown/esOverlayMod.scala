package typings.rcDropdown

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOverlayMod extends Shortcut {
  
  @JSImport("rc-dropdown/es/Overlay", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = js.native
  
  /* Inlined std.Pick<rc-dropdown.rc-dropdown/es/Dropdown.DropdownProps, 'overlay' | 'arrow' | 'prefixCls'> */
  trait OverlayProps extends StObject {
    
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(): OverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setOverlay(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esOverlayMod.foo` */
  override def _to: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = default
}
