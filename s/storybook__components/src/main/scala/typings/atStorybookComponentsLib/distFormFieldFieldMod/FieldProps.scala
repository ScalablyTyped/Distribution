package typings
package atStorybookComponentsLib.distFormFieldFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps extends js.Object {
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object FieldProps {
  @scala.inline
  def apply(label: reactLib.reactMod.ReactNode = null): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps]
  }
}

