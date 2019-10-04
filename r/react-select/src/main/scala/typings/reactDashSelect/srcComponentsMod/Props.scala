package typings.reactDashSelect.srcComponentsMod

import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var components: SelectComponentsConfig[OptionType]
}

object Props {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
    val __obj = js.Dynamic.literal(components = components)
  
    __obj.asInstanceOf[Props[OptionType]]
  }
}

