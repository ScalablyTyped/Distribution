package typings.rcPicker.pickerMod

import typings.react.mod.Component
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picker[DateType]
  extends Component[PickerProps[DateType], js.Object, js.Any] {
  var pickerRef: RefObject[PickerRefConfig] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

