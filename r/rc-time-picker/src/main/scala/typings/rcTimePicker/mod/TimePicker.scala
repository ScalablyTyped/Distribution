package typings.rcTimePicker.mod

import typings.react.mod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[Partial[TimePickerProps], js.Object, js.Any] {
  def close(): Unit = js.native
  def isAM(): Boolean = js.native
}

