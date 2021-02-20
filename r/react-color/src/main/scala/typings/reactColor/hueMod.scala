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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hueMod {
  
  @JSImport("react-color/lib/components/common/Hue", JSImport.Default)
  @js.native
  class default ()
    extends Component[HueProps, js.Object, js.Any]
  
  @js.native
  trait Hue
    extends Component[HueProps, js.Object, js.Any]
  
  @js.native
  trait HueProps extends CustomPickerProps[Hue] {
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
  }
  object HueProps {
    
    @scala.inline
    def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): HueProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[HueProps]
    }
    
    @scala.inline
    implicit class HuePropsMutableBuilder[Self <: HueProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
