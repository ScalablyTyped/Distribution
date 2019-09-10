package typings.sharedb.sharedbMod.middlewareNs

import typings.sharedb.libSharedbMod.Snapshot
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
    agent: typings.sharedb.libAgentMod.^,
    backend: typings.sharedb.sharedbMod.sharedb,
    collection: String,
    snapshotType: SnapshotType,
    snapshots: js.Array[Snapshot]
  ): ReadSnapshotsContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, collection = collection, snapshotType = snapshotType, snapshots = snapshots)
  
    __obj.asInstanceOf[ReadSnapshotsContext]
  }
}

