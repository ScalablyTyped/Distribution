package typings.rcPicker.rangePickerMod

import typings.rcPicker.pickerMod.PickerRefConfig
import typings.react.mod.Component
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangePicker[DateType]
  extends Component[RangePickerProps[DateType], js.Object, js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var pickerRef: RefObject[PickerRefConfig] = js.native
}
