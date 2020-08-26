package typings.reactBootstrap.navbarMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarProps
  extends AllHTMLAttributes[Navbar]
     with ClassAttributes[Navbar] {
  var brand: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var collapseOnSelect: js.UndefOr[Boolean] = js.native
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  var defaultNavExpanded: js.UndefOr[Boolean] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var fixedBottom: js.UndefOr[Boolean] = js.native
  var fixedTop: js.UndefOr[Boolean] = js.native
  var fluid: js.UndefOr[Boolean] = js.native
  var inverse: js.UndefOr[Boolean] = js.native
  var onToggle: js.UndefOr[js.Function] = js.native
  var staticTop: js.UndefOr[Boolean] = js.native
  var toggleButton: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var toggleNavKey: js.UndefOr[String | Double] = js.native
}

object NavbarProps {
  @scala.inline
  def apply(): NavbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarProps]
  }
  @scala.inline
  implicit class NavbarPropsOps[Self <: NavbarProps] (val x: Self) extends AnyVal {
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
    def setBrand(value: js.Any): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    @scala.inline
    def setCollapseOnSelect(value: Boolean): Self = this.set("collapseOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseOnSelect: Self = this.set("collapseOnSelect", js.undefined)
    @scala.inline
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    @scala.inline
    def setDefaultNavExpanded(value: Boolean): Self = this.set("defaultNavExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNavExpanded: Self = this.set("defaultNavExpanded", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setFixedBottom(value: Boolean): Self = this.set("fixedBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedBottom: Self = this.set("fixedBottom", js.undefined)
    @scala.inline
    def setFixedTop(value: Boolean): Self = this.set("fixedTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedTop: Self = this.set("fixedTop", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setOnToggle(value: js.Function): Self = this.set("onToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setStaticTop(value: Boolean): Self = this.set("staticTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticTop: Self = this.set("staticTop", js.undefined)
    @scala.inline
    def setToggleButton(value: js.Any): Self = this.set("toggleButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleButton: Self = this.set("toggleButton", js.undefined)
    @scala.inline
    def setToggleNavKey(value: String | Double): Self = this.set("toggleNavKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleNavKey: Self = this.set("toggleNavKey", js.undefined)
  }
  
}

