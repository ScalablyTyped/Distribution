package typings
package reactDashBootstrapLib.libNavItemMod.NavItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavItemMod.NavItem] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var brand: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultNavExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var fixedBottom: js.UndefOr[scala.Boolean] = js.undefined
  var fixedTop: js.UndefOr[scala.Boolean] = js.undefined
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var linkId: js.UndefOr[java.lang.String] = js.undefined
  var navExpanded: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_NavItemProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  var onToggle: js.UndefOr[js.Function] = js.undefined
  var staticTop: js.UndefOr[scala.Boolean] = js.undefined
  var toggleButton: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var toggleNavKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object NavItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavItemMod.NavItem] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    brand: js.Any = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    defaultNavExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    fixedBottom: js.UndefOr[scala.Boolean] = js.undefined,
    fixedTop: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    linkId: java.lang.String = null,
    navExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    onToggle: js.Function = null,
    staticTop: js.UndefOr[scala.Boolean] = js.undefined,
    toggleButton: js.Any = null,
    toggleNavKey: java.lang.String | scala.Double = null
  ): NavItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNavExpanded)) __obj.updateDynamic("defaultNavExpanded")(defaultNavExpanded)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(fixedBottom)) __obj.updateDynamic("fixedBottom")(fixedBottom)
    if (!js.isUndefined(fixedTop)) __obj.updateDynamic("fixedTop")(fixedTop)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (linkId != null) __obj.updateDynamic("linkId")(linkId)
    if (!js.isUndefined(navExpanded)) __obj.updateDynamic("navExpanded")(navExpanded)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle)
    if (!js.isUndefined(staticTop)) __obj.updateDynamic("staticTop")(staticTop)
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton)
    if (toggleNavKey != null) __obj.updateDynamic("toggleNavKey")(toggleNavKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemProps]
  }
}

