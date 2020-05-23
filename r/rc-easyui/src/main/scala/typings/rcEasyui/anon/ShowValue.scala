package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowValue extends js.Object {
  var showValue: Boolean
  var value: Double
}

object ShowValue {
  @scala.inline
  def apply(showValue: Boolean, value: Double): ShowValue = {
    val __obj = js.Dynamic.literal(showValue = showValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowValue]
  }
}

