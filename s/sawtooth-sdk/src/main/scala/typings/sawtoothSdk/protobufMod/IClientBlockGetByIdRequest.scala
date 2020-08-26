package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBlockGetByIdRequest extends js.Object {
  /** ClientBlockGetByIdRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.native
}

object IClientBlockGetByIdRequest {
  @scala.inline
  def apply(): IClientBlockGetByIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByIdRequest]
  }
  @scala.inline
  implicit class IClientBlockGetByIdRequestOps[Self <: IClientBlockGetByIdRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockId(value: String): Self = this.set("blockId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockId: Self = this.set("blockId", js.undefined)
    @scala.inline
    def setBlockIdNull: Self = this.set("blockId", null)
  }
  
}

