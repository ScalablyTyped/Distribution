package typings.stellarBase.mod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReserves extends BaseOptions {
  
  var sponsoredId: String = js.native
}
object BeginSponsoringFutureReserves {
  
  @scala.inline
  def apply(sponsoredId: String): BeginSponsoringFutureReserves = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginSponsoringFutureReserves]
  }
  
  @scala.inline
  implicit class BeginSponsoringFutureReservesOps[Self <: BeginSponsoringFutureReserves] (val x: Self) extends AnyVal {
    
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
    def setSponsoredId(value: String): Self = this.set("sponsoredId", value.asInstanceOf[js.Any])
  }
}
