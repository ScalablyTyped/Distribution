package typings
package reactDashSelectLib.libComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[OptionType] extends js.Object {
  var components: SelectComponentsConfig[OptionType]
}

object Props {
  @scala.inline
  def apply[OptionType](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("components")(components)
    __obj.asInstanceOf[Props[OptionType]]
  }
}

