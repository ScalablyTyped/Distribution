package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  @JSImport("reactstrap/lib/DropdownMenu", JSImport.Default)
  @js.native
  class default ()
    extends Component[DropdownMenuProps, js.Object, js.Any]
  
  type DropdownMenu = Component[DropdownMenuProps, js.Object, js.Any]
  
  trait DropdownMenuProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
    
    var positionFixed: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class DropdownMenuPropsMutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setModifiers(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifiers */ js.Any
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      @scala.inline
      def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
