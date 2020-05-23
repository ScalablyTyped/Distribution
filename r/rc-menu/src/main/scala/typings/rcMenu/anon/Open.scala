package typings.rcMenu.anon

import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Open extends js.Object {
  var item: ReactInstance
  var key: typings.react.mod.Key
  var open: Boolean
  var trigger: String
}

object Open {
  @scala.inline
  def apply(item: ReactInstance, key: typings.react.mod.Key, open: Boolean, trigger: String): Open = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
}

