package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps
  extends reactLib.reactMod.ReactNs.SelectHTMLAttributes[reactLib.HTMLSelectElement]
     with FieldProps {
  var options: SelectOptions
}

object SelectProps {
  @scala.inline
  def apply(
    options: SelectOptions,
    FieldProps: FieldProps = null,
    SelectHTMLAttributes: reactLib.reactMod.ReactNs.SelectHTMLAttributes[reactLib.HTMLSelectElement] = null,
    placeholder: java.lang.String = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    js.Dynamic.global.Object.assign(__obj, FieldProps)
    js.Dynamic.global.Object.assign(__obj, SelectHTMLAttributes)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[SelectProps]
  }
}

