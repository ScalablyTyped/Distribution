package typings.sharedb.mod

import typings.sharedb.anon.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitRequest extends StObject {
  
  var channels: js.Array[String] | Null
  
  var collection: String
  
  var extra: Source
  
  var id: String
  
  var index: String
  
  var maxRetries: Double | Null
  
  var op: CreateOp | DeleteOp | EditOp
  
  var ops: js.Array[Any]
  
  var options: Any
  
  var projection: ReadonlyProjection
  
  var retries: Double
  
  var saveMilestoneSnapshot: Boolean | Null
  
  var snapshot: Snapshot | Null
  
  var start: Double
  
  var suppressPublish: Boolean | Null
}
object SubmitRequest {
  
  inline def apply(
    collection: String,
    extra: Source,
    id: String,
    index: String,
    op: CreateOp | DeleteOp | EditOp,
    ops: js.Array[Any],
    options: Any,
    projection: ReadonlyProjection,
    retries: Double,
    start: Double
  ): SubmitRequest = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = null, maxRetries = null, saveMilestoneSnapshot = null, snapshot = null, suppressPublish = null)
    __obj.asInstanceOf[SubmitRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmitRequest] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsNull: Self = StObject.set(x, "channels", null)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Source): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesNull: Self = StObject.set(x, "maxRetries", null)
    
    inline def setOp(value: CreateOp | DeleteOp | EditOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOps(value: js.Array[Any]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsVarargs(value: Any*): Self = StObject.set(x, "ops", js.Array(value*))
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: ReadonlyProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setSaveMilestoneSnapshot(value: Boolean): Self = StObject.set(x, "saveMilestoneSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSaveMilestoneSnapshotNull: Self = StObject.set(x, "saveMilestoneSnapshot", null)
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSuppressPublish(value: Boolean): Self = StObject.set(x, "suppressPublish", value.asInstanceOf[js.Any])
    
    inline def setSuppressPublishNull: Self = StObject.set(x, "suppressPublish", null)
  }
}
