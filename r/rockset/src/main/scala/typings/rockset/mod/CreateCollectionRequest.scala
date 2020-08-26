package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectionRequest extends js.Object {
  // text describing the collection
  var description: js.UndefOr[String] = js.native
  // configuration for event data
  var event_time_info: js.UndefOr[EventTimeInfo] = js.native
  // list of mappings
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.native
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: String = js.native
  // number of seconds after which data is purged, based on event time
  var retention_secs: js.UndefOr[Double] = js.native
  // list of sources from which to ingest data
  var sources: js.UndefOr[js.Array[Source]] = js.native
}

object CreateCollectionRequest {
  @scala.inline
  def apply(name: String): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
  @scala.inline
  implicit class CreateCollectionRequestOps[Self <: CreateCollectionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEvent_time_info(value: EventTimeInfo): Self = this.set("event_time_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_time_info: Self = this.set("event_time_info", js.undefined)
    @scala.inline
    def setField_mappingsVarargs(value: FieldMappingV2*): Self = this.set("field_mappings", js.Array(value :_*))
    @scala.inline
    def setField_mappings(value: js.Array[FieldMappingV2]): Self = this.set("field_mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField_mappings: Self = this.set("field_mappings", js.undefined)
    @scala.inline
    def setRetention_secs(value: Double): Self = this.set("retention_secs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetention_secs: Self = this.set("retention_secs", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

