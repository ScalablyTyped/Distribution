package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlockHeader extends js.Object {
  /** BlockHeader batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** BlockHeader blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.undefined
  /** BlockHeader consensus */
  var consensus: js.UndefOr[Uint8Array | Null] = js.undefined
  /** BlockHeader previousBlockId */
  var previousBlockId: js.UndefOr[String | Null] = js.undefined
  /** BlockHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.undefined
  /** BlockHeader stateRootHash */
  var stateRootHash: js.UndefOr[String | Null] = js.undefined
}

object IBlockHeader {
  @scala.inline
  def apply(
    batchIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    blockNum: js.UndefOr[
      Null | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ] = js.undefined,
    consensus: js.UndefOr[Null | Uint8Array] = js.undefined,
    previousBlockId: js.UndefOr[Null | String] = js.undefined,
    signerPublicKey: js.UndefOr[Null | String] = js.undefined,
    stateRootHash: js.UndefOr[Null | String] = js.undefined
  ): IBlockHeader = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchIds)) __obj.updateDynamic("batchIds")(batchIds.asInstanceOf[js.Any])
    if (!js.isUndefined(blockNum)) __obj.updateDynamic("blockNum")(blockNum.asInstanceOf[js.Any])
    if (!js.isUndefined(consensus)) __obj.updateDynamic("consensus")(consensus.asInstanceOf[js.Any])
    if (!js.isUndefined(previousBlockId)) __obj.updateDynamic("previousBlockId")(previousBlockId.asInstanceOf[js.Any])
    if (!js.isUndefined(signerPublicKey)) __obj.updateDynamic("signerPublicKey")(signerPublicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(stateRootHash)) __obj.updateDynamic("stateRootHash")(stateRootHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockHeader]
  }
}

