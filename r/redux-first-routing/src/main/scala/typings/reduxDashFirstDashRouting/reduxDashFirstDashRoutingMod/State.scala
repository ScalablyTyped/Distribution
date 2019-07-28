package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.historyMod.Hash
import typings.history.historyMod.Pathname
import typings.history.historyMod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var hash: Hash
  var pathname: Pathname
  var queries: js.Any
  var search: Search
}

object State {
  @scala.inline
  def apply(hash: Hash, pathname: Pathname, queries: js.Any, search: Search): State = {
    val __obj = js.Dynamic.literal(hash = hash, pathname = pathname, queries = queries, search = search)
  
    __obj.asInstanceOf[State]
  }
}

