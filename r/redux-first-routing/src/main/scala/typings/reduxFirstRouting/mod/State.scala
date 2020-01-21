package typings.reduxFirstRouting.mod

import typings.history.mod.Hash
import typings.history.mod.Pathname
import typings.history.mod.Search
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
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

