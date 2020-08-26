package typings.rockset.mod

import typings.rockset.rocksetStrings.COMPLETED
import typings.rockset.rocksetStrings.ERROR
import typings.rockset.rocksetStrings.INITIALIZING
import typings.rockset.rocksetStrings.PROCESSING
import typings.rockset.rocksetStrings.WATCHING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  // ISO-8601 date when last error occurred
  var last_error_at: js.UndefOr[String] = js.native
  // last source item that errored
  var last_error_item: js.UndefOr[String] = js.native
  // reason for the last error
  var last_error_reason: js.UndefOr[String] = js.native
  // ISO-8601 date when source was last processed
  var last_processed_at: js.UndefOr[String] = js.native
  // last source item processed by ingester
  var last_processed_item: js.UndefOr[String] = js.native
  // state message
  var message: js.UndefOr[String] = js.native
  // ISO-8601 date when state was triggered
  var since: js.UndefOr[String] = js.native
  // Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
  var state: js.UndefOr[INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR] = js.native
  // Total items that errored
  var total_error_items: js.UndefOr[Double] = js.native
  // Total items processed of source
  var total_processed_items: js.UndefOr[Double] = js.native
}

object Status {
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
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
    def setLast_error_at(value: String): Self = this.set("last_error_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_error_at: Self = this.set("last_error_at", js.undefined)
    @scala.inline
    def setLast_error_item(value: String): Self = this.set("last_error_item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_error_item: Self = this.set("last_error_item", js.undefined)
    @scala.inline
    def setLast_error_reason(value: String): Self = this.set("last_error_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_error_reason: Self = this.set("last_error_reason", js.undefined)
    @scala.inline
    def setLast_processed_at(value: String): Self = this.set("last_processed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_processed_at: Self = this.set("last_processed_at", js.undefined)
    @scala.inline
    def setLast_processed_item(value: String): Self = this.set("last_processed_item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_processed_item: Self = this.set("last_processed_item", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setState(value: INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTotal_error_items(value: Double): Self = this.set("total_error_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_error_items: Self = this.set("total_error_items", js.undefined)
    @scala.inline
    def setTotal_processed_items(value: Double): Self = this.set("total_processed_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_processed_items: Self = this.set("total_processed_items", js.undefined)
  }
  
}

