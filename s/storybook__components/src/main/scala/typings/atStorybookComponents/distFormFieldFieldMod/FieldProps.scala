package typings.atStorybookComponents.distFormFieldFieldMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps extends js.Object {
  var label: js.UndefOr[ReactNode] = js.undefined
}

object FieldProps {
  @scala.inline
  def apply(label: ReactNode = null): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps]
  }
}

