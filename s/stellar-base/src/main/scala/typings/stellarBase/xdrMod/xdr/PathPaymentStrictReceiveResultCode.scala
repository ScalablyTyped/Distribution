package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-10`
import typings.stellarBase.stellarBaseNumbers.`-11`
import typings.stellarBase.stellarBaseNumbers.`-12`
import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`-6`
import typings.stellarBase.stellarBaseNumbers.`-7`
import typings.stellarBase.stellarBaseNumbers.`-8`
import typings.stellarBase.stellarBaseNumbers.`-9`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveLineFull
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveMalformed
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNoDestination
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNoIssuer
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNoTrust
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveNotAuthorized
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveOfferCrossSelf
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveOverSendmax
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveSrcNoTrust
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveSrcNotAuthorized
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveSuccess
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveTooFewOffers
import typings.stellarBase.stellarBaseStrings.pathPaymentStrictReceiveUnderfunded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictReceiveResultCode extends js.Object {
  
  val name: pathPaymentStrictReceiveSuccess | pathPaymentStrictReceiveMalformed | pathPaymentStrictReceiveUnderfunded | pathPaymentStrictReceiveSrcNoTrust | pathPaymentStrictReceiveSrcNotAuthorized | pathPaymentStrictReceiveNoDestination | pathPaymentStrictReceiveNoTrust | pathPaymentStrictReceiveNotAuthorized | pathPaymentStrictReceiveLineFull | pathPaymentStrictReceiveNoIssuer | pathPaymentStrictReceiveTooFewOffers | pathPaymentStrictReceiveOfferCrossSelf | pathPaymentStrictReceiveOverSendmax = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}
object PathPaymentStrictReceiveResultCode {
  
  @scala.inline
  def apply(
    name: pathPaymentStrictReceiveSuccess | pathPaymentStrictReceiveMalformed | pathPaymentStrictReceiveUnderfunded | pathPaymentStrictReceiveSrcNoTrust | pathPaymentStrictReceiveSrcNotAuthorized | pathPaymentStrictReceiveNoDestination | pathPaymentStrictReceiveNoTrust | pathPaymentStrictReceiveNotAuthorized | pathPaymentStrictReceiveLineFull | pathPaymentStrictReceiveNoIssuer | pathPaymentStrictReceiveTooFewOffers | pathPaymentStrictReceiveOfferCrossSelf | pathPaymentStrictReceiveOverSendmax,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): PathPaymentStrictReceiveResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceiveResultCode]
  }
  
  @scala.inline
  implicit class PathPaymentStrictReceiveResultCodeOps[Self <: PathPaymentStrictReceiveResultCode] (val x: Self) extends AnyVal {
    
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
      value: pathPaymentStrictReceiveSuccess | pathPaymentStrictReceiveMalformed | pathPaymentStrictReceiveUnderfunded | pathPaymentStrictReceiveSrcNoTrust | pathPaymentStrictReceiveSrcNotAuthorized | pathPaymentStrictReceiveNoDestination | pathPaymentStrictReceiveNoTrust | pathPaymentStrictReceiveNotAuthorized | pathPaymentStrictReceiveLineFull | pathPaymentStrictReceiveNoIssuer | pathPaymentStrictReceiveTooFewOffers | pathPaymentStrictReceiveOfferCrossSelf | pathPaymentStrictReceiveOverSendmax
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
