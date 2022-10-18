package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibDropdownToggleMod {
  
  @JSImport("reactstrap/types/lib/DropdownToggle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DropdownToggleProps, js.Object, Any]
  
  type DropdownToggle = Component[DropdownToggleProps, js.Object, Any]
  
  trait DropdownToggleProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    @JSName("aria-haspopup")
    var `aria-haspopup_DropdownToggleProps`: js.UndefOr[Boolean] = js.undefined
    
    var caret: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var `data-toggle`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var nav: js.UndefOr[Boolean] = js.undefined
    
    var outline: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var split: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object DropdownToggleProps {
    
    inline def apply(): DropdownToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownToggleProps]
    }
    
    extension [Self <: DropdownToggleProps](x: Self) {
      
      inline def `setAria-haspopup`(value: Boolean): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def setCaret(value: Boolean): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
      
      inline def setCaretUndefined: Self = StObject.set(x, "caret", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def `setData-toggle`(value: String): Self = StObject.set(x, "data-toggle", value.asInstanceOf[js.Any])
      
      inline def `setData-toggleUndefined`: Self = StObject.set(x, "data-toggle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
