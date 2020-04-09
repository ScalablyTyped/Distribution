package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusBlock extends js.Object {
  /** ConsensusBlock blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusBlock blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.undefined
  /** ConsensusBlock payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusBlock previousId */
  var previousId: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusBlock signerId */
  var signerId: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusBlock summary */
  var summary: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusBlock {
  @scala.inline
  def apply(
    blockId: Uint8Array = null,
    blockNum: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = null,
    payload: Uint8Array = null,
    previousId: Uint8Array = null,
    signerId: Uint8Array = null,
    summary: Uint8Array = null
  ): IConsensusBlock = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (blockNum != null) __obj.updateDynamic("blockNum")(blockNum.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (previousId != null) __obj.updateDynamic("previousId")(previousId.asInstanceOf[js.Any])
    if (signerId != null) __obj.updateDynamic("signerId")(signerId.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBlock]
  }
}

