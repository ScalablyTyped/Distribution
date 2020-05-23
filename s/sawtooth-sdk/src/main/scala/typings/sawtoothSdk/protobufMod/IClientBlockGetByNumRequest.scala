package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockGetByNumRequest extends js.Object {
  /** ClientBlockGetByNumRequest blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.undefined
}

object IClientBlockGetByNumRequest {
  @scala.inline
  def apply(
    blockNum: js.UndefOr[
      Null | Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ] = js.undefined
  ): IClientBlockGetByNumRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockNum)) __obj.updateDynamic("blockNum")(blockNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockGetByNumRequest]
  }
}

