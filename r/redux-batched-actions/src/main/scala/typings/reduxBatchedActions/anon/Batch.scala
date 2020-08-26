package typings.reduxBatchedActions.anon

import typings.reduxBatchedActions.reduxBatchedActionsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch extends js.Object {
  var batch: `true` = js.native
}

object Batch {
  @scala.inline
  def apply(batch: `true`): Batch = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  @scala.inline
  implicit class BatchOps[Self <: Batch] (val x: Self) extends AnyVal {
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
    def setBatch(value: `true`): Self = this.set("batch", value.asInstanceOf[js.Any])
  }
  
}

