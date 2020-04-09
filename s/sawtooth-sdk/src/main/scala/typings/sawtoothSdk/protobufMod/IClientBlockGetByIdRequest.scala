package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockGetByIdRequest extends js.Object {
  /** ClientBlockGetByIdRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.undefined
}

object IClientBlockGetByIdRequest {
  @scala.inline
  def apply(blockId: String = null): IClientBlockGetByIdRequest = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockGetByIdRequest]
  }
}

