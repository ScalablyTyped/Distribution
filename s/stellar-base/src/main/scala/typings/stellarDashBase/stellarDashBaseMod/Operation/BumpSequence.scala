package typings.stellarDashBase.stellarDashBaseMod.Operation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequence
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.BumpSequence] {
  var bumpTo: String
}

object BumpSequence {
  @scala.inline
  def apply(
    bumpTo: String,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.BumpSequence,
    source: String = null
  ): BumpSequence = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo)
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[BumpSequence]
  }
}

@JSImport("stellar-base", "Operation.bumpSequence")
@js.native
object bumpSequence extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.BumpSequence): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[BumpSequence] = js.native
}

