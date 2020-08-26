package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatchList extends js.Object {
  /** BatchList batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.native
}

object IBatchList {
  @scala.inline
  def apply(): IBatchList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchList]
  }
  @scala.inline
  implicit class IBatchListOps[Self <: IBatchList] (val x: Self) extends AnyVal {
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
    def setBatchesVarargs(value: IBatch*): Self = this.set("batches", js.Array(value :_*))
    @scala.inline
    def setBatches(value: js.Array[IBatch]): Self = this.set("batches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatches: Self = this.set("batches", js.undefined)
    @scala.inline
    def setBatchesNull: Self = this.set("batches", null)
  }
  
}

