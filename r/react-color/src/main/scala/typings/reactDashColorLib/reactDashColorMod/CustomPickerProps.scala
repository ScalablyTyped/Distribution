package typings
package reactDashColorLib.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPickerProps[A]
  extends reactLib.reactMod.ReactNs.ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.native
  @JSName("onChange")
  var onChange_Original: ColorChangeHandler = js.native
  var pointer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  def onChange(color: ColorResult): scala.Unit = js.native
}

