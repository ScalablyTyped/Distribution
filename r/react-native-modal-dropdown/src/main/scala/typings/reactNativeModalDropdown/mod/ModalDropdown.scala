package typings.reactNativeModalDropdown.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDropdown[T]
  extends Component[ModalDropdownProps[T], js.Object, js.Any] {
  def hide(): Unit = js.native
  def select(index: Double): Unit = js.native
  def show(): Unit = js.native
}

