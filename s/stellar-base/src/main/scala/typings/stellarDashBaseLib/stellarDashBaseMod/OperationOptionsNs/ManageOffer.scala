package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stellarDashBaseLib.stellarDashBaseMod._OperationOptions because Already inherited */ trait ManageOffer extends CreatePassiveOffer {
  var offerId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ManageOffer {
  @scala.inline
  def apply(
    amount: java.lang.String,
    buying: stellarDashBaseLib.stellarDashBaseMod.Asset,
    price: scala.Double | java.lang.String | js.Object,
    selling: stellarDashBaseLib.stellarDashBaseMod.Asset,
    offerId: scala.Double | java.lang.String = null,
    source: java.lang.String = null
  ): ManageOffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("buying")(buying)
    __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    __obj.updateDynamic("selling")(selling)
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ManageOffer]
  }
}

