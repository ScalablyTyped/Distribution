package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownToggleMod {
  
  @JSImport("reactstrap/lib/DropdownToggle", JSImport.Default)
  @js.native
  class default ()
    extends Component[DropdownToggleProps, js.Object, js.Any]
  
  type DropdownToggle = Component[DropdownToggleProps, js.Object, js.Any]
  
  @js.native
  trait DropdownToggleProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    @JSName("aria-haspopup")
    var `aria-haspopup_DropdownToggleProps`: js.UndefOr[Boolean] = js.native
    
    var caret: js.UndefOr[Boolean] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var `data-toggle`: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var nav: js.UndefOr[Boolean] = js.native
    
    var outline: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var split: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object DropdownToggleProps {
    
    @scala.inline
    def apply(): DropdownToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownToggleProps]
    }
    
    @scala.inline
    implicit class DropdownTogglePropsMutableBuilder[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def setCaret(value: Boolean): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretUndefined: Self = StObject.set(x, "caret", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def `setData-toggle`(value: String): Self = StObject.set(x, "data-toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-toggleUndefined`: Self = StObject.set(x, "data-toggle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
