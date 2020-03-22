package typings.rcMenu

import typings.react.mod.Key
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpen extends js.Object {
  var item: ReactInstance
  var key: Key
  var open: Boolean
  var trigger: String
}

object AnonOpen {
  @scala.inline
  def apply(item: ReactInstance, key: Key, open: Boolean, trigger: String): AnonOpen = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpen]
  }
}

