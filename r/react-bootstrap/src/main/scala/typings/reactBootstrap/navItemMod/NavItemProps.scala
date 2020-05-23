package typings.reactBootstrap.navItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.Sizes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNavExpanded)) __obj.updateDynamic("defaultNavExpanded")(defaultNavExpanded.get.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedBottom)) __obj.updateDynamic("fixedBottom")(fixedBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedTop)) __obj.updateDynamic("fixedTop")(fixedTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (linkId != null) __obj.updateDynamic("linkId")(linkId.asInstanceOf[js.Any])
    if (!js.isUndefined(navExpanded)) __obj.updateDynamic("navExpanded")(navExpanded.get.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(staticTop)) __obj.updateDynamic("staticTop")(staticTop.get.asInstanceOf[js.Any])
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton.asInstanceOf[js.Any])
    if (toggleNavKey != null) __obj.updateDynamic("toggleNavKey")(toggleNavKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemProps]
  }
}

