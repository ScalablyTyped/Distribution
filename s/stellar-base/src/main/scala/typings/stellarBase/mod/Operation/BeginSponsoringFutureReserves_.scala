package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.BeginSponsoringFutureReserves
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReserves_
  extends BaseOperation[BeginSponsoringFutureReserves]
     with _Operation {
  
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
  implicit class BeginSponsoringFutureReserves_MutableBuilder[Self <: BeginSponsoringFutureReserves_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSponsoredId(value: String): Self = StObject.set(x, "sponsoredId", value.asInstanceOf[js.Any])
  }
}
