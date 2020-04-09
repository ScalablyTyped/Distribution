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
    batchIds: js.Array[String] = null,
    blockNum: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = null,
    consensus: Uint8Array = null,
    previousBlockId: String = null,
    signerPublicKey: String = null,
    stateRootHash: String = null
  ): IBlockHeader = {
    val __obj = js.Dynamic.literal()
    if (batchIds != null) __obj.updateDynamic("batchIds")(batchIds.asInstanceOf[js.Any])
    if (blockNum != null) __obj.updateDynamic("blockNum")(blockNum.asInstanceOf[js.Any])
    if (consensus != null) __obj.updateDynamic("consensus")(consensus.asInstanceOf[js.Any])
    if (previousBlockId != null) __obj.updateDynamic("previousBlockId")(previousBlockId.asInstanceOf[js.Any])
    if (signerPublicKey != null) __obj.updateDynamic("signerPublicKey")(signerPublicKey.asInstanceOf[js.Any])
    if (stateRootHash != null) __obj.updateDynamic("stateRootHash")(stateRootHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockHeader]
  }
}

