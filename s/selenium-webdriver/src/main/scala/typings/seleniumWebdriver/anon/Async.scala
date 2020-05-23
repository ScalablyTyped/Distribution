package typings.seleniumWebdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Async extends js.Object {
  var async: Boolean
  var bridge: Boolean
}

object Async {
  @scala.inline
  def apply(async: Boolean, bridge: Boolean): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
}

