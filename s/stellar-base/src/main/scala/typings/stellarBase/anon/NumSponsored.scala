package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV2Ext
import typings.stellarBase.xdrMod.xdr.SponsorshipDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumSponsored extends StObject {
  
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
  implicit class NumSponsoredMutableBuilder[Self <: NumSponsored] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: AccountEntryExtensionV2Ext): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSponsored(value: Double): Self = StObject.set(x, "numSponsored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSponsoring(value: Double): Self = StObject.set(x, "numSponsoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerSponsoringIDs(value: js.Array[SponsorshipDescriptor]): Self = StObject.set(x, "signerSponsoringIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerSponsoringIDsVarargs(value: SponsorshipDescriptor*): Self = StObject.set(x, "signerSponsoringIDs", js.Array(value :_*))
  }
}
