package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTrust
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var assetCode: java.lang.String
  var authorize: js.UndefOr[scala.Boolean] = js.undefined
  var trustor: java.lang.String
}

object AllowTrust {
  @scala.inline
  def apply(
    assetCode: java.lang.String,
    trustor: java.lang.String,
    authorize: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): AllowTrust = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assetCode")(assetCode)
    __obj.updateDynamic("trustor")(trustor)
    if (!js.isUndefined(authorize)) __obj.updateDynamic("authorize")(authorize)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AllowTrust]
  }
}

