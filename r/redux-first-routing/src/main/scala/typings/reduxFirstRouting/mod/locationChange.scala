package typings.reduxFirstRouting.mod

import typings.history.mod.Hash
import typings.history.mod.Pathname
import typings.history.mod.Search
import typings.reduxFirstRouting.AnonHashPathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "locationChange")
@js.native
object locationChange extends js.Object {
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](_underscore: AnonHashPathname[P, S, H]): locationChangeAction[P, S, H] = js.native
}

