package typings.reactColor

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.CustomPickerProps
import typings.reactColor.reactColorStrings.horizontal
import typings.reactColor.reactColorStrings.vertical
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonHueMod {
  
  @JSImport("react-color/lib/components/common/Hue", JSImport.Default)
  @js.native
  open class default ()
    extends Component[HueProps, js.Object, Any]
  
  type Hue = Component[HueProps, js.Object, Any]
  
  trait HueProps
    extends StObject
       with CustomPickerProps[Hue] {
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object HueProps {
    
    inline def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): HueProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[HueProps]
    }
    
    extension [Self <: HueProps](x: Self) {
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
