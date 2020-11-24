package typings.sharedb.mod.middleware

import typings.sharedb.agentMod.^
import typings.sharedb.mod.sharedb
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    agent: ^,
    backend: sharedb,
    collection: String,
    snapshotType: SnapshotType,
    snapshots: js.Array[Snapshot]
  ): ReadSnapshotsContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], snapshotType = snapshotType.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSnapshotsContext]
  }
  
  @scala.inline
  implicit class ReadSnapshotsContextOps[Self <: ReadSnapshotsContext] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotType(value: SnapshotType): Self = this.set("snapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsVarargs(value: Snapshot*): Self = this.set("snapshots", js.Array(value :_*))
    
    @scala.inline
    def setSnapshots(value: js.Array[Snapshot]): Self = this.set("snapshots", value.asInstanceOf[js.Any])
  }
}
