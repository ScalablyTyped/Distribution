package typings.reduxFirstRouting

import typings.history.mod.Hash
import typings.history.mod.Pathname
import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends js.Object {
  var hash: H
  var pathname: P
  var queries: js.Any
  var search: S
}

object AnonHash {
  @scala.inline
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](hash: H, pathname: P, queries: js.Any, search: S): AnonHash[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash[P, S, H]]
  }
}

