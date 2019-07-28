package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: this.type
  var originalEvent: Event
}

object Anon_Item {
  @scala.inline
  def apply(item: Anon_Item, originalEvent: Event): Anon_Item = {
    val __obj = js.Dynamic.literal(item = item, originalEvent = originalEvent)
  
    __obj.asInstanceOf[Anon_Item]
  }
}

