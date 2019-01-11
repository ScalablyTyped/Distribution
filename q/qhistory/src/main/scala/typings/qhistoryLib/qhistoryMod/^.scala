package typings
package qhistoryLib.qhistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qhistory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    stringify: js.Function1[/* query */ js.Object, java.lang.String],
    parse: js.Function1[/* search */ java.lang.String, js.Object]
  ): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
}

