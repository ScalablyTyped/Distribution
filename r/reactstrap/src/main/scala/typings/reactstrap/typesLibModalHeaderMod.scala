package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibModalHeaderMod {
  
  @JSImport("reactstrap/types/lib/ModalHeader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalHeaderProps, js.Object, Any]
  
  type ModalHeader = Component[ModalHeaderProps, js.Object, Any]
  
  trait ModalHeaderProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[Any]] = js.undefined
    
    var wrapTag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object ModalHeaderProps {
    
    inline def apply(): ModalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setToggle(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setWrapTag(value: ElementType[Any]): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      inline def setWrapTagUndefined: Self = StObject.set(x, "wrapTag", js.undefined)
    }
  }
}
