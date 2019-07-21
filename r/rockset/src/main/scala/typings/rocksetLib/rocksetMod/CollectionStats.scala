package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionStats extends js.Object {
  // number of documents in the collection
  var doc_count: js.UndefOr[scala.Double] = js.undefined
  // number between 0 and 1 that indicates progress of collection creation
  var fill_progress: js.UndefOr[scala.Double] = js.undefined
  // milliseconds since Unix epoch Jan 1, 1970
  var last_queried_ms: js.UndefOr[scala.Double] = js.undefined
  // milliseconds since Unix epoch Jan 1, 1970
  var last_updated_ms: js.UndefOr[scala.Double] = js.undefined
  // number of documents purged from the collection
  var purged_doc_count: js.UndefOr[scala.Double] = js.undefined
  // total collection size in bytes purged
  var purged_doc_size: js.UndefOr[scala.Double] = js.undefined
  // total collection size in bytes
  var total_size: js.UndefOr[scala.Double] = js.undefined
}

object CollectionStats {
  @scala.inline
  def apply(
    doc_count: scala.Int | scala.Double = null,
    fill_progress: scala.Int | scala.Double = null,
    last_queried_ms: scala.Int | scala.Double = null,
    last_updated_ms: scala.Int | scala.Double = null,
    purged_doc_count: scala.Int | scala.Double = null,
    purged_doc_size: scala.Int | scala.Double = null,
    total_size: scala.Int | scala.Double = null
  ): CollectionStats = {
    val __obj = js.Dynamic.literal()
    if (doc_count != null) __obj.updateDynamic("doc_count")(doc_count.asInstanceOf[js.Any])
    if (fill_progress != null) __obj.updateDynamic("fill_progress")(fill_progress.asInstanceOf[js.Any])
    if (last_queried_ms != null) __obj.updateDynamic("last_queried_ms")(last_queried_ms.asInstanceOf[js.Any])
    if (last_updated_ms != null) __obj.updateDynamic("last_updated_ms")(last_updated_ms.asInstanceOf[js.Any])
    if (purged_doc_count != null) __obj.updateDynamic("purged_doc_count")(purged_doc_count.asInstanceOf[js.Any])
    if (purged_doc_size != null) __obj.updateDynamic("purged_doc_size")(purged_doc_size.asInstanceOf[js.Any])
    if (total_size != null) __obj.updateDynamic("total_size")(total_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionStats]
  }
}

