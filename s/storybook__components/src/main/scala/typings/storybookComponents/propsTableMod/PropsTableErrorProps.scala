package typings.storybookComponents.propsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsTableErrorProps extends PropsTableProps {
  var error: PropsTableError = js.native
}

object PropsTableErrorProps {
  @scala.inline
  def apply(error: PropsTableError): PropsTableErrorProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTableErrorProps]
  }
  @scala.inline
  implicit class PropsTableErrorPropsOps[Self <: PropsTableErrorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: PropsTableError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

