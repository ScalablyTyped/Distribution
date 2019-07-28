package typings.rmcDashSteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Double
  var direction: String
  var iconPrefix: String
  var labelPlacement: String
  var prefixCls: String
  var progressDot: Boolean
  var size: String
  var status: String
}

object Anon_Current {
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
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, direction = direction, iconPrefix = iconPrefix, labelPlacement = labelPlacement, prefixCls = prefixCls, progressDot = progressDot, size = size, status = status)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

