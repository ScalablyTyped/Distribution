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
    blockId: js.UndefOr[Null | Uint8Array] = js.undefined,
    blockNum: js.UndefOr[
      Null | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ] = js.undefined,
    payload: js.UndefOr[Null | Uint8Array] = js.undefined,
    previousId: js.UndefOr[Null | Uint8Array] = js.undefined,
    signerId: js.UndefOr[Null | Uint8Array] = js.undefined,
    summary: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IConsensusBlock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (!js.isUndefined(blockNum)) __obj.updateDynamic("blockNum")(blockNum.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(previousId)) __obj.updateDynamic("previousId")(previousId.asInstanceOf[js.Any])
    if (!js.isUndefined(signerId)) __obj.updateDynamic("signerId")(signerId.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBlock]
  }
}

