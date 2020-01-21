package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnable extends js.Object {
  var enable: Boolean
  var enable_text: Boolean
}

object AnonEnable {
  @scala.inline
  def apply(enable: Boolean, enable_text: Boolean): AnonEnable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enable_text = enable_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnable]
  }
}

