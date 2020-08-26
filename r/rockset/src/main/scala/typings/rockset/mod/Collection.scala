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

@js.native
trait Collection extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.native
  // email of user who created the collection
  var created_by: js.UndefOr[String] = js.native
  // text describing the collection
  var description: js.UndefOr[String] = js.native
  // list of mappings applied on all documents in a collection
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.native
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: js.UndefOr[String] = js.native
  // number of seconds after which data is purged based on event time
  var retention_secs: js.UndefOr[Double] = js.native
  // list of sources from which collection ingests
  var sources: js.UndefOr[js.Array[Source]] = js.native
  // metrics about the collection
  var stats: js.UndefOr[CollectionStats] = js.native
  // current status of collection, one of: CREATED, READY, DELETED
  var status: js.UndefOr[CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN] = js.native
  // name of the workspace that the collection is in
  var workspace: js.UndefOr[String] = js.native
}

object Collection {
  @scala.inline
  def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCreated_by(value: String): Self = this.set("created_by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_by: Self = this.set("created_by", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setField_mappingsVarargs(value: FieldMappingV2*): Self = this.set("field_mappings", js.Array(value :_*))
    @scala.inline
    def setField_mappings(value: js.Array[FieldMappingV2]): Self = this.set("field_mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField_mappings: Self = this.set("field_mappings", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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
    @scala.inline
    def setStats(value: CollectionStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setStatus(value: CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setWorkspace(value: String): Self = this.set("workspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
  
}

