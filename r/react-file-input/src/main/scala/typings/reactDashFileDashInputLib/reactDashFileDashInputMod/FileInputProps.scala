package typings
package reactDashFileDashInputLib.reactDashFileDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInputProps extends js.Object {
  var accept: java.lang.String
  var className: java.lang.String
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var placeholder: java.lang.String
  def onChange(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit
}

object FileInputProps {
  @scala.inline
  def apply(
    accept: java.lang.String,
    className: java.lang.String,
    name: java.lang.String,
    onChange: js.Function1[reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit],
    placeholder: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): FileInputProps = {
    val __obj = js.Dynamic.literal(accept = accept, className = className, name = name, onChange = onChange, placeholder = placeholder)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[FileInputProps]
  }
}

