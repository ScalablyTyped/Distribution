package typings.qhistory.mod.historyAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationDescriptorObject extends js.Object {
  var query: js.UndefOr[js.Object] = js.undefined
}

object LocationDescriptorObject {
  @scala.inline
  def apply(query: js.Object = null): LocationDescriptorObject = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDescriptorObject]
  }
}

