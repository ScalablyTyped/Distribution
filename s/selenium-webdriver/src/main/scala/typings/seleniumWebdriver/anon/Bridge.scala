package typings.seleniumWebdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bridge extends js.Object {
  var bridge: Boolean
}

object Bridge {
  @scala.inline
  def apply(bridge: Boolean): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
}

