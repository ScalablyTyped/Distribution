package typings.reduxFirstRouting.anon

import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends js.Object {
  var hash: H = js.native
  var pathname: P = js.native
  var queries: js.Any = js.native
  var search: S = js.native
}

object Hash {
  @scala.inline
  def apply[/* <: typings.history.mod.Pathname */ P, /* <: typings.history.mod.Search */ S, /* <: typings.history.mod.Hash */ H](hash: H, pathname: P, queries: js.Any, search: S): Hash[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash[P, S, H]]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash[_, _, _], /* <: typings.history.mod.Pathname */ P, /* <: typings.history.mod.Search */ S, /* <: typings.history.mod.Hash */ H] (val x: Self with (Hash[P, S, H])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: H): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: P): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueries(value: js.Any): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: S): Self = this.set("search", value.asInstanceOf[js.Any])
  }
  
}

