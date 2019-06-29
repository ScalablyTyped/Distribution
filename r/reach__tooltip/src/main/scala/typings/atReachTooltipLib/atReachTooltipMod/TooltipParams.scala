package typings
package atReachTooltipLib.atReachTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipParams extends js.Object {
  var id: java.lang.String
  var isVisible: scala.Boolean
  var triggerRect: stdLib.DOMRect
}

object TooltipParams {
  @scala.inline
  def apply(id: java.lang.String, isVisible: scala.Boolean, triggerRect: stdLib.DOMRect): TooltipParams = {
    val __obj = js.Dynamic.literal(id = id, isVisible = isVisible, triggerRect = triggerRect)
  
    __obj.asInstanceOf[TooltipParams]
  }
}

