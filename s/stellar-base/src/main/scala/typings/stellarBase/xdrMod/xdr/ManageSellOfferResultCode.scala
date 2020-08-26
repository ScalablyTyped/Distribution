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
import typings.stellarBase.stellarBaseStrings.manageSellOfferBuyNoIssuer
import typings.stellarBase.stellarBaseStrings.manageSellOfferBuyNoTrust
import typings.stellarBase.stellarBaseStrings.manageSellOfferBuyNotAuthorized
import typings.stellarBase.stellarBaseStrings.manageSellOfferCrossSelf
import typings.stellarBase.stellarBaseStrings.manageSellOfferLineFull
import typings.stellarBase.stellarBaseStrings.manageSellOfferLowReserve
import typings.stellarBase.stellarBaseStrings.manageSellOfferMalformed
import typings.stellarBase.stellarBaseStrings.manageSellOfferNotFound
import typings.stellarBase.stellarBaseStrings.manageSellOfferSellNoIssuer
import typings.stellarBase.stellarBaseStrings.manageSellOfferSellNoTrust
import typings.stellarBase.stellarBaseStrings.manageSellOfferSellNotAuthorized
import typings.stellarBase.stellarBaseStrings.manageSellOfferSuccess
import typings.stellarBase.stellarBaseStrings.manageSellOfferUnderfunded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageSellOfferResultCode extends js.Object {
  val name: manageSellOfferSuccess | manageSellOfferMalformed | manageSellOfferSellNoTrust | manageSellOfferBuyNoTrust | manageSellOfferSellNotAuthorized | manageSellOfferBuyNotAuthorized | manageSellOfferLineFull | manageSellOfferUnderfunded | manageSellOfferCrossSelf | manageSellOfferSellNoIssuer | manageSellOfferBuyNoIssuer | manageSellOfferNotFound | manageSellOfferLowReserve = js.native
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12` = js.native
}

object ManageSellOfferResultCode {
  @scala.inline
  def apply(
    name: manageSellOfferSuccess | manageSellOfferMalformed | manageSellOfferSellNoTrust | manageSellOfferBuyNoTrust | manageSellOfferSellNotAuthorized | manageSellOfferBuyNotAuthorized | manageSellOfferLineFull | manageSellOfferUnderfunded | manageSellOfferCrossSelf | manageSellOfferSellNoIssuer | manageSellOfferBuyNoIssuer | manageSellOfferNotFound | manageSellOfferLowReserve,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`
  ): ManageSellOfferResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageSellOfferResultCode]
  }
  @scala.inline
  implicit class ManageSellOfferResultCodeOps[Self <: ManageSellOfferResultCode] (val x: Self) extends AnyVal {
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
      value: manageSellOfferSuccess | manageSellOfferMalformed | manageSellOfferSellNoTrust | manageSellOfferBuyNoTrust | manageSellOfferSellNotAuthorized | manageSellOfferBuyNotAuthorized | manageSellOfferLineFull | manageSellOfferUnderfunded | manageSellOfferCrossSelf | manageSellOfferSellNoIssuer | manageSellOfferBuyNoIssuer | manageSellOfferNotFound | manageSellOfferLowReserve
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` | `-6` | `-7` | `-8` | `-9` | `-10` | `-11` | `-12`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

