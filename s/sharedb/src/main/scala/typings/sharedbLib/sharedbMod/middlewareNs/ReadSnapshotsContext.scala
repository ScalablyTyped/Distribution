package typings
package sharedbLib.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadSnapshotsContext extends BaseContext {
  var collection: java.lang.String
  var snapshotType: SnapshotType
  var snapshots: js.Array[sharedbLib.libSharedbMod.Snapshot]
}

object ReadSnapshotsContext {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit,
    agent: js.Any,
    backend: sharedbLib.sharedbMod.sharedb,
    collection: java.lang.String,
    snapshotType: SnapshotType,
    snapshots: js.Array[sharedbLib.libSharedbMod.Snapshot]
  ): ReadSnapshotsContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, collection = collection, snapshotType = snapshotType, snapshots = snapshots)
  
    __obj.asInstanceOf[ReadSnapshotsContext]
  }
}

