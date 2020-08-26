package typings.reactBootstrap.navMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavProps
  extends AllHTMLAttributes[Nav]
     with ClassAttributes[Nav] {
  // Optional
  var activeHref: js.UndefOr[String] = js.native
  var activeKey: js.UndefOr[js.Any] = js.native
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var eventKey: js.UndefOr[js.Any] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var justified: js.UndefOr[Boolean] = js.native
  var navbar: js.UndefOr[Boolean] = js.native
  var pullRight: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[Boolean] = js.native
  var stacked: js.UndefOr[Boolean] = js.native
  var ulClassName: js.UndefOr[String] = js.native
  var ulId: js.UndefOr[String] = js.native
}

object NavProps {
  @scala.inline
  def apply(): NavProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavProps]
  }
  @scala.inline
  implicit class NavPropsOps[Self <: NavProps] (val x: Self) extends AnyVal {
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
    def setActiveHref(value: String): Self = this.set("activeHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveHref: Self = this.set("activeHref", js.undefined)
    @scala.inline
    def setActiveKey(value: js.Any): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setJustified(value: Boolean): Self = this.set("justified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustified: Self = this.set("justified", js.undefined)
    @scala.inline
    def setNavbar(value: Boolean): Self = this.set("navbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
    @scala.inline
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    @scala.inline
    def setUlClassName(value: String): Self = this.set("ulClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUlClassName: Self = this.set("ulClassName", js.undefined)
    @scala.inline
    def setUlId(value: String): Self = this.set("ulId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUlId: Self = this.set("ulId", js.undefined)
  }
  
}

