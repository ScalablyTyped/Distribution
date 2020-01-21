package typings.rmcSteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: Double
  var direction: String
  var iconPrefix: String
  var labelPlacement: String
  var prefixCls: String
  var progressDot: Boolean
  var size: String
  var status: String
}

object AnonCurrent {
  @scala.inline
  def apply(
    current: Double,
    direction: String,
    iconPrefix: String,
    labelPlacement: String,
    prefixCls: String,
    progressDot: Boolean,
    size: String,
    status: String
  ): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], labelPlacement = labelPlacement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], progressDot = progressDot.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrent]
  }
}

