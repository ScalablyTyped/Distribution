package typings.sharedb.sharedbMod.middlewareNs

import org.scalablytyped.runtime.StringDictionary
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

trait ReceiveContext extends BaseContext {
  var data: StringDictionary[js.Any]
}

object ReceiveContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: js.Any,
    backend: typings.sharedb.sharedbMod.sharedb,
    data: StringDictionary[js.Any]
  ): ReceiveContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, data = data)
  
    __obj.asInstanceOf[ReceiveContext]
  }
}

