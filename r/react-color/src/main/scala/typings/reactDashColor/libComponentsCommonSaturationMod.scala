package typings.reactDashColor

import typings.react.reactMod.Component
import typings.reactDashColor.libComponentsCommonSaturationMod.Saturation
import typings.reactDashColor.libComponentsCommonSaturationMod.SaturationProps
import typings.reactDashColor.reactDashColorMod.CustomPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/Saturation", JSImport.Namespace)
@js.native
object libComponentsCommonSaturationMod extends js.Object {
  @js.native
  trait Saturation
    extends Component[SaturationProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[SaturationProps, js.Object, js.Any]
  
  type SaturationProps = CustomPickerProps[Saturation]
}

