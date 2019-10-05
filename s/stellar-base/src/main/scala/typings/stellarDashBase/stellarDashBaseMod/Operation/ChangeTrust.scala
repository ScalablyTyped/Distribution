package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.stellarDashBase.stellarDashBaseMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTrust
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.ChangeTrust] {
  var limit: String
  var line: Asset
}

object ChangeTrust {
  @scala.inline
  def apply(
    limit: String,
    line: Asset,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.ChangeTrust,
    source: String = null
  ): ChangeTrust = {
    val __obj = js.Dynamic.literal(limit = limit, line = line)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ChangeTrust]
  }
}

@JSImport("stellar-base", "Operation.changeTrust")
@js.native
object changeTrust extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ChangeTrust): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[ChangeTrust] = js.native
}

