package typings.reactColor

import typings.react.mod.Component
import typings.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/material/Material", JSImport.Namespace)
@js.native
object materialMod extends js.Object {
  @js.native
  trait MaterialPicker
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  type MaterialPickerProps = ColorPickerProps[MaterialPicker]
}

