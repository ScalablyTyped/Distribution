package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import typings.sharedb.mod.middleware.ApplyContext
import typings.sharedb.mod.middleware.CommitContext
import typings.sharedb.mod.middleware.ConnectContext
import typings.sharedb.mod.middleware.DocContext
import typings.sharedb.mod.middleware.OpContext
import typings.sharedb.mod.middleware.PresenceContext
import typings.sharedb.mod.middleware.QueryContext
import typings.sharedb.mod.middleware.ReadSnapshotsContext
import typings.sharedb.mod.middleware.ReceiveContext
import typings.sharedb.mod.middleware.ReplyContext
import typings.sharedb.mod.middleware.SubmitContext
import typings.sharedb.sharedbStrings.afterSubmit
import typings.sharedb.sharedbStrings.afterWrite
import typings.sharedb.sharedbStrings.apply
import typings.sharedb.sharedbStrings.commit
import typings.sharedb.sharedbStrings.connect
import typings.sharedb.sharedbStrings.doc
import typings.sharedb.sharedbStrings.error
import typings.sharedb.sharedbStrings.op
import typings.sharedb.sharedbStrings.query
import typings.sharedb.sharedbStrings.readSnapshots
import typings.sharedb.sharedbStrings.receive
import typings.sharedb.sharedbStrings.receivePresence
import typings.sharedb.sharedbStrings.reply
import typings.sharedb.sharedbStrings.send
import typings.sharedb.sharedbStrings.sendPresence
import typings.sharedb.sharedbStrings.submit
import typings.sharedb.sharedbStrings.submitRequestEnd
import typings.sharedb.sharedbStrings.timing
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sharedb extends EventEmitter {
  
  def addListener[E /* <: /* keyof sharedb.sharedb.BackendEventListenerMap */ error | send | submitRequestEnd | timing */](
    event: E,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: sharedb.sharedb.BackendEventListenerMap[E] */ js.Any
  ): this.type = js.native
  
  /**
    * Registers a projection that can be used from clients just like a normal collection.
    *
    * @param name name of the projection
    * @param collection name of the backing collection
    * @param fields field whitelist for the projection
    */
  def addProjection(name: String, collection: String, fields: ProjectionFields): Unit = js.native
  
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  
  /**
    * Creates a server-side connection to ShareDB.
    *
    * This is almost always called with no arguments.
    *
    * @param connection optional existing connection to re-bind to this `Backend`.
    * @param req optional request context for the new connection. See `#listen` for details.
    *
    * @see https://github.com/share/sharedb#client-api
    */
  def connect(): Connection = js.native
  def connect(connection: Unit, req: Any): Connection = js.native
  def connect(connection: Connection): Connection = js.native
  def connect(connection: Connection, req: Any): Connection = js.native
  
  var db: DB = js.native
  
  def errorHandler(error: js.Error, context: ErrorHandlerContext): Unit = js.native
  @JSName("errorHandler")
  var errorHandler_Original: ErrorHandler = js.native
  
  var extraDbs: StringDictionary[ExtraDB] = js.native
  
  def getOps(
    agent: typings.sharedb.libAgentMod.^[Any],
    index: String,
    id: String,
    from: Double,
    to: Double,
    options: GetOpsOptions,
    callback: js.Function2[/* error */ Error, /* ops */ js.Array[Any], Any]
  ): Unit = js.native
  
  def getOpsBulk(
    agent: typings.sharedb.libAgentMod.^[Any],
    index: String,
    id: String,
    fromMap: Record[String, Double],
    toMap: Record[String, Double],
    options: GetOpsOptions,
    callback: js.Function2[/* error */ Error, /* ops */ js.Array[Any], Any]
  ): Unit = js.native
  
  /**
    * Registers a new `Duplex` stream with the backend. This should be called when the server
    * receives a new connection from a client.
    *
    * @param stream duplex stream for exchanging data with the new client
    * @param request optional request that initiated the new connection, e.g. a HTTP request. This
    *   is passed to any "connect" middleware listeners, which can use it for inspecting cookies
    *   or session info.
    */
  def listen(stream: Duplex): typings.sharedb.libAgentMod.^[Any] = js.native
  def listen(stream: Duplex, request: Any): typings.sharedb.libAgentMod.^[Any] = js.native
  
  var milestoneDb: js.UndefOr[MilestoneDB] = js.native
  
  def on[E /* <: /* keyof sharedb.sharedb.BackendEventListenerMap */ error | send | submitRequestEnd | timing */](
    event: E,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: sharedb.sharedb.BackendEventListenerMap[E] */ js.Any
  ): this.type = js.native
  
  val projections: StringDictionary[ReadonlyProjection] = js.native
  
  var pubsub: PubSub = js.native
  
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_afterSubmit(
    action: afterSubmit,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_afterWrite(
    action: afterWrite,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_apply(
    action: apply,
    fn: js.Function2[
      /* context */ ApplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_commit(
    action: commit,
    fn: js.Function2[
      /* context */ CommitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_connect(
    action: connect,
    fn: js.Function2[
      /* context */ ConnectContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_doc(
    action: doc,
    fn: js.Function2[
      /* context */ DocContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_op(
    action: op,
    fn: js.Function2[
      /* context */ OpContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_query(
    action: query,
    fn: js.Function2[
      /* context */ QueryContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_readSnapshots(
    action: readSnapshots,
    fn: js.Function2[
      /* context */ ReadSnapshotsContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_receive(
    action: receive,
    fn: js.Function2[
      /* context */ ReceiveContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_receivePresence(
    action: receivePresence,
    fn: js.Function2[
      /* context */ PresenceContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_reply(
    action: reply,
    fn: js.Function2[
      /* context */ ReplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_sendPresence(
    action: sendPresence,
    fn: js.Function2[
      /* context */ PresenceContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("use")
  def use_submit(
    action: submit,
    fn: js.Function2[
      /* context */ SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): Unit = js.native
}
