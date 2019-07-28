package typings.qhistory.qhistoryMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qhistory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(
    history: History[LocationState],
    stringify: js.Function1[/* query */ js.Object, String],
    parse: js.Function1[/* search */ String, js.Object]
  ): History[LocationState] = js.native
}

