package typings.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  insert :any | undefined,   delete :number | undefined,   retain :number | undefined} & quill.quill.OptionalAttributes */
@js.native
trait DeltaOperation extends js.Object {
  var attributes: js.UndefOr[StringMap] = js.native
  var delete: js.UndefOr[Double] = js.native
  var insert: js.UndefOr[js.Any] = js.native
  var retain: js.UndefOr[Double] = js.native
}

object DeltaOperation {
  @scala.inline
  def apply(): DeltaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeltaOperation]
  }
  @scala.inline
  implicit class DeltaOperationOps[Self <: DeltaOperation] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setDelete(value: Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setInsert(value: js.Any): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setRetain(value: Double): Self = this.set("retain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
  
}

