package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimableBalanceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BalanceId extends StObject {
  
  var balanceId: ClaimableBalanceId = js.native
}
object BalanceId {
  
  @scala.inline
  def apply(balanceId: ClaimableBalanceId): BalanceId = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalanceId]
  }
  
  @scala.inline
  implicit class BalanceIdMutableBuilder[Self <: BalanceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalanceId(value: ClaimableBalanceId): Self = StObject.set(x, "balanceId", value.asInstanceOf[js.Any])
  }
}
