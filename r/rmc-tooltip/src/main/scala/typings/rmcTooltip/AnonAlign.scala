package typings.rmcTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var arrowContent: Null
  var destroyTooltipOnHide: Boolean
  var placement: String
  var prefixCls: String
}

object AnonAlign {
  @scala.inline
  def apply(arrowContent: Null, destroyTooltipOnHide: Boolean, placement: String, prefixCls: String): AnonAlign = {
    val __obj = js.Dynamic.literal(arrowContent = arrowContent.asInstanceOf[js.Any], destroyTooltipOnHide = destroyTooltipOnHide.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlign]
  }
}

