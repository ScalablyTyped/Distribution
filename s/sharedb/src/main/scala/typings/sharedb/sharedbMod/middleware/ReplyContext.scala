package typings.sharedb.sharedbMod.middleware

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.libSharedbMod.ClientRequest
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

trait ReplyContext extends BaseContext {
  var reply: StringDictionary[js.Any]
  var request: ClientRequest
}

object ReplyContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: typings.sharedb.libAgentMod.^,
    backend: typings.sharedb.sharedbMod.sharedb,
    reply: StringDictionary[js.Any],
    request: ClientRequest
  ): ReplyContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplyContext]
  }
}

