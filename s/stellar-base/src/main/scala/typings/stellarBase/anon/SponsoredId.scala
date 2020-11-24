package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsoredId extends js.Object {
  
  var sponsoredId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object SponsoredId {
  
  @scala.inline
  def apply(sponsoredId: typings.stellarBase.xdrMod.xdr.AccountId): SponsoredId = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SponsoredId]
  }
  
  @scala.inline
  implicit class SponsoredIdOps[Self <: SponsoredId] (val x: Self) extends AnyVal {
    
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
    def setSponsoredId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("sponsoredId", value.asInstanceOf[js.Any])
  }
}
