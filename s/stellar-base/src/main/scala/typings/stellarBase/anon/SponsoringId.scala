package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext
import typings.stellarBase.xdrMod.xdr.SponsorshipDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsoringId extends js.Object {
  
  var ext: LedgerEntryExtensionV1Ext = js.native
  
  var sponsoringId: SponsorshipDescriptor = js.native
}
object SponsoringId {
  
  @scala.inline
  def apply(ext: LedgerEntryExtensionV1Ext): SponsoringId = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SponsoringId]
  }
  
  @scala.inline
  implicit class SponsoringIdOps[Self <: SponsoringId] (val x: Self) extends AnyVal {
    
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
    def setExt(value: LedgerEntryExtensionV1Ext): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsoringId(value: SponsorshipDescriptor): Self = this.set("sponsoringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSponsoringId: Self = this.set("sponsoringId", js.undefined)
  }
}
