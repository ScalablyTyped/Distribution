package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var hash: historyLib.historyMod.Hash
  var pathname: historyLib.historyMod.Pathname
  var queries: js.Any
  var search: historyLib.historyMod.Search
}

object State {
  @scala.inline
  def apply(
    hash: historyLib.historyMod.Hash,
    pathname: historyLib.historyMod.Pathname,
    queries: js.Any,
    search: historyLib.historyMod.Search
  ): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("pathname")(pathname)
    __obj.updateDynamic("queries")(queries)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[State]
  }
}

