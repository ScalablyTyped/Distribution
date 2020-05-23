package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionRequest extends js.Object {
  // text describing the collection
  var description: js.UndefOr[String] = js.undefined
  // configuration for event data
  var event_time_info: js.UndefOr[EventTimeInfo] = js.undefined
  // list of mappings
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.undefined
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: String
  // number of seconds after which data is purged, based on event time
  var retention_secs: js.UndefOr[Double] = js.undefined
  // list of sources from which to ingest data
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}

object CreateCollectionRequest {
  @scala.inline
  def apply(
    name: String,
    description: String = null,
    event_time_info: EventTimeInfo = null,
    field_mappings: js.Array[FieldMappingV2] = null,
    retention_secs: js.UndefOr[Double] = js.undefined,
    sources: js.Array[Source] = null
  ): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (event_time_info != null) __obj.updateDynamic("event_time_info")(event_time_info.asInstanceOf[js.Any])
    if (field_mappings != null) __obj.updateDynamic("field_mappings")(field_mappings.asInstanceOf[js.Any])
    if (!js.isUndefined(retention_secs)) __obj.updateDynamic("retention_secs")(retention_secs.get.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
}

