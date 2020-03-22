package typings.rcTimePicker.mod

import typings.rcTimePicker.PartialTimePickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[PartialTimePickerProps, js.Object, js.Any] {
  def close(): Unit = js.native
  def isAM(): Boolean = js.native
}

