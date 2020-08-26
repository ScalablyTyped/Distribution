package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusInitializeBlockRequest extends js.Object {
  /** ConsensusInitializeBlockRequest previousId */
  var previousId: js.UndefOr[Uint8Array | Null] = js.native
}

object IConsensusInitializeBlockRequest {
  @scala.inline
  def apply(): IConsensusInitializeBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusInitializeBlockRequest]
  }
  @scala.inline
  implicit class IConsensusInitializeBlockRequestOps[Self <: IConsensusInitializeBlockRequest] (val x: Self) extends AnyVal {
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
    def setPreviousId(value: Uint8Array): Self = this.set("previousId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousId: Self = this.set("previousId", js.undefined)
    @scala.inline
    def setPreviousIdNull: Self = this.set("previousId", null)
  }
  
}

