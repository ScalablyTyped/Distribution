package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePassiveOffer
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var amount: java.lang.String
  var buying: stellarDashBaseLib.stellarDashBaseMod.Asset
  var price: scala.Double | java.lang.String | js.Object
  var selling: stellarDashBaseLib.stellarDashBaseMod.Asset
}

object CreatePassiveOffer {
  @scala.inline
  def apply(
    amount: java.lang.String,
    buying: stellarDashBaseLib.stellarDashBaseMod.Asset,
    price: scala.Double | java.lang.String | js.Object,
    selling: stellarDashBaseLib.stellarDashBaseMod.Asset,
    source: java.lang.String = null
  ): CreatePassiveOffer = {
    val __obj = js.Dynamic.literal(amount = amount, buying = buying, price = price.asInstanceOf[js.Any], selling = selling)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreatePassiveOffer]
  }
}

