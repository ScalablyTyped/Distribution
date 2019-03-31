package typings
package rmcDashStepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var direction: java.lang.String
  var iconPrefix: java.lang.String
  var labelPlacement: java.lang.String
  var prefixCls: java.lang.String
  var progressDot: scala.Boolean
  var size: java.lang.String
  var status: java.lang.String
}

object Anon_Current {
  @scala.inline
  def apply(
    current: scala.Double,
    direction: java.lang.String,
    iconPrefix: java.lang.String,
    labelPlacement: java.lang.String,
    prefixCls: java.lang.String,
    progressDot: scala.Boolean,
    size: java.lang.String,
    status: java.lang.String
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, direction = direction, iconPrefix = iconPrefix, labelPlacement = labelPlacement, prefixCls = prefixCls, progressDot = progressDot, size = size, status = status)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

