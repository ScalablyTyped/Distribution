package typings.rockset.rocksetMod

import typings.rockset.rocksetStrings.COMPLETED
import typings.rockset.rocksetStrings.ERROR
import typings.rockset.rocksetStrings.INITIALIZING
import typings.rockset.rocksetStrings.PROCESSING
import typings.rockset.rocksetStrings.WATCHING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  // ISO-8601 date when last error occurred
  var last_error_at: js.UndefOr[String] = js.undefined
  // last source item that errored
  var last_error_item: js.UndefOr[String] = js.undefined
  // reason for the last error
  var last_error_reason: js.UndefOr[String] = js.undefined
  // ISO-8601 date when source was last processed
  var last_processed_at: js.UndefOr[String] = js.undefined
  // last source item processed by ingester
  var last_processed_item: js.UndefOr[String] = js.undefined
  // state message
  var message: js.UndefOr[String] = js.undefined
  // ISO-8601 date when state was triggered
  var since: js.UndefOr[String] = js.undefined
  // Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
  var state: js.UndefOr[INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR] = js.undefined
  // Total items that errored
  var total_error_items: js.UndefOr[Double] = js.undefined
  // Total items processed of source
  var total_processed_items: js.UndefOr[Double] = js.undefined
}

object Status {
  @scala.inline
  def apply(
    last_error_at: String = null,
    last_error_item: String = null,
    last_error_reason: String = null,
    last_processed_at: String = null,
    last_processed_item: String = null,
    message: String = null,
    since: String = null,
    state: INITIALIZING | WATCHING | PROCESSING | COMPLETED | ERROR = null,
    total_error_items: Int | Double = null,
    total_processed_items: Int | Double = null
  ): Status = {
    val __obj = js.Dynamic.literal()
    if (last_error_at != null) __obj.updateDynamic("last_error_at")(last_error_at.asInstanceOf[js.Any])
    if (last_error_item != null) __obj.updateDynamic("last_error_item")(last_error_item.asInstanceOf[js.Any])
    if (last_error_reason != null) __obj.updateDynamic("last_error_reason")(last_error_reason.asInstanceOf[js.Any])
    if (last_processed_at != null) __obj.updateDynamic("last_processed_at")(last_processed_at.asInstanceOf[js.Any])
    if (last_processed_item != null) __obj.updateDynamic("last_processed_item")(last_processed_item.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (total_error_items != null) __obj.updateDynamic("total_error_items")(total_error_items.asInstanceOf[js.Any])
    if (total_processed_items != null) __obj.updateDynamic("total_processed_items")(total_processed_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

