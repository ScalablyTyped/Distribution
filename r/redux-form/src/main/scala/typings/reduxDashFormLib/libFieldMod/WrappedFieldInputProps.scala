package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldInputProps extends CommonFieldInputProps {
  var checked: js.UndefOr[scala.Boolean] = js.native
  @JSName("onBlur")
  var onBlur_Original: EventOrValueHandler[reactLib.reactMod.FocusEvent[_]] = js.native
  @JSName("onChange")
  var onChange_Original: EventOrValueHandler[reactLib.reactMod.ChangeEvent[_]] = js.native
  var value: js.Any = js.native
  def onBlur(value: js.Any): scala.Unit = js.native
  def onChange(value: js.Any): scala.Unit = js.native
}

