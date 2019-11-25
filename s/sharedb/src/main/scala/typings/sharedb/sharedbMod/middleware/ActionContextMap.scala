package typings.sharedb.sharedbMod.middleware

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
    val __obj = js.Dynamic.literal(afterSubmit = afterSubmit.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readSnapshots = readSnapshots.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionContextMap]
  }
}

