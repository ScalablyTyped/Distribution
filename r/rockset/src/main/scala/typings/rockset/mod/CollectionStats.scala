package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionStats extends js.Object {
  // number of documents in the collection
  var doc_count: js.UndefOr[Double] = js.undefined
  // number between 0 and 1 that indicates progress of collection creation
  var fill_progress: js.UndefOr[Double] = js.undefined
  // milliseconds since Unix epoch Jan 1, 1970
  var last_queried_ms: js.UndefOr[Double] = js.undefined
  // milliseconds since Unix epoch Jan 1, 1970
  var last_updated_ms: js.UndefOr[Double] = js.undefined
  // number of documents purged from the collection
  var purged_doc_count: js.UndefOr[Double] = js.undefined
  // total collection size in bytes purged
  var purged_doc_size: js.UndefOr[Double] = js.undefined
  // total collection size in bytes
  var total_size: js.UndefOr[Double] = js.undefined
}

object CollectionStats {
  @scala.inline
  def apply(
    doc_count: js.UndefOr[Double] = js.undefined,
    fill_progress: js.UndefOr[Double] = js.undefined,
    last_queried_ms: js.UndefOr[Double] = js.undefined,
    last_updated_ms: js.UndefOr[Double] = js.undefined,
    purged_doc_count: js.UndefOr[Double] = js.undefined,
    purged_doc_size: js.UndefOr[Double] = js.undefined,
    total_size: js.UndefOr[Double] = js.undefined
  ): CollectionStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doc_count)) __obj.updateDynamic("doc_count")(doc_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill_progress)) __obj.updateDynamic("fill_progress")(fill_progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(last_queried_ms)) __obj.updateDynamic("last_queried_ms")(last_queried_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(last_updated_ms)) __obj.updateDynamic("last_updated_ms")(last_updated_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(purged_doc_count)) __obj.updateDynamic("purged_doc_count")(purged_doc_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(purged_doc_size)) __obj.updateDynamic("purged_doc_size")(purged_doc_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_size)) __obj.updateDynamic("total_size")(total_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionStats]
  }
}

