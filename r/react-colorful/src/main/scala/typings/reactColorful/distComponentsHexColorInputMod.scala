package typings.reactColorful

import typings.react.mod.global.JSX.Element
import typings.reactColorful.distTypesMod.ColorInputBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsHexColorInputMod {
  
  @JSImport("react-colorful/dist/components/HexColorInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HexColorInput(props: HexColorInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HexColorInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HexColorInputProps
    extends StObject
       with ColorInputBaseProps {
    
    /** Allows `#rgba` and `#rrggbbaa` color formats */
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    /** Enables `#` prefix displaying */
    var prefixed: js.UndefOr[Boolean] = js.undefined
  }
  object HexColorInputProps {
    
    inline def apply(): HexColorInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HexColorInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HexColorInputProps] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setPrefixed(value: Boolean): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      inline def setPrefixedUndefined: Self = StObject.set(x, "prefixed", js.undefined)
    }
  }
}
