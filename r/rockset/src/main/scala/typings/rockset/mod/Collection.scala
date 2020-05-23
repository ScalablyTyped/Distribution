package typings.rockset.mod

import typings.rockset.rocksetStrings.CATCHINGUP
import typings.rockset.rocksetStrings.CREATED
import typings.rockset.rocksetStrings.DELETED
import typings.rockset.rocksetStrings.PAUSED
import typings.rockset.rocksetStrings.PAUSING
import typings.rockset.rocksetStrings.READY
import typings.rockset.rocksetStrings.RESUMING
import typings.rockset.rocksetStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  // email of user who created the collection
  var created_by: js.UndefOr[String] = js.undefined
  // text describing the collection
  var description: js.UndefOr[String] = js.undefined
  // list of mappings applied on all documents in a collection
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.undefined
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: js.UndefOr[String] = js.undefined
  // number of seconds after which data is purged based on event time
  var retention_secs: js.UndefOr[Double] = js.undefined
  // list of sources from which collection ingests
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  // metrics about the collection
  var stats: js.UndefOr[CollectionStats] = js.undefined
  // current status of collection, one of: CREATED, READY, DELETED
  var status: js.UndefOr[CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN] = js.undefined
  // name of the workspace that the collection is in
  var workspace: js.UndefOr[String] = js.undefined
}

object Collection {
  @scala.inline
  def apply(
    created_at: String = null,
    created_by: String = null,
    description: String = null,
    field_mappings: js.Array[FieldMappingV2] = null,
    name: String = null,
    retention_secs: js.UndefOr[Double] = js.undefined,
    sources: js.Array[Source] = null,
    stats: CollectionStats = null,
    status: CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN = null,
    workspace: String = null
  ): Collection = {
    val __obj = js.Dynamic.literal()
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (created_by != null) __obj.updateDynamic("created_by")(created_by.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (field_mappings != null) __obj.updateDynamic("field_mappings")(field_mappings.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(retention_secs)) __obj.updateDynamic("retention_secs")(retention_secs.get.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
}

