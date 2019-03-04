package typings
package reduxDashFirstDashRoutingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashPathname[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */] extends js.Object {
  var hash: H
  var pathname: P
  var search: S
}

object Anon_HashPathname {
  @scala.inline
  def apply[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */](hash: H, pathname: P, search: S): Anon_HashPathname[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HashPathname[P, S, H]]
  }
}

