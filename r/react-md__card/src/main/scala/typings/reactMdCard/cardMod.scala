package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@react-md/card/types/Card", "Card")
  @js.native
  val Card: ForwardRefExoticComponent[CardProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait CardProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the card should use a border instead of box-shadow. Enabling
      * this prop will always disable the `raiseable` prop.
      */
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the card should no longer be `display: inline-block`, but
      * instead `display: block; width: 100%;`.
      */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the card should gain additional box-shadow elevation once
      * hovered.
      */
    var raiseable: js.UndefOr[Boolean] = js.undefined
  }
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setRaiseable(value: Boolean): Self = StObject.set(x, "raiseable", value.asInstanceOf[js.Any])
      
      inline def setRaiseableUndefined: Self = StObject.set(x, "raiseable", js.undefined)
    }
  }
}
