package typings.rcTable.anon

import typings.rcTable.interfaceMod.ExpandableConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expandable[RecordType] extends js.Object {
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
}

object Expandable {
  @scala.inline
  def apply[RecordType](expandable: ExpandableConfig[RecordType] = null): Expandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (expandable != null) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expandable[RecordType]]
  }
}

