package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.sharedbMod.ClientRequest
import typings.sharedb.sharedbMod.Snapshot
import typings.sharedb.sharedbStrings.afterSubmit
import typings.sharedb.sharedbStrings.apply
import typings.sharedb.sharedbStrings.commit
import typings.sharedb.sharedbStrings.connect
import typings.sharedb.sharedbStrings.doc
import typings.sharedb.sharedbStrings.op
import typings.sharedb.sharedbStrings.query
import typings.sharedb.sharedbStrings.readSnapshots
import typings.sharedb.sharedbStrings.receive
import typings.sharedb.sharedbStrings.reply
import typings.sharedb.sharedbStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middleware {
  
  @js.native
  trait ActionContextMap extends StObject {
    
    var afterSubmit: SubmitContext = js.native
    
    @JSName("apply")
    var apply: ApplyContext = js.native
    
    var commit: CommitContext = js.native
    
    var connect: ConnectContext = js.native
    
    var doc: DocContext = js.native
    
    // Deprecated, use 'readSnapshots' instead.
    var op: OpContext = js.native
    
    var query: QueryContext = js.native
    
    var readSnapshots: ReadSnapshotsContext = js.native
    
    var receive: ReceiveContext = js.native
    
    var reply: ReplyContext = js.native
    
    var submit: SubmitContext = js.native
  }
  object ActionContextMap {
    
    @scala.inline
    def apply(
      afterSubmit: SubmitContext,
      apply: ApplyContext,
      commit: CommitContext,
      connect: ConnectContext,
      doc: DocContext,
      op: OpContext,
      query: QueryContext,
      readSnapshots: ReadSnapshotsContext,
      receive: ReceiveContext,
      reply: ReplyContext,
      submit: SubmitContext
    ): ActionContextMap = {
      val __obj = js.Dynamic.literal(afterSubmit = afterSubmit.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readSnapshots = readSnapshots.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionContextMap]
    }
    
    @scala.inline
    implicit class ActionContextMapMutableBuilder[Self <: ActionContextMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterSubmit(value: SubmitContext): Self = StObject.set(x, "afterSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApply(value: ApplyContext): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: CommitContext): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnect(value: ConnectContext): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoc(value: DocContext): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: OpContext): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: QueryContext): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadSnapshots(value: ReadSnapshotsContext): Self = StObject.set(x, "readSnapshots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceive(value: ReceiveContext): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReply(value: ReplyContext): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmit(value: SubmitContext): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApplyContext
    extends BaseContext
       with SubmitRequest
  object ApplyContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      collection: String,
      id: String,
      index: String,
      op: CreateOp | DeleteOp | EditOp,
      ops: js.Array[typings.sharedb.sharedbMod.Op],
      options: js.Any,
      retries: Double,
      start: Double
    ): ApplyContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyContext]
    }
  }
  
  @js.native
  trait BaseContext extends StObject {
    
    var action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit = js.native
    
    var agent: typings.sharedb.agentMod.^ = js.native
    
    var backend: sharedb = js.native
  }
  object BaseContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb
    ): BaseContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseContext]
    }
    
    @scala.inline
    implicit class BaseContextMutableBuilder[Self <: BaseContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(
        value: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgent(value: typings.sharedb.agentMod.^): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackend(value: sharedb): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommitContext
    extends BaseContext
       with SubmitRequest
  object CommitContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      collection: String,
      id: String,
      index: String,
      op: CreateOp | DeleteOp | EditOp,
      ops: js.Array[typings.sharedb.sharedbMod.Op],
      options: js.Any,
      retries: Double,
      start: Double
    ): CommitContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitContext]
    }
  }
  
  @js.native
  trait ConnectContext extends BaseContext {
    
    var req: js.Any = js.native
    
    var stream: js.Any = js.native
  }
  object ConnectContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      req: js.Any,
      stream: js.Any
    ): ConnectContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContext]
    }
    
    @scala.inline
    implicit class ConnectContextMutableBuilder[Self <: ConnectContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: js.Any): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocContext extends BaseContext {
    
    var collection: String = js.native
    
    var id: String = js.native
    
    var snapshot: Snapshot = js.native
  }
  object DocContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      collection: String,
      id: String,
      snapshot: Snapshot
    ): DocContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocContext]
    }
    
    @scala.inline
    implicit class DocContextMutableBuilder[Self <: DocContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpContext extends BaseContext {
    
    var collection: String = js.native
    
    var id: String = js.native
    
    var op: typings.sharedb.sharedbMod.Op = js.native
  }
  object OpContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      collection: String,
      id: String,
      op: typings.sharedb.sharedbMod.Op
    ): OpContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpContext]
    }
    
    @scala.inline
    implicit class OpContextMutableBuilder[Self <: OpContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: typings.sharedb.sharedbMod.Op): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryContext extends BaseContext {
    
    var channel: String = js.native
    
    var collection: String = js.native
    
    var db: DB | Null = js.native
    
    var fields: js.UndefOr[ProjectionFields] = js.native
    
    var index: String = js.native
    
    var options: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var projection: js.UndefOr[Projection] = js.native
    
    var query: js.Any = js.native
    
    var snapshotProjection: Projection | Null = js.native
  }
  object QueryContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      channel: String,
      collection: String,
      index: String,
      query: js.Any
    ): QueryContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryContext]
    }
    
    @scala.inline
    implicit class QueryContextMutableBuilder[Self <: QueryContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDb(value: DB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbNull: Self = StObject.set(x, "db", null)
      
      @scala.inline
      def setFields(value: ProjectionFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotProjection(value: Projection): Self = StObject.set(x, "snapshotProjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotProjectionNull: Self = StObject.set(x, "snapshotProjection", null)
    }
  }
  
  @js.native
  trait ReadSnapshotsContext extends BaseContext {
    
    var collection: String = js.native
    
    var snapshotType: SnapshotType = js.native
    
    var snapshots: js.Array[Snapshot] = js.native
  }
  object ReadSnapshotsContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      collection: String,
      snapshotType: SnapshotType,
      snapshots: js.Array[Snapshot]
    ): ReadSnapshotsContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], snapshotType = snapshotType.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadSnapshotsContext]
    }
    
    @scala.inline
    implicit class ReadSnapshotsContextMutableBuilder[Self <: ReadSnapshotsContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotType(value: SnapshotType): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshots(value: js.Array[Snapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReceiveContext extends BaseContext {
    
    var data: StringDictionary[js.Any] = js.native
  }
  object ReceiveContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      data: StringDictionary[js.Any]
    ): ReceiveContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveContext]
    }
    
    @scala.inline
    implicit class ReceiveContextMutableBuilder[Self <: ReceiveContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplyContext extends BaseContext {
    
    var reply: StringDictionary[js.Any] = js.native
    
    var request: ClientRequest = js.native
  }
  object ReplyContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      reply: StringDictionary[js.Any],
      request: ClientRequest
    ): ReplyContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplyContext]
    }
    
    @scala.inline
    implicit class ReplyContextMutableBuilder[Self <: ReplyContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReply(value: StringDictionary[js.Any]): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: ClientRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sharedb.sharedbStrings.current
    - typings.sharedb.sharedbStrings.byVersion
    - typings.sharedb.sharedbStrings.byTimestamp
  */
  trait SnapshotType extends StObject
  object SnapshotType {
    
    @scala.inline
    def byTimestamp: typings.sharedb.sharedbStrings.byTimestamp = "byTimestamp".asInstanceOf[typings.sharedb.sharedbStrings.byTimestamp]
    
    @scala.inline
    def byVersion: typings.sharedb.sharedbStrings.byVersion = "byVersion".asInstanceOf[typings.sharedb.sharedbStrings.byVersion]
    
    @scala.inline
    def current: typings.sharedb.sharedbStrings.current = "current".asInstanceOf[typings.sharedb.sharedbStrings.current]
  }
  
  @js.native
  trait SubmitContext
    extends BaseContext
       with SubmitRequest
  object SubmitContext {
    
    @scala.inline
    def apply(
      action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
      agent: typings.sharedb.agentMod.^,
      backend: sharedb,
      collection: String,
      id: String,
      index: String,
      op: CreateOp | DeleteOp | EditOp,
      ops: js.Array[typings.sharedb.sharedbMod.Op],
      options: js.Any,
      retries: Double,
      start: Double
    ): SubmitContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmitContext]
    }
  }
}
