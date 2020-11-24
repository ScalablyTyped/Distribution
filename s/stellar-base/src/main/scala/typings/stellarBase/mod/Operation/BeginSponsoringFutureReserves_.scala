package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.BeginSponsoringFutureReserves
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReserves_ extends BaseOperation[BeginSponsoringFutureReserves] {
  
  var sponsoredId: String = js.native
}
object BeginSponsoringFutureReserves_ {
  
  @scala.inline
  def apply(sponsoredId: String, `type`: BeginSponsoringFutureReserves): BeginSponsoringFutureReserves_ = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginSponsoringFutureReserves_]
  }
  
  @scala.inline
  implicit class BeginSponsoringFutureReserves_Ops[Self <: BeginSponsoringFutureReserves_] (val x: Self) extends AnyVal {
    
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
