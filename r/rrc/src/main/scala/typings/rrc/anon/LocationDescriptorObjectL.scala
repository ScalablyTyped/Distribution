package typings.rrc.anon

import typings.history.mod.Hash
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined history.history.LocationDescriptorObject<history.history.LocationState> & {  pathname :history.history.Pathname} */
@js.native
trait LocationDescriptorObjectL extends js.Object {
  var hash: js.UndefOr[Hash] = js.native
  var key: js.UndefOr[LocationKey] = js.native
  var pathname: js.UndefOr[Pathname] with Pathname = js.native
  var search: js.UndefOr[Search] = js.native
  var state: js.UndefOr[LocationState] = js.native
}

object LocationDescriptorObjectL {
  @scala.inline
  def apply(pathname: js.UndefOr[Pathname] with Pathname): LocationDescriptorObjectL = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDescriptorObjectL]
  }
  @scala.inline
  implicit class LocationDescriptorObjectLOps[Self <: LocationDescriptorObjectL] (val x: Self) extends AnyVal {
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
    def setPathname(value: js.UndefOr[Pathname] with Pathname): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setKey(value: LocationKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setSearch(value: Search): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setState(value: LocationState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
  
}

