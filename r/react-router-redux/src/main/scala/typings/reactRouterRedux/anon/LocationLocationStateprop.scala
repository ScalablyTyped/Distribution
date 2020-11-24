package typings.reactRouterRedux.anon

import typings.history.mod.Hash
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined history.history.Location<history.history.LocationState> & {  props :{  match :{  path :string,   url :string,   params :any,   isExact :boolean},   location :history.history.Location<history.history.LocationState>,   history :history.history.History<history.history.LocationState>} | undefined} */
@js.native
trait LocationLocationStateprop extends js.Object {
  
  var hash: Hash = js.native
  
  var key: js.UndefOr[LocationKey] = js.native
  
  var pathname: Pathname = js.native
  
  var props: js.UndefOr[History] = js.native
  
  var search: Search = js.native
  
  var state: LocationState = js.native
}
object LocationLocationStateprop {
  
  @scala.inline
  def apply(hash: Hash, pathname: Pathname, search: Search, state: LocationState): LocationLocationStateprop = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLocationStateprop]
  }
  
  @scala.inline
  implicit class LocationLocationStatepropOps[Self <: LocationLocationStateprop] (val x: Self) extends AnyVal {
    
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
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: Pathname): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: Search): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: LocationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: LocationKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setProps(value: History): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
