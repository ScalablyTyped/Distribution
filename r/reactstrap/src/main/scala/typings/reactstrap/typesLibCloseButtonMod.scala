package typings.reactstrap

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.reactstrap.reactstrapStrings.black
import typings.reactstrap.reactstrapStrings.white
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCloseButtonMod {
  
  @JSImport("reactstrap/types/lib/CloseButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CloseButtonProps, js.Object, Any]
  
  type CloseButton = Component[CloseButtonProps, js.Object, Any]
  
  trait CloseButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var variant: js.UndefOr[white | black] = js.undefined
  }
  object CloseButtonProps {
    
    inline def apply(): CloseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseButtonProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setVariant(value: white | black): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
