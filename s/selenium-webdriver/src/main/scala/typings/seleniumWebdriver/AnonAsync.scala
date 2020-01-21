package typings.seleniumWebdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsync extends js.Object {
  var async: Boolean
  var bridge: Boolean
}

object AnonAsync {
  @scala.inline
  def apply(async: Boolean, bridge: Boolean): AnonAsync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsync]
  }
}

