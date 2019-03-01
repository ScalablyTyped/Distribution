package typings
package reactDashBootstrapLib.libNavbarMod.NavbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavbarMod.Navbar] {
  var brand: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var collapseOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultNavExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var fixedBottom: js.UndefOr[scala.Boolean] = js.undefined
  var fixedTop: js.UndefOr[scala.Boolean] = js.undefined
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var onToggle: js.UndefOr[js.Function] = js.undefined
  var staticTop: js.UndefOr[scala.Boolean] = js.undefined
  var toggleButton: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var toggleNavKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object NavbarProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavbarMod.Navbar] = null,
    brand: js.Any = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    collapseOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    defaultNavExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    fixedBottom: js.UndefOr[scala.Boolean] = js.undefined,
    fixedTop: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    onToggle: js.Function = null,
    staticTop: js.UndefOr[scala.Boolean] = js.undefined,
    toggleButton: js.Any = null,
    toggleNavKey: java.lang.String | scala.Double = null
  ): NavbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (!js.isUndefined(collapseOnSelect)) __obj.updateDynamic("collapseOnSelect")(collapseOnSelect)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNavExpanded)) __obj.updateDynamic("defaultNavExpanded")(defaultNavExpanded)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (!js.isUndefined(fixedBottom)) __obj.updateDynamic("fixedBottom")(fixedBottom)
    if (!js.isUndefined(fixedTop)) __obj.updateDynamic("fixedTop")(fixedTop)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle)
    if (!js.isUndefined(staticTop)) __obj.updateDynamic("staticTop")(staticTop)
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton)
    if (toggleNavKey != null) __obj.updateDynamic("toggleNavKey")(toggleNavKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarProps]
  }
}

