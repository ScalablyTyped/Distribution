package typings.reactRouterNavigation.mod

import typings.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps
  extends RouteProps
     with TabBarProps {
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var onReset: js.UndefOr[js.Function1[/* props */ TabBarProps with RouteProps, Unit]] = js.native
}

object TabProps {
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  @scala.inline
  implicit class TabPropsOps[Self <: TabProps] (val x: Self) extends AnyVal {
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
    def setOnIndexChange(value: /* index */ Double => Unit): Self = this.set("onIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIndexChange: Self = this.set("onIndexChange", js.undefined)
    @scala.inline
    def setOnReset(value: /* props */ TabBarProps with RouteProps => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
  }
  
}

