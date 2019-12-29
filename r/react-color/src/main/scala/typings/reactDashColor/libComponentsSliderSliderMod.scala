package typings.reactDashColor

import typings.react.reactMod.Component
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/slider/Slider", JSImport.Namespace)
@js.native
object libComponentsSliderSliderMod extends js.Object {
  @js.native
  trait SliderPicker
    extends Component[SliderPickerProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[SliderPickerProps, js.Object, js.Any]
  
  type SliderPickerProps = ColorPickerProps[SliderPicker]
}

