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
import scala.scalajs.js.annotation._

trait ReadSnapshotsContext extends BaseContext {
  var collection: String
  var snapshotType: SnapshotType
  var snapshots: js.Array[Snapshot]
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
}

