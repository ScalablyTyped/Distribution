package typings.reduxFirstRouting.anon

import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pathname[P /* <: typings.history.mod.Pathname */, S /* <: Search */, H /* <: typings.history.mod.Hash */] extends js.Object {
  var hash: H
  var pathname: P
  var search: S
}

object Pathname {
  @scala.inline
  def apply[P, S, H](hash: H, pathname: P, search: S): Pathname[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname[P, S, H]]
  }
}

