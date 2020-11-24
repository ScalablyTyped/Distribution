package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`10`
import typings.stellarBase.stellarBaseNumbers.`11`
import typings.stellarBase.stellarBaseNumbers.`12`
import typings.stellarBase.stellarBaseNumbers.`13`
import typings.stellarBase.stellarBaseNumbers.`14`
import typings.stellarBase.stellarBaseNumbers.`15`
import typings.stellarBase.stellarBaseNumbers.`16`
import typings.stellarBase.stellarBaseNumbers.`17`
import typings.stellarBase.stellarBaseNumbers.`18`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseNumbers.`5`
import typings.stellarBase.stellarBaseNumbers.`6`
import typings.stellarBase.stellarBaseNumbers.`7`
import typings.stellarBase.stellarBaseNumbers.`8`
import typings.stellarBase.stellarBaseNumbers.`9`
import typings.stellarBase.stellarBaseStrings.accountMerge
import typings.stellarBase.stellarBaseStrings.allowTrust
import typings.stellarBase.stellarBaseStrings.beginSponsoringFutureReserves
import typings.stellarBase.stellarBaseStrings.bumpSequence
import typings.stellarBase.stellarBaseStrings.changeTrust
import typings.stellarBase.stellarBaseStrings.claimClaimableBalance
import typings.stellarBase.stellarBaseStrings.createAccount
import typings.stellarBase.stellarBaseStrings.createClaimableBalance
import typings.stellarBase.stellarBaseStrings.createPassiveSellOffer
import typings.stellarBase.stellarBaseStrings.endSponsoringFutureReserves
import typings.stellarBase.stellarBaseStrings.inflation
import typings.stellarBase.stellarBaseStrings.manageBuyOffer
import typings.stellarBase.stellarBaseStrings.manageData
import typings.stellarBase.stellarBaseStrings.manageSellOffer
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceive
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictSend
import typings.stellarBase.stellarBaseStrings.payment
import typings.stellarBase.stellarBaseStrings.revokeSponsorship
import typings.stellarBase.stellarBaseStrings.setOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationType extends js.Object {
  
  val name: createAccount | payment | pathPaymentStrictReceive | manageSellOffer | createPassiveSellOffer | setOptions | changeTrust | allowTrust | accountMerge | inflation | manageData | bumpSequence | manageBuyOffer | pathPaymentStrictSend | createClaimableBalance | claimClaimableBalance | beginSponsoringFutureReserves | endSponsoringFutureReserves | revokeSponsorship = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` = js.native
}
object OperationType {
  
  @scala.inline
  def apply(
    name: createAccount | payment | pathPaymentStrictReceive | manageSellOffer | createPassiveSellOffer | setOptions | changeTrust | allowTrust | accountMerge | inflation | manageData | bumpSequence | manageBuyOffer | pathPaymentStrictSend | createClaimableBalance | claimClaimableBalance | beginSponsoringFutureReserves | endSponsoringFutureReserves | revokeSponsorship,
    value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18`
  ): OperationType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationType]
  }
  
  @scala.inline
  implicit class OperationTypeOps[Self <: OperationType] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: createAccount | payment | pathPaymentStrictReceive | manageSellOffer | createPassiveSellOffer | setOptions | changeTrust | allowTrust | accountMerge | inflation | manageData | bumpSequence | manageBuyOffer | pathPaymentStrictSend | createClaimableBalance | claimClaimableBalance | beginSponsoringFutureReserves | endSponsoringFutureReserves | revokeSponsorship
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18`
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
