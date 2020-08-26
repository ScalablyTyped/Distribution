package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBlockGetByNumRequest extends js.Object {
  /** ClientBlockGetByNumRequest blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}

object IClientBlockGetByNumRequest {
  @scala.inline
  def apply(): IClientBlockGetByNumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByNumRequest]
  }
  @scala.inline
  implicit class IClientBlockGetByNumRequestOps[Self <: IClientBlockGetByNumRequest] (val x: Self) extends AnyVal {
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
    def setBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("blockNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockNum: Self = this.set("blockNum", js.undefined)
    @scala.inline
    def setBlockNumNull: Self = this.set("blockNum", null)
  }
  
}

