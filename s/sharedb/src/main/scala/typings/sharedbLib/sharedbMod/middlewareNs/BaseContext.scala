package typings
package sharedbLib.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseContext extends js.Object {
  var action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit
  var agent: js.Any
  var backend: sharedbLib.sharedbMod.sharedb
}

object BaseContext {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit,
    agent: js.Any,
    backend: sharedbLib.sharedbMod.sharedb
  ): BaseContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend)
  
    __obj.asInstanceOf[BaseContext]
  }
}

