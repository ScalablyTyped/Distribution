package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  // email of user who created the collection
  var created_by: js.UndefOr[java.lang.String] = js.undefined
  // text describing the collection
  var description: js.UndefOr[java.lang.String] = js.undefined
  // list of mappings applied on all documents in a collection
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.undefined
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: js.UndefOr[java.lang.String] = js.undefined
  // number of seconds after which data is purged based on event time
  var retention_secs: js.UndefOr[scala.Double] = js.undefined
  // list of sources from which collection ingests
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  // metrics about the collection
  var stats: js.UndefOr[CollectionStats] = js.undefined
  // current status of collection, one of: CREATED, READY, DELETED
  var status: js.UndefOr[
    rocksetLib.rocksetLibStrings.CREATED | rocksetLib.rocksetLibStrings.READY | rocksetLib.rocksetLibStrings.PAUSED | rocksetLib.rocksetLibStrings.DELETED | rocksetLib.rocksetLibStrings.PAUSING | rocksetLib.rocksetLibStrings.RESUMING | rocksetLib.rocksetLibStrings.CATCHINGUP | rocksetLib.rocksetLibStrings.UNKNOWN
  ] = js.undefined
  // name of the workspace that the collection is in
  var workspace: js.UndefOr[java.lang.String] = js.undefined
}

object Collection {
  @scala.inline
  def apply(
    created_at: java.lang.String = null,
    created_by: java.lang.String = null,
    description: java.lang.String = null,
    field_mappings: js.Array[FieldMappingV2] = null,
    name: java.lang.String = null,
    retention_secs: scala.Int | scala.Double = null,
    sources: js.Array[Source] = null,
    stats: CollectionStats = null,
    status: rocksetLib.rocksetLibStrings.CREATED | rocksetLib.rocksetLibStrings.READY | rocksetLib.rocksetLibStrings.PAUSED | rocksetLib.rocksetLibStrings.DELETED | rocksetLib.rocksetLibStrings.PAUSING | rocksetLib.rocksetLibStrings.RESUMING | rocksetLib.rocksetLibStrings.CATCHINGUP | rocksetLib.rocksetLibStrings.UNKNOWN = null,
    workspace: java.lang.String = null
  ): Collection = {
    val __obj = js.Dynamic.literal()
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (created_by != null) __obj.updateDynamic("created_by")(created_by)
    if (description != null) __obj.updateDynamic("description")(description)
    if (field_mappings != null) __obj.updateDynamic("field_mappings")(field_mappings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (retention_secs != null) __obj.updateDynamic("retention_secs")(retention_secs.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[Collection]
  }
}

