package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV2Ext
import typings.stellarBase.xdrMod.xdr.SponsorshipDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumSponsored extends js.Object {
  
  var ext: AccountEntryExtensionV2Ext = js.native
  
  var numSponsored: Double = js.native
  
  var numSponsoring: Double = js.native
  
  var signerSponsoringIDs: js.Array[SponsorshipDescriptor] = js.native
}
object NumSponsored {
  
  @scala.inline
  def apply(
    ext: AccountEntryExtensionV2Ext,
    numSponsored: Double,
    numSponsoring: Double,
    signerSponsoringIDs: js.Array[SponsorshipDescriptor]
  ): NumSponsored = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], numSponsored = numSponsored.asInstanceOf[js.Any], numSponsoring = numSponsoring.asInstanceOf[js.Any], signerSponsoringIDs = signerSponsoringIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumSponsored]
  }
  
  @scala.inline
  implicit class NumSponsoredOps[Self <: NumSponsored] (val x: Self) extends AnyVal {
    
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
    def setExt(value: AccountEntryExtensionV2Ext): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSponsored(value: Double): Self = this.set("numSponsored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSponsoring(value: Double): Self = this.set("numSponsoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerSponsoringIDsVarargs(value: SponsorshipDescriptor*): Self = this.set("signerSponsoringIDs", js.Array(value :_*))
    
    @scala.inline
    def setSignerSponsoringIDs(value: js.Array[SponsorshipDescriptor]): Self = this.set("signerSponsoringIDs", value.asInstanceOf[js.Any])
  }
}
