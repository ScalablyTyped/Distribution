package typings.storybookComponents.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowProps extends js.Object {
  var color: String = js.native
  var placement: String = js.native
}

object ArrowProps {
  @scala.inline
  def apply(color: String, placement: String): ArrowProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArrowProps]
  }
}

