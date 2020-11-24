package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.endSponsoringFutureReservesNotSponsored
import typings.stellarBase.stellarBaseStrings.endSponsoringFutureReservesSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndSponsoringFutureReservesResultCode extends js.Object {
  
  val name: endSponsoringFutureReservesSuccess | endSponsoringFutureReservesNotSponsored = js.native
  
  val value: `0` | `-1` = js.native
}
object EndSponsoringFutureReservesResultCode {
  
  @scala.inline
  def apply(
    name: endSponsoringFutureReservesSuccess | endSponsoringFutureReservesNotSponsored,
    value: `0` | `-1`
  ): EndSponsoringFutureReservesResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndSponsoringFutureReservesResultCode]
  }
  
  @scala.inline
  implicit class EndSponsoringFutureReservesResultCodeOps[Self <: EndSponsoringFutureReservesResultCode] (val x: Self) extends AnyVal {
    
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
    def setName(value: endSponsoringFutureReservesSuccess | endSponsoringFutureReservesNotSponsored): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
