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
}

