package typings.rmcPicker

import typings.react.mod.Component
import typings.rmcPicker.anon.Children
import typings.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-picker/lib/Picker.native", JSImport.Namespace)
@js.native
object pickerNativeMod extends js.Object {
  
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
    
    def Item(): Unit = js.native
    
    var defaultProps: Children = js.native
  }
}
