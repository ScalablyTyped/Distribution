package typings.reactColor

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.CustomPickerProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonSaturationMod {
  
  @JSImport("react-color/lib/components/common/Saturation", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SaturationProps, js.Object, Any]
  
  type Saturation = Component[SaturationProps, js.Object, Any]
  
  trait SaturationProps
    extends StObject
       with CustomPickerProps[Saturation]
  object SaturationProps {
    
    inline def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): SaturationProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[SaturationProps]
    }
  }
}
