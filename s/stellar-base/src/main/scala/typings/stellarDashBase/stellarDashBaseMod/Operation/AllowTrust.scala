package typings.stellarDashBase.stellarDashBaseMod.Operation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTrust
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.AllowTrust] {
  var assetCode: String
  var authorize: js.UndefOr[Boolean] = js.undefined
  var trustor: String
}

object AllowTrust {
  @scala.inline
  def apply(
    assetCode: String,
    trustor: String,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.AllowTrust,
    authorize: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): AllowTrust = {
    val __obj = js.Dynamic.literal(assetCode = assetCode, trustor = trustor)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(authorize)) __obj.updateDynamic("authorize")(authorize)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AllowTrust]
  }
}

@JSImport("stellar-base", "Operation.allowTrust")
@js.native
object allowTrust extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.AllowTrust): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[AllowTrust] = js.native
}

