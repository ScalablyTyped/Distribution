package typings.seleniumWebdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBridge extends js.Object {
  var bridge: Boolean
}

object AnonBridge {
  @scala.inline
  def apply(bridge: Boolean): AnonBridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBridge]
  }
}

