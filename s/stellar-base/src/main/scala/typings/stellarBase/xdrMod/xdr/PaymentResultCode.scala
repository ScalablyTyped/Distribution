package typings.stellarBase.xdrMod.xdr

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
import typings.stellarBase.stellarBaseStrings.paymentLineFull
import typings.stellarBase.stellarBaseStrings.paymentMalformed
import typings.stellarBase.stellarBaseStrings.paymentNoDestination
import typings.stellarBase.stellarBaseStrings.paymentNoIssuer
import typings.stellarBase.stellarBaseStrings.paymentNoTrust
import typings.stellarBase.stellarBaseStrings.paymentNotAuthorized
import typings.stellarBase.stellarBaseStrings.paymentSrcNoTrust
import typings.stellarBase.stellarBaseStrings.paymentSrcNotAuthorized
import typings.stellarBase.stellarBaseStrings.paymentSuccess
import typings.stellarBase.stellarBaseStrings.paymentUnderfunded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentResultCode extends js.Object {
  
  val name: paymentSuccess | paymentMalformed | paymentUnderfunded | paymentSrcNoTrust | paymentSrcNotAuthorized | paymentNoDestination | paymentNoTrust | paymentNotAuthorized | paymentLineFull | paymentNoIssuer = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` = js.native
}
object PaymentResultCode {
  
  @scala.inline
  def apply(
    name: paymentSuccess | paymentMalformed | paymentUnderfunded | paymentSrcNoTrust | paymentSrcNotAuthorized | paymentNoDestination | paymentNoTrust | paymentNotAuthorized | paymentLineFull | paymentNoIssuer,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`
  ): PaymentResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResultCode]
  }
  
  @scala.inline
  implicit class PaymentResultCodeOps[Self <: PaymentResultCode] (val x: Self) extends AnyVal {
    
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
      value: paymentSuccess | paymentMalformed | paymentUnderfunded | paymentSrcNoTrust | paymentSrcNotAuthorized | paymentNoDestination | paymentNoTrust | paymentNotAuthorized | paymentLineFull | paymentNoIssuer
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
