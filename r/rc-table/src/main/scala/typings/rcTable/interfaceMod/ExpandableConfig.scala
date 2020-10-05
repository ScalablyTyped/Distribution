package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableConfig[RecordType] extends LegacyExpandableProps[RecordType] {
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.native
}

object ExpandableConfig {
  @scala.inline
  def apply[RecordType](): ExpandableConfig[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandableConfig[RecordType]]
  }
  @scala.inline
  implicit class ExpandableConfigOps[Self <: ExpandableConfig[_], RecordType] (val x: Self with ExpandableConfig[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowExpandable(value: /* record */ RecordType => Boolean): Self = this.set("rowExpandable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowExpandable: Self = this.set("rowExpandable", js.undefined)
  }
  
}

