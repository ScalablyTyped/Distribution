package typings
package sharedbLib.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyContext extends BaseContext {
  var reply: sharedbLib.libSharedbMod.JSONObject
  var request: sharedbLib.libSharedbMod.ClientRequest
}

object ReplyContext {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit,
    agent: js.Any,
    backend: sharedbLib.sharedbMod.sharedb,
    reply: sharedbLib.libSharedbMod.JSONObject,
    request: sharedbLib.libSharedbMod.ClientRequest
  ): ReplyContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, reply = reply, request = request)
  
    __obj.asInstanceOf[ReplyContext]
  }
}

