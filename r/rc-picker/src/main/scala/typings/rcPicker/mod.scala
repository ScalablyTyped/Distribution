package typings.rcPicker

import typings.rcPicker.pickerMod.Picker
import typings.rcPicker.pickerPanelMod.PickerPanelProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RangePicker[DateType] ()
    extends typings.rcPicker.rangePickerMod.RangePicker[DateType]
  
  @js.native
  class default[DateType] () extends Picker[DateType]
  
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): Element = js.native
}

