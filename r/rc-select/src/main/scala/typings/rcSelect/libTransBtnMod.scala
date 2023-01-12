package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.libBaseSelectMod.RenderNode
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransBtnMod extends Shortcut {
  
  @JSImport("rc-select/lib/TransBtn", JSImport.Default)
  @js.native
  val default: FC[TransBtnProps] = js.native
  
  trait TransBtnProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: String
    
    var customizeIcon: RenderNode
    
    var customizeIconProps: js.UndefOr[Any] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  }
  object TransBtnProps {
    
    inline def apply(className: String): TransBtnProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransBtnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransBtnProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCustomizeIcon(value: RenderNode): Self = StObject.set(x, "customizeIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomizeIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "customizeIcon", js.Any.fromFunction1(value))
      
      inline def setCustomizeIconProps(value: Any): Self = StObject.set(x, "customizeIconProps", value.asInstanceOf[js.Any])
      
      inline def setCustomizeIconPropsUndefined: Self = StObject.set(x, "customizeIconProps", js.undefined)
      
      inline def setCustomizeIconUndefined: Self = StObject.set(x, "customizeIcon", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    }
  }
  
  type _To = FC[TransBtnProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTransBtnMod.foo` */
  override def _to: FC[TransBtnProps] = default
}
