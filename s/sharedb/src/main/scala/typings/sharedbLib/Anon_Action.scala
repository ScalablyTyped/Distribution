package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: sharedbLib.sharedbMod.sharedbNs.UseAction
  var agent: js.Any
  var collection: java.lang.String
  var id: java.lang.String
  var op: sharedbLib.libSharedbMod.RawOp
  var query: js.Any
  var req: js.Any
}

object Anon_Action {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbMod.sharedbNs.UseAction,
    agent: js.Any,
    collection: java.lang.String,
    id: java.lang.String,
    op: sharedbLib.libSharedbMod.RawOp,
    query: js.Any,
    req: js.Any
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, agent = agent, collection = collection, id = id, op = op, query = query, req = req)
  
    __obj.asInstanceOf[Anon_Action]
  }
}

