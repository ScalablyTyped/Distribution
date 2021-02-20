package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsoredId extends StObject {
  
  var sponsoredId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object SponsoredId {
  
  @scala.inline
  def apply(sponsoredId: typings.stellarBase.xdrMod.xdr.AccountId): SponsoredId = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SponsoredId]
  }
  
  @scala.inline
  implicit class SponsoredIdMutableBuilder[Self <: SponsoredId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSponsoredId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "sponsoredId", value.asInstanceOf[js.Any])
  }
}
