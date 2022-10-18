package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sharedb", "DB")
@js.native
open class DB () extends StObject {
  
  def canPollDoc(): Boolean = js.native
  
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  
  def commit(
    collection: String,
    id: String,
    op: Any,
    snapshot: Any,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  var disableSubscribe: Boolean = js.native
  
  def getCommittedOpVersion(
    collection: String,
    id: String,
    snapshot: Any,
    op: Any,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  def getOps(
    collection: String,
    id: String,
    from: Double,
    to: Double,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  def getOps(
    collection: String,
    id: String,
    from: Double,
    to: Null,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  def getOps(
    collection: String,
    id: String,
    from: Null,
    to: Double,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  def getOps(
    collection: String,
    id: String,
    from: Null,
    to: Null,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  def getOpsBulk(
    collection: String,
    fromMap: Any,
    toMap: Any,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  def getOpsToSnapshot(
    collection: String,
    id: String,
    from: Double,
    snapshot: Double,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  def getOpsToSnapshot(
    collection: String,
    id: String,
    from: Null,
    snapshot: Double,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  def getSnapshot(
    collection: String,
    id: String,
    fields: Any,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  def getSnapshotBulk(
    collection: String,
    ids: js.Array[String],
    fields: Any,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  var projectsSnapshots: Boolean = js.native
  
  def query(collection: String, query: Any, fields: ProjectionFields, options: Any, callback: DBQueryCallback): Unit = js.native
  
  def queryPoll(collection: String, query: Any, options: Any, callback: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  
  def queryPollDoc(
    collection: String,
    id: String,
    query: Any,
    options: Any,
    callback: js.Function1[/* repeated */ Any, Any]
  ): Unit = js.native
  
  @JSName("query")
  var query_Original: DBQueryMethod = js.native
  
  def skipPoll(): Boolean = js.native
}
