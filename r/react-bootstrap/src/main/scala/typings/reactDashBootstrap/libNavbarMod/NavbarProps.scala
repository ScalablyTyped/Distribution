package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarProps extends HTMLProps[Navbar] {
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
    HTMLProps: HTMLProps[Navbar] = null,
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

