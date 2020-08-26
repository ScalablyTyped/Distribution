package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionStats extends js.Object {
  // number of documents in the collection
  var doc_count: js.UndefOr[Double] = js.native
  // number between 0 and 1 that indicates progress of collection creation
  var fill_progress: js.UndefOr[Double] = js.native
  // milliseconds since Unix epoch Jan 1, 1970
  var last_queried_ms: js.UndefOr[Double] = js.native
  // milliseconds since Unix epoch Jan 1, 1970
  var last_updated_ms: js.UndefOr[Double] = js.native
  // number of documents purged from the collection
  var purged_doc_count: js.UndefOr[Double] = js.native
  // total collection size in bytes purged
  var purged_doc_size: js.UndefOr[Double] = js.native
  // total collection size in bytes
  var total_size: js.UndefOr[Double] = js.native
}

object CollectionStats {
  @scala.inline
  def apply(): CollectionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionStats]
  }
  @scala.inline
  implicit class CollectionStatsOps[Self <: CollectionStats] (val x: Self) extends AnyVal {
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
    def setDoc_count(value: Double): Self = this.set("doc_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc_count: Self = this.set("doc_count", js.undefined)
    @scala.inline
    def setFill_progress(value: Double): Self = this.set("fill_progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill_progress: Self = this.set("fill_progress", js.undefined)
    @scala.inline
    def setLast_queried_ms(value: Double): Self = this.set("last_queried_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_queried_ms: Self = this.set("last_queried_ms", js.undefined)
    @scala.inline
    def setLast_updated_ms(value: Double): Self = this.set("last_updated_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_updated_ms: Self = this.set("last_updated_ms", js.undefined)
    @scala.inline
    def setPurged_doc_count(value: Double): Self = this.set("purged_doc_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurged_doc_count: Self = this.set("purged_doc_count", js.undefined)
    @scala.inline
    def setPurged_doc_size(value: Double): Self = this.set("purged_doc_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurged_doc_size: Self = this.set("purged_doc_size", js.undefined)
    @scala.inline
    def setTotal_size(value: Double): Self = this.set("total_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_size: Self = this.set("total_size", js.undefined)
  }
  
}

