package typings.rcDashMenu

import typings.react.reactMod.Key
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: ReactInstance
  var key: Key
  var open: Boolean
  var trigger: String
}

object Anon_Item {
  @scala.inline
  def apply(item: ReactInstance, key: Key, open: Boolean, trigger: String): Anon_Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], open = open, trigger = trigger)
  
    __obj.asInstanceOf[Anon_Item]
  }
}

