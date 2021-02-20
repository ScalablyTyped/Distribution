package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReserves
  extends BaseOptions
     with _OperationOptions {
  
  var sponsoredId: String = js.native
}
object BeginSponsoringFutureReserves {
  
  @scala.inline
  def apply(sponsoredId: String): BeginSponsoringFutureReserves = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginSponsoringFutureReserves]
  }
  
  @scala.inline
  implicit class BeginSponsoringFutureReservesMutableBuilder[Self <: BeginSponsoringFutureReserves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSponsoredId(value: String): Self = StObject.set(x, "sponsoredId", value.asInstanceOf[js.Any])
  }
}
