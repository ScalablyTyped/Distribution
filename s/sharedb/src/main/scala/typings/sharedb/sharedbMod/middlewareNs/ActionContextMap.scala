package typings.sharedb.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionContextMap extends js.Object {
  var afterSubmit: SubmitContext
  @JSName("apply")
  var apply: ApplyContext
  var commit: CommitContext
  var connect: ConnectContext
  var doc: DocContext
    // Deprecated, use 'readSnapshots' instead.
  var op: OpContext
  var query: QueryContext
  var readSnapshots: ReadSnapshotsContext
  var receive: ReceiveContext
  var reply: ReplyContext
  var submit: SubmitContext
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
    val __obj = js.Dynamic.literal(afterSubmit = afterSubmit, apply = apply, commit = commit, connect = connect, doc = doc, op = op, query = query, readSnapshots = readSnapshots, receive = receive, reply = reply, submit = submit)
  
    __obj.asInstanceOf[ActionContextMap]
  }
}

