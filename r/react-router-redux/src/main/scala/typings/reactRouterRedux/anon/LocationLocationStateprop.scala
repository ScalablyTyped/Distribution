package typings.reactRouterRedux.anon

import typings.history.mod.Hash
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined history.history.Location<history.history.LocationState> & {  props ? :{  match  :{  path  :string,   url  :string,   params  :any,   isExact  :boolean},   location  :history.history.Location<history.history.LocationState>,   history  :history.history.History<history.history.LocationState>}} */
trait LocationLocationStateprop extends js.Object {
  var hash: Hash
  var key: js.UndefOr[LocationKey] = js.undefined
  var pathname: Pathname
  var props: js.UndefOr[History] = js.undefined
  var search: Search
  var state: LocationState
}

object LocationLocationStateprop {
  @scala.inline
  def apply(
    hash: Hash,
    pathname: Pathname,
    search: Search,
    key: LocationKey = null,
    props: History = null,
    state: js.UndefOr[Null | LocationState] = js.undefined
  ): LocationLocationStateprop = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLocationStateprop]
  }
}

