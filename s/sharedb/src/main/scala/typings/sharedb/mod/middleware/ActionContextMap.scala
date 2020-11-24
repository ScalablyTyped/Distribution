package typings.sharedb.mod.middleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionContextMap extends js.Object {
  
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
  implicit class ActionContextMapOps[Self <: ActionContextMap] (val x: Self) extends AnyVal {
    
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
    def setAfterSubmit(value: SubmitContext): Self = this.set("afterSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApply(value: ApplyContext): Self = this.set("apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: CommitContext): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect(value: ConnectContext): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc(value: DocContext): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: OpContext): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: QueryContext): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadSnapshots(value: ReadSnapshotsContext): Self = this.set("readSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceive(value: ReceiveContext): Self = this.set("receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply(value: ReplyContext): Self = this.set("reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: SubmitContext): Self = this.set("submit", value.asInstanceOf[js.Any])
  }
}
