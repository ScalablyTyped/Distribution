package typings.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends js.Object {
  var animation: String
  var prefixCls: String
  var style: AnonLeft
}

object AnonAnimation {
  @scala.inline
  def apply(animation: String, prefixCls: String, style: AnonLeft): AnonAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimation]
  }
}

