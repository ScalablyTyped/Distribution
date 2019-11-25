package typings.seleniumDashWebdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: Boolean
  var bridge: Boolean
}

object Anon_Async {
  @scala.inline
  def apply(async: Boolean, bridge: Boolean): Anon_Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Async]
  }
}

