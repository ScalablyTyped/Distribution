package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupAddonMod {
  
  @JSImport("reactstrap/lib/InputGroupAddon", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputGroupAddonProps, js.Object, js.Any]
  
  type InputGroupAddon = Component[InputGroupAddonProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupAddonProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var addonType: prepend | append = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object InputGroupAddonProps {
    
    @scala.inline
    def apply(addonType: prepend | append): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    @scala.inline
    implicit class InputGroupAddonPropsMutableBuilder[Self <: InputGroupAddonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonType(value: prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
