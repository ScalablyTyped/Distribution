package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext
import typings.stellarBase.xdrMod.xdr.SponsorshipDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsoringId extends StObject {
  
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
  implicit class SponsoringIdMutableBuilder[Self <: SponsoringId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: LedgerEntryExtensionV1Ext): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsoringId(value: SponsorshipDescriptor): Self = StObject.set(x, "sponsoringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsoringIdUndefined: Self = StObject.set(x, "sponsoringId", js.undefined)
  }
}
