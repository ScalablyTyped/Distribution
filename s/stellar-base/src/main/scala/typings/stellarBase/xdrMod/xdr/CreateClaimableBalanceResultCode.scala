package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.createClaimableBalanceLowReserve
import typings.stellarBase.stellarBaseStrings.createClaimableBalanceMalformed
import typings.stellarBase.stellarBaseStrings.createClaimableBalanceNoTrust
import typings.stellarBase.stellarBaseStrings.createClaimableBalanceNotAuthorized
import typings.stellarBase.stellarBaseStrings.createClaimableBalanceSuccess
import typings.stellarBase.stellarBaseStrings.createClaimableBalanceUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClaimableBalanceResultCode extends StObject {
  
  val name: createClaimableBalanceSuccess | createClaimableBalanceMalformed | createClaimableBalanceLowReserve | createClaimableBalanceNoTrust | createClaimableBalanceNotAuthorized | createClaimableBalanceUnderfunded = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}
object CreateClaimableBalanceResultCode {
  
  @scala.inline
  def apply(
    name: createClaimableBalanceSuccess | createClaimableBalanceMalformed | createClaimableBalanceLowReserve | createClaimableBalanceNoTrust | createClaimableBalanceNotAuthorized | createClaimableBalanceUnderfunded,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): CreateClaimableBalanceResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClaimableBalanceResultCode]
  }
  
  @scala.inline
  implicit class CreateClaimableBalanceResultCodeMutableBuilder[Self <: CreateClaimableBalanceResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: createClaimableBalanceSuccess | createClaimableBalanceMalformed | createClaimableBalanceLowReserve | createClaimableBalanceNoTrust | createClaimableBalanceNotAuthorized | createClaimableBalanceUnderfunded
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
