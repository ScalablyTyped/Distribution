package typings.rrc.anon

import typings.history.mod.Hash
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined history.history.LocationDescriptorObject<history.history.LocationState> & {  pathname  :history.history.Pathname} */
trait LocationDescriptorObjectL extends js.Object {
  var hash: js.UndefOr[Hash] = js.undefined
  var key: js.UndefOr[LocationKey] = js.undefined
  var pathname: js.UndefOr[Pathname] = js.undefined
  var search: js.UndefOr[Search] = js.undefined
  var state: js.UndefOr[LocationState] = js.undefined
}

object LocationDescriptorObjectL {
  @scala.inline
  def apply(
    hash: Hash = null,
    key: LocationKey = null,
    pathname: Pathname = null,
    search: Search = null,
    state: js.UndefOr[Null | LocationState] = js.undefined
  ): LocationDescriptorObjectL = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDescriptorObjectL]
  }
}

