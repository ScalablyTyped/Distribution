package typings.rcTable

import typings.rcTable.interfaceMod.ExpandableConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpandable[RecordType] extends js.Object {
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
}

object AnonExpandable {
  @scala.inline
  def apply[RecordType](expandable: ExpandableConfig[RecordType] = null): AnonExpandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (expandable != null) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandable[RecordType]]
  }
}

