package typings.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.anon.Source
import typings.sharedb.sharedbMod.ClientRequest
import typings.sharedb.sharedbStrings.afterSubmit
import typings.sharedb.sharedbStrings.afterWrite
import typings.sharedb.sharedbStrings.apply
import typings.sharedb.sharedbStrings.commit
import typings.sharedb.sharedbStrings.connect
import typings.sharedb.sharedbStrings.doc
import typings.sharedb.sharedbStrings.op
import typings.sharedb.sharedbStrings.query
import typings.sharedb.sharedbStrings.readSnapshots
import typings.sharedb.sharedbStrings.receive
import typings.sharedb.sharedbStrings.receivePresence
import typings.sharedb.sharedbStrings.reply
import typings.sharedb.sharedbStrings.sendPresence
import typings.sharedb.sharedbStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middleware {
  
  trait ActionContextMap extends StObject {
    
    /**
      * @deprecated use 'afterWrite' instead
      */
    var afterSubmit: SubmitContext
    
    var afterWrite: SubmitContext
    
    @JSName("apply")
    var apply: ApplyContext
    
    var commit: CommitContext
    
    var connect: ConnectContext
    
    /**
      * @deprecated use 'readSnapshots' instead
      */
    var doc: DocContext
    
    var op: OpContext
    
    var query: QueryContext
    
    var readSnapshots: ReadSnapshotsContext
    
    var receive: ReceiveContext
    
    var receivePresence: PresenceContext
    
    var reply: ReplyContext
    
    var sendPresence: PresenceContext
    
    var submit: SubmitContext
  }
  object ActionContextMap {
    
    inline def apply(
      afterSubmit: SubmitContext,
      afterWrite: SubmitContext,
      apply: ApplyContext,
      commit: CommitContext,
      connect: ConnectContext,
      doc: DocContext,
      op: OpContext,
      query: QueryContext,
      readSnapshots: ReadSnapshotsContext,
      receive: ReceiveContext,
      receivePresence: PresenceContext,
      reply: ReplyContext,
      sendPresence: PresenceContext,
      submit: SubmitContext
    ): ActionContextMap = {
      val __obj = js.Dynamic.literal(afterSubmit = afterSubmit.asInstanceOf[js.Any], afterWrite = afterWrite.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readSnapshots = readSnapshots.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], receivePresence = receivePresence.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], sendPresence = sendPresence.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionContextMap]
    }
    
    extension [Self <: ActionContextMap](x: Self) {
      
      inline def setAfterSubmit(value: SubmitContext): Self = StObject.set(x, "afterSubmit", value.asInstanceOf[js.Any])
      
      inline def setAfterWrite(value: SubmitContext): Self = StObject.set(x, "afterWrite", value.asInstanceOf[js.Any])
      
      inline def setApply(value: ApplyContext): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: CommitContext): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: ConnectContext): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: DocContext): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setOp(value: OpContext): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: QueryContext): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReadSnapshots(value: ReadSnapshotsContext): Self = StObject.set(x, "readSnapshots", value.asInstanceOf[js.Any])
      
      inline def setReceive(value: ReceiveContext): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
      
      inline def setReceivePresence(value: PresenceContext): Self = StObject.set(x, "receivePresence", value.asInstanceOf[js.Any])
      
      inline def setReply(value: ReplyContext): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      inline def setSendPresence(value: PresenceContext): Self = StObject.set(x, "sendPresence", value.asInstanceOf[js.Any])
      
      inline def setSubmit(value: SubmitContext): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyContext
    extends StObject
       with BaseContext
       with SubmitRequest
  object ApplyContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
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
    ): ApplyContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = null, maxRetries = null, saveMilestoneSnapshot = null, snapshot = null, suppressPublish = null)
      __obj.asInstanceOf[ApplyContext]
    }
  }
  
  trait BaseContext extends StObject {
    
    var action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit
    
    var agent: typings.sharedb.agentMod.^[Any]
    
    var backend: sharedb
  }
  object BaseContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb
    ): BaseContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseContext]
    }
    
    extension [Self <: BaseContext](x: Self) {
      
      inline def setAction(
        value: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAgent(value: typings.sharedb.agentMod.^[Any]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setBackend(value: sharedb): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitContext
    extends StObject
       with BaseContext
       with SubmitRequest
  object CommitContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
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
    ): CommitContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = null, maxRetries = null, saveMilestoneSnapshot = null, snapshot = null, suppressPublish = null)
      __obj.asInstanceOf[CommitContext]
    }
  }
  
  trait ConnectContext
    extends StObject
       with BaseContext {
    
    var req: Any
    
    var stream: Any
  }
  object ConnectContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      req: Any,
      stream: Any
    ): ConnectContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContext]
    }
    
    extension [Self <: ConnectContext](x: Self) {
      
      inline def setReq(value: Any): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocContext
    extends StObject
       with BaseContext {
    
    var collection: String
    
    var id: String
    
    var snapshot: Snapshot
  }
  object DocContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      collection: String,
      id: String,
      snapshot: Snapshot
    ): DocContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocContext]
    }
    
    extension [Self <: DocContext](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpContext
    extends StObject
       with BaseContext {
    
    var collection: String
    
    var id: String
    
    var op: Any
  }
  object OpContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      collection: String,
      id: String,
      op: Any
    ): OpContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpContext]
    }
    
    extension [Self <: OpContext](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOp(value: Any): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait PresenceContext
    extends StObject
       with BaseContext {
    
    var collection: js.UndefOr[String] = js.undefined
    
    var presence: PresenceMessage
  }
  object PresenceContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      presence: PresenceMessage
    ): PresenceContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresenceContext]
    }
    
    extension [Self <: PresenceContext](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setPresence(value: PresenceMessage): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryContext
    extends StObject
       with BaseContext {
    
    var channel: String
    
    var collection: String
    
    var db: DB | Null
    
    var fields: ProjectionFields
    
    var index: String
    
    var options: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var projection: ReadonlyProjection
    
    var query: Any
    
    var snapshotProjection: ReadonlyProjection | Null
  }
  object QueryContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      channel: String,
      collection: String,
      fields: ProjectionFields,
      index: String,
      projection: ReadonlyProjection,
      query: Any
    ): QueryContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], db = null, snapshotProjection = null)
      __obj.asInstanceOf[QueryContext]
    }
    
    extension [Self <: QueryContext](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setDb(value: DB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbNull: Self = StObject.set(x, "db", null)
      
      inline def setFields(value: ProjectionFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setProjection(value: ReadonlyProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSnapshotProjection(value: ReadonlyProjection): Self = StObject.set(x, "snapshotProjection", value.asInstanceOf[js.Any])
      
      inline def setSnapshotProjectionNull: Self = StObject.set(x, "snapshotProjection", null)
    }
  }
  
  trait ReadSnapshotsContext
    extends StObject
       with BaseContext {
    
    var collection: String
    
    var snapshotType: SnapshotType
    
    var snapshots: js.Array[Snapshot]
  }
  object ReadSnapshotsContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      collection: String,
      snapshotType: SnapshotType,
      snapshots: js.Array[Snapshot]
    ): ReadSnapshotsContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], snapshotType = snapshotType.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadSnapshotsContext]
    }
    
    extension [Self <: ReadSnapshotsContext](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setSnapshotType(value: SnapshotType): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      inline def setSnapshots(value: js.Array[Snapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
      
      inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "snapshots", js.Array(value*))
    }
  }
  
  trait ReceiveContext
    extends StObject
       with BaseContext {
    
    var data: StringDictionary[Any]
  }
  object ReceiveContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      data: StringDictionary[Any]
    ): ReceiveContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveContext]
    }
    
    extension [Self <: ReceiveContext](x: Self) {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplyContext
    extends StObject
       with BaseContext {
    
    var reply: StringDictionary[Any]
    
    var request: ClientRequest
  }
  object ReplyContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
      reply: StringDictionary[Any],
      request: ClientRequest
    ): ReplyContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplyContext]
    }
    
    extension [Self <: ReplyContext](x: Self) {
      
      inline def setReply(value: StringDictionary[Any]): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: ClientRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sharedb.sharedbStrings.current
    - typings.sharedb.sharedbStrings.byVersion
    - typings.sharedb.sharedbStrings.byTimestamp
  */
  trait SnapshotType extends StObject
  object SnapshotType {
    
    inline def byTimestamp: typings.sharedb.sharedbStrings.byTimestamp = "byTimestamp".asInstanceOf[typings.sharedb.sharedbStrings.byTimestamp]
    
    inline def byVersion: typings.sharedb.sharedbStrings.byVersion = "byVersion".asInstanceOf[typings.sharedb.sharedbStrings.byVersion]
    
    inline def current: typings.sharedb.sharedbStrings.current = "current".asInstanceOf[typings.sharedb.sharedbStrings.current]
  }
  
  trait SubmitContext
    extends StObject
       with BaseContext
       with SubmitRequest
  object SubmitContext {
    
    inline def apply(
      action: afterSubmit | afterWrite | apply | commit | connect | doc | op | query | readSnapshots | receive | receivePresence | reply | sendPresence | submit,
      agent: typings.sharedb.agentMod.^[Any],
      backend: sharedb,
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
    ): SubmitContext = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = null, maxRetries = null, saveMilestoneSnapshot = null, snapshot = null, suppressPublish = null)
      __obj.asInstanceOf[SubmitContext]
    }
  }
}
