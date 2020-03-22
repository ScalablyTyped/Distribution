package typings.reactAsync.mod

import typings.reactAsync.AnonDictmeta
import typings.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type  :'start', payload (): std.Promise<void>} */
trait Start
  extends AsyncAction[js.Any] {
  var meta: AnonDictmeta
  var `type`: String with start
  def payload(): js.Promise[Unit]
}

object Start {
  @scala.inline
  def apply(meta: AnonDictmeta, payload: () => js.Promise[Unit], `type`: String with start): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

