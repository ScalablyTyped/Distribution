package typings.reduxDashFirstDashRouting

import typings.history.historyMod.Hash
import typings.history.historyMod.Pathname
import typings.history.historyMod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashPathname[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends js.Object {
  var hash: H
  var pathname: P
  var search: S
}

object Anon_HashPathname {
  @scala.inline
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](hash: H, pathname: P, search: S): Anon_HashPathname[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HashPathname[P, S, H]]
  }
}

