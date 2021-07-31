package typings.sharedb.mod

import typings.sharedb.sharedbMod.Snapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitRequest extends StObject {
  
  var channels: js.Array[String] | Null
  
  var collection: String
  
  var id: String
  
  var index: String
  
  var maxRetries: Double | Null
  
  var op: CreateOp | DeleteOp | EditOp
  
  var ops: js.Array[typings.sharedb.sharedbMod.Op]
  
  var options: js.Any
  
  var projection: js.UndefOr[Projection] = js.undefined
  
  var retries: Double
  
  var saveMilestoneSnapshot: Boolean | Null
  
  var snapshot: Snapshot | Null
  
  var start: Double
  
  var suppressPublish: Boolean | Null
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
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = null, maxRetries = null, saveMilestoneSnapshot = null, snapshot = null, suppressPublish = null)
    __obj.asInstanceOf[SubmitRequest]
  }
  
  @scala.inline
  implicit class SubmitRequestMutableBuilder[Self <: SubmitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsNull: Self = StObject.set(x, "channels", null)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesNull: Self = StObject.set(x, "maxRetries", null)
    
    @scala.inline
    def setOp(value: CreateOp | DeleteOp | EditOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: js.Array[typings.sharedb.sharedbMod.Op]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: typings.sharedb.sharedbMod.Op*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveMilestoneSnapshot(value: Boolean): Self = StObject.set(x, "saveMilestoneSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveMilestoneSnapshotNull: Self = StObject.set(x, "saveMilestoneSnapshot", null)
    
    @scala.inline
    def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPublish(value: Boolean): Self = StObject.set(x, "suppressPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPublishNull: Self = StObject.set(x, "suppressPublish", null)
  }
}
