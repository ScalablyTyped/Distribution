package typings.sharedb.mod

import typings.sharedb.sharedbMod.Snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitRequest extends js.Object {
  
  var channels: js.Array[String] | Null = js.native
  
  var collection: String = js.native
  
  var id: String = js.native
  
  var index: String = js.native
  
  var maxRetries: Double | Null = js.native
  
  var op: CreateOp | DeleteOp | EditOp = js.native
  
  var ops: js.Array[typings.sharedb.sharedbMod.Op] = js.native
  
  var options: js.Any = js.native
  
  var projection: js.UndefOr[Projection] = js.native
  
  var retries: Double = js.native
  
  var saveMilestoneSnapshot: Boolean | Null = js.native
  
  var snapshot: Snapshot | Null = js.native
  
  var start: Double = js.native
  
  var suppressPublish: Boolean | Null = js.native
}
object SubmitRequest {
  
  @scala.inline
  def apply(
    collection: String,
    id: String,
    index: String,
    op: CreateOp | DeleteOp | EditOp,
    ops: js.Array[typings.sharedb.sharedbMod.Op],
    options: js.Any,
    retries: Double,
    start: Double
  ): SubmitRequest = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitRequest]
  }
  
  @scala.inline
  implicit class SubmitRequestOps[Self <: SubmitRequest] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: CreateOp | DeleteOp | EditOp): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: typings.sharedb.sharedbMod.Op*): Self = this.set("ops", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: js.Array[typings.sharedb.sharedbMod.Op]): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsNull: Self = this.set("channels", null)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesNull: Self = this.set("maxRetries", null)
    
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setSaveMilestoneSnapshot(value: Boolean): Self = this.set("saveMilestoneSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveMilestoneSnapshotNull: Self = this.set("saveMilestoneSnapshot", null)
    
    @scala.inline
    def setSnapshot(value: Snapshot): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNull: Self = this.set("snapshot", null)
    
    @scala.inline
    def setSuppressPublish(value: Boolean): Self = this.set("suppressPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPublishNull: Self = this.set("suppressPublish", null)
  }
}
