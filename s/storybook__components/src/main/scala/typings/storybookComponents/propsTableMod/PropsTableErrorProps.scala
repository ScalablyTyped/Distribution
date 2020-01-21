package typings.storybookComponents.propsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsTableErrorProps extends PropsTableProps {
  var error: PropsTableError
}

object PropsTableErrorProps {
  @scala.inline
  def apply(error: PropsTableError): PropsTableErrorProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropsTableErrorProps]
  }
}

