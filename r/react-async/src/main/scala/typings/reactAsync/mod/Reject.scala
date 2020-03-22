package typings.reactAsync.mod

import typings.reactAsync.AnonDictmeta
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.reject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type  :'reject',   payload  :std.Error,   error  :true} */
trait Reject
  extends AsyncAction[js.Any] {
  var error: `true`
  var meta: AnonDictmeta
  var payload: Error
  var `type`: String with reject
}

object Reject {
  @scala.inline
  def apply(error: `true`, meta: AnonDictmeta, payload: Error, `type`: String with reject): Reject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
}

