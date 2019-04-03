package typings
package sharedbLib.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocContext extends BaseContext {
  var collection: java.lang.String
  var id: java.lang.String
  var snapshot: sharedbLib.libSharedbMod.Snapshot
}

object DocContext {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit,
    agent: js.Any,
    backend: sharedbLib.sharedbMod.sharedb,
    collection: java.lang.String,
    id: java.lang.String,
    snapshot: sharedbLib.libSharedbMod.Snapshot
  ): DocContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, collection = collection, id = id, snapshot = snapshot)
  
    __obj.asInstanceOf[DocContext]
  }
}

