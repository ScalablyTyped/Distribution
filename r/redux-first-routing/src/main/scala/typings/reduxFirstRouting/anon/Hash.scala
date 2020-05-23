package typings.reduxFirstRouting.anon

import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends js.Object {
  var hash: H
  var pathname: P
  var queries: js.Any
  var search: S
}

object Hash {
  @scala.inline
  def apply[P, S, H](hash: H, pathname: P, queries: js.Any, search: S): Hash[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash[P, S, H]]
  }
}

