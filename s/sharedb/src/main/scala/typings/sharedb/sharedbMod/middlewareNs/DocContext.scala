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

trait DocContext extends BaseContext {
  var collection: String
  var id: String
  var snapshot: Snapshot
}

object DocContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: typings.sharedb.libAgentMod.^,
    backend: typings.sharedb.sharedbMod.sharedb,
    collection: String,
    id: String,
    snapshot: Snapshot
  ): DocContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, collection = collection, id = id, snapshot = snapshot)
  
    __obj.asInstanceOf[DocContext]
  }
}

