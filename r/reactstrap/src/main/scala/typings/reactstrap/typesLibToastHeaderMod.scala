package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibToastHeaderMod {
  
  @JSImport("reactstrap/types/lib/ToastHeader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToastHeaderProps, js.Object, Any]
  
  type ToastHeader = Component[ToastHeaderProps, js.Object, Any]
  
  trait ToastHeaderProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var close: js.UndefOr[ReactNode] = js.undefined
    
    var closeAriaLabel: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var icon: js.UndefOr[String | ReactNode] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[Any]] = js.undefined
    
    var wrapTag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object ToastHeaderProps {
    
    inline def apply(): ToastHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastHeaderProps]
    }
    
    extension [Self <: ToastHeaderProps](x: Self) {
      
      inline def setClose(value: ReactNode): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseAriaLabel(value: String): Self = StObject.set(x, "closeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseAriaLabelUndefined: Self = StObject.set(x, "closeAriaLabel", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setIcon(value: String | ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setToggle(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setWrapTag(value: ElementType[Any]): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      inline def setWrapTagUndefined: Self = StObject.set(x, "wrapTag", js.undefined)
    }
  }
}
