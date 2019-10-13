package typings.reactDashBootstrap.libNavItemMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemProps
  extends AllHTMLAttributes[NavItem]
     with ClassAttributes[NavItem] {
  var active: js.UndefOr[Boolean] = js.undefined
  var brand: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var defaultNavExpanded: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var fixedBottom: js.UndefOr[Boolean] = js.undefined
  var fixedTop: js.UndefOr[Boolean] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var linkId: js.UndefOr[String] = js.undefined
  var navExpanded: js.UndefOr[Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_NavItemProps: js.UndefOr[SelectCallback] = js.undefined
  var onToggle: js.UndefOr[js.Function] = js.undefined
  var staticTop: js.UndefOr[Boolean] = js.undefined
  var toggleButton: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var toggleNavKey: js.UndefOr[String | Double] = js.undefined
}

object NavItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[NavItem] = null,
    ClassAttributes: ClassAttributes[NavItem] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    brand: js.Any = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    componentClass: ReactType[_] = null,
    defaultNavExpanded: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    fixedBottom: js.UndefOr[Boolean] = js.undefined,
    fixedTop: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    linkId: String = null,
    navExpanded: js.UndefOr[Boolean] = js.undefined,
    onSelect: SelectCallback = null,
    onToggle: js.Function = null,
    staticTop: js.UndefOr[Boolean] = js.undefined,
    toggleButton: js.Any = null,
    toggleNavKey: String | Double = null
  ): NavItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
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

