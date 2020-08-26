package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changes extends js.Object {
  var changes: js.Array[LedgerEntryChange] = js.native
}

object Changes {
  @scala.inline
  def apply(changes: js.Array[LedgerEntryChange]): Changes = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
  @scala.inline
  implicit class ChangesOps[Self <: Changes] (val x: Self) extends AnyVal {
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
    def setChangesVarargs(value: LedgerEntryChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[LedgerEntryChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
  
}

