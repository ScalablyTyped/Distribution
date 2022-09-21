package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.Modifier
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefObject
import typings.reactstrap.utilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  @JSImport("reactstrap/types/lib/DropdownMenu", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DropdownMenuProps, js.Object, Any]
  
  type DropdownMenu = Component[DropdownMenuProps, js.Object, Any]
  
  trait DropdownMenuProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var dark: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[String, Any]]] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var strategy: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var updateOnSelect: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownMenuProps {
    
    inline def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    extension [Self <: DropdownMenuProps](x: Self) {
      
      inline def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[String, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[String, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setUpdateOnSelect(value: Boolean): Self = StObject.set(x, "updateOnSelect", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnSelectUndefined: Self = StObject.set(x, "updateOnSelect", js.undefined)
    }
  }
}
