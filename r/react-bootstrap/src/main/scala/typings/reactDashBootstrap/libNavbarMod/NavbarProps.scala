package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarProps
  extends AllHTMLAttributes[Navbar]
     with ClassAttributes[Navbar] {
  var brand: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var collapseOnSelect: js.UndefOr[Boolean] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var defaultNavExpanded: js.UndefOr[Boolean] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var fixedBottom: js.UndefOr[Boolean] = js.undefined
  var fixedTop: js.UndefOr[Boolean] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var onToggle: js.UndefOr[js.Function] = js.undefined
  var staticTop: js.UndefOr[Boolean] = js.undefined
  var toggleButton: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var toggleNavKey: js.UndefOr[String | Double] = js.undefined
}

object NavbarProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Navbar] = null,
    ClassAttributes: ClassAttributes[Navbar] = null,
    brand: js.Any = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    collapseOnSelect: js.UndefOr[Boolean] = js.undefined,
    componentClass: ReactType[_] = null,
    defaultNavExpanded: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    fixedBottom: js.UndefOr[Boolean] = js.undefined,
    fixedTop: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    onToggle: js.Function = null,
    staticTop: js.UndefOr[Boolean] = js.undefined,
    toggleButton: js.Any = null,
    toggleNavKey: String | Double = null
  ): NavbarProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnSelect)) __obj.updateDynamic("collapseOnSelect")(collapseOnSelect.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNavExpanded)) __obj.updateDynamic("defaultNavExpanded")(defaultNavExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedBottom)) __obj.updateDynamic("fixedBottom")(fixedBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedTop)) __obj.updateDynamic("fixedTop")(fixedTop.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(staticTop)) __obj.updateDynamic("staticTop")(staticTop.asInstanceOf[js.Any])
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton.asInstanceOf[js.Any])
    if (toggleNavKey != null) __obj.updateDynamic("toggleNavKey")(toggleNavKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarProps]
  }
}

