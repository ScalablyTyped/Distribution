package typings.rmcDashPicker

import typings.react.reactMod.Component
import typings.rmcDashPicker.libPickerDotNativeMod.Picker
import typings.rmcDashPicker.libPickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/Picker.native", JSImport.Namespace)
@js.native
object libPickerDotNativeMod extends js.Object {
  @js.native
  trait Picker
    extends Component[IPickerProps, js.Object, js.Any] {
    def getValue(): js.Any = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPicker(nextProps: js.Any): Boolean = js.native
  }
  
  @js.native
  class default () extends Picker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_ChildrenAny = js.native
    def Item(): Unit = js.native
  }
  
}

