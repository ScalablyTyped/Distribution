package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseStrings.ledgerEntryCreated
import typings.stellarBase.stellarBaseStrings.ledgerEntryRemoved
import typings.stellarBase.stellarBaseStrings.ledgerEntryState
import typings.stellarBase.stellarBaseStrings.ledgerEntryUpdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerEntryChangeType extends js.Object {
  
  val name: ledgerEntryCreated | ledgerEntryUpdated | ledgerEntryRemoved | ledgerEntryState = js.native
  
  val value: `0` | `1` | `2` | `3` = js.native
}
object LedgerEntryChangeType {
  
  @scala.inline
  def apply(
    name: ledgerEntryCreated | ledgerEntryUpdated | ledgerEntryRemoved | ledgerEntryState,
    value: `0` | `1` | `2` | `3`
  ): LedgerEntryChangeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerEntryChangeType]
  }
  
  @scala.inline
  implicit class LedgerEntryChangeTypeOps[Self <: LedgerEntryChangeType] (val x: Self) extends AnyVal {
    
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
    def setName(value: ledgerEntryCreated | ledgerEntryUpdated | ledgerEntryRemoved | ledgerEntryState): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
