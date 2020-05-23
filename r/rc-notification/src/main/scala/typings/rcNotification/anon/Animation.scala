package typings.rcNotification.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: String
  var prefixCls: String
  var style: Left
}

object Animation {
  @scala.inline
  def apply(animation: String, prefixCls: String, style: Left): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

