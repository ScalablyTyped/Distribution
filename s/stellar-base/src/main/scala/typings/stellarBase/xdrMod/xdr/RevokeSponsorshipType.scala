package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.revokeSponsorshipLedgerEntry
import typings.stellarBase.stellarBaseStrings.revokeSponsorshipSigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSponsorshipType extends js.Object {
  
  val name: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner = js.native
  
  val value: `0` | `1` = js.native
}
object RevokeSponsorshipType {
  
  @scala.inline
  def apply(name: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner, value: `0` | `1`): RevokeSponsorshipType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSponsorshipType]
  }
  
  @scala.inline
  implicit class RevokeSponsorshipTypeOps[Self <: RevokeSponsorshipType] (val x: Self) extends AnyVal {
    
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
    def setName(value: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
