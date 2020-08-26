package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.LedgerUpgrade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upgrade extends js.Object {
  var changes: js.Array[LedgerEntryChange] = js.native
  var upgrade: LedgerUpgrade = js.native
}

object Upgrade {
  @scala.inline
  def apply(changes: js.Array[LedgerEntryChange], upgrade: LedgerUpgrade): Upgrade = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upgrade]
  }
  @scala.inline
  implicit class UpgradeOps[Self <: Upgrade] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setUpgrade(value: LedgerUpgrade): Self = this.set("upgrade", value.asInstanceOf[js.Any])
  }
  
}

