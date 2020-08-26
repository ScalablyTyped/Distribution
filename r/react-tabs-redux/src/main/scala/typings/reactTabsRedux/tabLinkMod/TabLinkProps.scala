package typings.reactTabsRedux.tabLinkMod

import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabLinkProps extends js.Object {
  var activeClassName: js.UndefOr[String] = js.native
  var activeStyle: js.UndefOr[js.Object] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var component: js.UndefOr[String] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var disableInlineStyles: js.UndefOr[Boolean] = js.native
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.native
  var isActive: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var to: Double | String = js.native
}

object TabLinkProps {
  @scala.inline
  def apply(to: Double | String): TabLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabLinkProps]
  }
  @scala.inline
  implicit class TabLinkPropsOps[Self <: TabLinkProps] (val x: Self) extends AnyVal {
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
    def setTo(value: Double | String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    @scala.inline
    def setActiveStyle(value: js.Object): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDisableInlineStyles(value: Boolean): Self = this.set("disableInlineStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableInlineStyles: Self = this.set("disableInlineStyles", js.undefined)
    @scala.inline
    def setHandleSelect(value: (/* tab */ String, /* name */ String) => Unit): Self = this.set("handleSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleSelect: Self = this.set("handleSelect", js.undefined)
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

