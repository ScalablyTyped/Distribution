package typings.reactMdTypography

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTypography.typographyMod.TypographyHTMLElement
import typings.reactMdTypography.typographyMod.TypographyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srOnlyMod {
  
  @JSImport("@react-md/typography/types/SrOnly", "SrOnly")
  @js.native
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps & RefAttributes[TypographyHTMLElement]] = js.native
  
  trait SrOnlyProps
    extends StObject
       with TypographyProps {
    
    /**
      * Boolean if the text should become visible when focused. If this prop is
      * enabled and the `tabIndex` prop is `undefined`, the `tabIndex` will be
      * updated to be `0`.
      */
    var focusable: js.UndefOr[Boolean] = js.undefined
  }
  object SrOnlyProps {
    
    inline def apply(): SrOnlyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SrOnlyProps]
    }
    
    extension [Self <: SrOnlyProps](x: Self) {
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    }
  }
}
