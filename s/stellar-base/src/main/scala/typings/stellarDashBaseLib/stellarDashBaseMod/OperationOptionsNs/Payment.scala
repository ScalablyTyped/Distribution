package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var amount: java.lang.String
  var asset: stellarDashBaseLib.stellarDashBaseMod.Asset
  var destination: java.lang.String
}

object Payment {
  @scala.inline
  def apply(
    amount: java.lang.String,
    asset: stellarDashBaseLib.stellarDashBaseMod.Asset,
    destination: java.lang.String,
    source: java.lang.String = null
  ): Payment = {
    val __obj = js.Dynamic.literal(amount = amount, asset = asset, destination = destination)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Payment]
  }
}

