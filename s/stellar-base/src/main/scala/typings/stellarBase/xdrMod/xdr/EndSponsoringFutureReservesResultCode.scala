package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.endSponsoringFutureReservesNotSponsored
import typings.stellarBase.stellarBaseStrings.endSponsoringFutureReservesSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndSponsoringFutureReservesResultCode extends StObject {
  
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
  implicit class EndSponsoringFutureReservesResultCodeMutableBuilder[Self <: EndSponsoringFutureReservesResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: endSponsoringFutureReservesSuccess | endSponsoringFutureReservesNotSponsored): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
