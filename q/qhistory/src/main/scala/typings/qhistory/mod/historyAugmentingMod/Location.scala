package typings.qhistory.mod.historyAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  // actually a complicated nested object/array system, but giving it a type
  // makes _actually_ using it (or even casting to a known structure) much harder.
  var query: js.Any
}

object Location {
  @scala.inline
  def apply(query: js.Any): Location = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

