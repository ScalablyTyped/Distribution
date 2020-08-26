package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nav extends js.Object {
  var nav: NavigationState | Null = js.native
}

object Nav {
  @scala.inline
  def apply(): Nav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nav]
  }
  @scala.inline
  implicit class NavOps[Self <: Nav] (val x: Self) extends AnyVal {
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
    def setNav(value: NavigationState): Self = this.set("nav", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavNull: Self = this.set("nav", null)
  }
  
}

