package typings.reactColor

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.CustomPickerProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonAlphaMod {
  
  @JSImport("react-color/lib/components/common/Alpha", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AlphaProps, js.Object, Any]
  
  type Alpha = Component[AlphaProps, js.Object, Any]
  
  trait AlphaProps
    extends StObject
       with CustomPickerProps[Alpha]
  object AlphaProps {
    
    inline def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): AlphaProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[AlphaProps]
    }
  }
}
