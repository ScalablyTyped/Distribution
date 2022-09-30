package typings.sharedb

import typings.sharedb.agentMod.^
import typings.sharedb.anon.`0`
import typings.sharedb.sharedbMod.ConnectionEventMap
import typings.sharedb.sharedbMod.Logger
import typings.sharedb.sharedbMod.Socket
import typings.sharedb.sharedbMod.TypedEmitter
import typings.sharedb.sharedbMod.Types
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("sharedb/lib/client", "Connection")
  @js.native
  open class Connection protected () extends TypedEmitter[ConnectionEventMap] {
    def this(ws: Socket) = this()
    
    // This direct reference from connection to agent is not used internal to
    // ShareDB, but it is handy for server-side only user code that may cache
    // state on the agent and read it in middleware
    var agent: ^[Any] | Null = js.native
    
    def close(): Unit = js.native
    
    var collections: Record[String, Record[String, Doc[Any]]] = js.native
    
    def createFetchQuery[T](collectionName: String, query: Any): Query[T] = js.native
    def createFetchQuery[T](
      collectionName: String,
      query: Any,
      options: Null,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createFetchQuery[T](
      collectionName: String,
      query: Any,
      options: Unit,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createFetchQuery[T](collectionName: String, query: Any, options: `0`[T]): Query[T] = js.native
    def createFetchQuery[T](
      collectionName: String,
      query: Any,
      options: `0`[T],
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    
    def createSubscribeQuery[T](collectionName: String, query: Any): Query[T] = js.native
    def createSubscribeQuery[T](
      collectionName: String,
      query: Any,
      options: Null,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createSubscribeQuery[T](
      collectionName: String,
      query: Any,
      options: Unit,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createSubscribeQuery[T](collectionName: String, query: Any, options: `0`[T]): Query[T] = js.native
    def createSubscribeQuery[T](
      collectionName: String,
      query: Any,
      options: `0`[T],
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    
    var debug: Boolean = js.native
    
    def fetchSnapshot(
      collection: String,
      id: String,
      version: Double,
      callback: js.Function2[/* error */ Error, /* snapshot */ typings.sharedb.sharedbMod.Snapshot[Any], Unit]
    ): Unit = js.native
    
    def fetchSnapshotByTimestamp(
      collection: String,
      id: String,
      timestamp: Double,
      callback: js.Function2[/* error */ Error, /* snapshot */ typings.sharedb.sharedbMod.Snapshot[Any], Unit]
    ): Unit = js.native
    
    def get(collectionName: String, documentID: String): Doc[Any] = js.native
    
    def getDocPresence(collection: String, id: String): Presence[Any] = js.native
    
    def getPresence(channel: String): Presence[Any] = js.native
    
    /**
      * Returns whether anything in this client is either:
      * - In-flight, waiting on a response from the server
      * - Pending (locally queued)
      */
    def hasPending(): Boolean = js.native
    
    var id: String | Null = js.native
    
    // Equals agent.src on the server
    var nextQueryId: Double = js.native
    
    var nextSnapshotRequestId: Double = js.native
    
    def ping(): Unit = js.native
    
    var queries: Record[String, Query[Any]] = js.native
    
    /**
      * Manually send a JSON-serializable message to the server.
      *
      * WARNING - This is mostly for internal use within sharedb.
      *
      * Prefer to use methods like `Doc#submitOp`, `Doc#subscribe`, `Connection#createFetchQuery`,
      * etc., which will manage the necessary message exchanges.
      */
    def send(message: Record[String, Any]): Unit = js.native
    
    var seq: Double = js.native
    
    var state: String = js.native
    
    /**
      * Invokes the callback once nothing on this client is in-flight or pending.
      *
      * @see hasPending
      */
    def whenNothingPending(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("sharedb/lib/client", "logger")
  @js.native
  val logger: Logger = js.native
  
  @JSImport("sharedb/lib/client", "types")
  @js.native
  val types: Types = js.native
  
  type AddNumOp = typings.sharedb.sharedbMod.AddNumOp
  
  type Doc[T] = typings.sharedb.sharedbMod.Doc[T]
  
  type Error = typings.sharedb.sharedbMod.Error
  
  type ListDeleteOp = typings.sharedb.sharedbMod.ListDeleteOp
  
  type ListInsertOp = typings.sharedb.sharedbMod.ListInsertOp
  
  type ListMoveOp = typings.sharedb.sharedbMod.ListMoveOp
  
  type ListReplaceOp = typings.sharedb.sharedbMod.ListReplaceOp
  
  type LocalPresence[T] = typings.sharedb.sharedbMod.LocalPresence[T]
  
  type ObjectDeleteOp = typings.sharedb.sharedbMod.ObjectDeleteOp
  
  type ObjectInsertOp = typings.sharedb.sharedbMod.ObjectInsertOp
  
  type ObjectReplaceOp = typings.sharedb.sharedbMod.ObjectReplaceOp
  
  type Op = typings.sharedb.sharedbMod.Op
  
  type Path = typings.sharedb.sharedbMod.Path
  
  type Presence[T] = typings.sharedb.sharedbMod.Presence[T]
  
  type Query[T] = typings.sharedb.sharedbMod.Query[T]
  
  type ShareDBSourceOptions = typings.sharedb.sharedbMod.ShareDBSourceOptions
  
  type Snapshot[T] = typings.sharedb.sharedbMod.Snapshot[T]
  
  type StringDeleteOp = typings.sharedb.sharedbMod.StringDeleteOp
  
  type StringInsertOp = typings.sharedb.sharedbMod.StringInsertOp
  
  type SubtypeOp = typings.sharedb.sharedbMod.SubtypeOp
}
