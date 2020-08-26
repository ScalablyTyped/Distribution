package typings.reactRouterDom.mod

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.react.mod.CSSProperties
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavLinkProps[S] extends LinkProps[S] {
  var activeClassName: js.UndefOr[String] = js.native
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var isActive: js.UndefOr[js.Function2[/* match */ `match`[_] | Null, /* location */ Location[S], Boolean]] = js.native
  var location: js.UndefOr[Location[S]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object NavLinkProps {
  @scala.inline
  def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): NavLinkProps[S] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps[S]]
  }
  @scala.inline
  implicit class NavLinkPropsOps[Self <: NavLinkProps[_], S] (val x: Self with NavLinkProps[S]) extends AnyVal {
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
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    @scala.inline
    def setActiveStyle(value: CSSProperties): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setIsActive(value: (/* match */ `match`[_] | Null, /* location */ Location[S]) => Boolean): Self = this.set("isActive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setLocation(value: Location[S]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

