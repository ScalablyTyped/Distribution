package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonFieldProps extends CommonFieldInputProps {
  @JSName("onBlur")
  var onBlur_Original: EventWithDataHandler[reactLib.reactMod.FocusEvent[_]] = js.native
  @JSName("onChange")
  var onChange_Original: EventWithDataHandler[reactLib.reactMod.ChangeEvent[_]] = js.native
  def onBlur(): scala.Unit = js.native
  def onBlur(event: reactLib.reactMod.FocusEvent[_]): scala.Unit = js.native
  def onBlur(event: reactLib.reactMod.FocusEvent[_], newValue: js.Any): scala.Unit = js.native
  def onBlur(event: reactLib.reactMod.FocusEvent[_], newValue: js.Any, previousValue: js.Any): scala.Unit = js.native
  def onBlur(
    event: reactLib.reactMod.FocusEvent[_],
    newValue: js.Any,
    previousValue: js.Any,
    name: java.lang.String
  ): scala.Unit = js.native
  def onChange(): scala.Unit = js.native
  def onChange(event: reactLib.reactMod.ChangeEvent[_]): scala.Unit = js.native
  def onChange(event: reactLib.reactMod.ChangeEvent[_], newValue: js.Any): scala.Unit = js.native
  def onChange(event: reactLib.reactMod.ChangeEvent[_], newValue: js.Any, previousValue: js.Any): scala.Unit = js.native
  def onChange(
    event: reactLib.reactMod.ChangeEvent[_],
    newValue: js.Any,
    previousValue: js.Any,
    name: java.lang.String
  ): scala.Unit = js.native
}

