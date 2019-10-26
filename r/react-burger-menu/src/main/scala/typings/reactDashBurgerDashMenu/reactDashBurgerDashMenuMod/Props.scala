package typings.reactDashBurgerDashMenu.reactDashBurgerDashMenuMod

import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashBurgerDashMenu.reactDashBurgerDashMenuNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bodyClassName: js.UndefOr[String] = js.undefined
  var burgerBarClassName: js.UndefOr[String] = js.undefined
  var burgerButtonClassName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var crossButtonClassName: js.UndefOr[String] = js.undefined
  var crossClassName: js.UndefOr[String] = js.undefined
  var customBurgerIcon: js.UndefOr[Element | `false`] = js.undefined
  var customCrossIcon: js.UndefOr[Element | `false`] = js.undefined
  var customOnKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]] = js.undefined
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined
  var disableOverlayClick: js.UndefOr[Boolean] = js.undefined
  var htmlClassName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemClassName: js.UndefOr[String] = js.undefined
  var itemListClassName: js.UndefOr[String] = js.undefined
  var menuClassName: js.UndefOr[String] = js.undefined
  var morphShapeClassName: js.UndefOr[String] = js.undefined
  var noOverlay: js.UndefOr[Boolean] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
  var outerContainerId: js.UndefOr[String] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
  var pageWrapId: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[Styles] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    bodyClassName: String = null,
    burgerBarClassName: String = null,
    burgerButtonClassName: String = null,
    className: String = null,
    crossButtonClassName: String = null,
    crossClassName: String = null,
    customBurgerIcon: Element | `false` = null,
    customCrossIcon: Element | `false` = null,
    customOnKeyDown: /* event */ KeyboardEvent[typings.std.Element] => Unit = null,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClick: js.UndefOr[Boolean] = js.undefined,
    htmlClassName: String = null,
    id: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemClassName: String = null,
    itemListClassName: String = null,
    menuClassName: String = null,
    morphShapeClassName: String = null,
    noOverlay: js.UndefOr[Boolean] = js.undefined,
    onStateChange: /* state */ State => Unit = null,
    outerContainerId: String = null,
    overlayClassName: String = null,
    pageWrapId: String = null,
    right: js.UndefOr[Boolean] = js.undefined,
    styles: Styles = null,
    width: Double | String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (burgerBarClassName != null) __obj.updateDynamic("burgerBarClassName")(burgerBarClassName)
    if (burgerButtonClassName != null) __obj.updateDynamic("burgerButtonClassName")(burgerButtonClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossButtonClassName != null) __obj.updateDynamic("crossButtonClassName")(crossButtonClassName)
    if (crossClassName != null) __obj.updateDynamic("crossClassName")(crossClassName)
    if (customBurgerIcon != null) __obj.updateDynamic("customBurgerIcon")(customBurgerIcon.asInstanceOf[js.Any])
    if (customCrossIcon != null) __obj.updateDynamic("customCrossIcon")(customCrossIcon.asInstanceOf[js.Any])
    if (customOnKeyDown != null) __obj.updateDynamic("customOnKeyDown")(js.Any.fromFunction1(customOnKeyDown))
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc)
    if (!js.isUndefined(disableOverlayClick)) __obj.updateDynamic("disableOverlayClick")(disableOverlayClick)
    if (htmlClassName != null) __obj.updateDynamic("htmlClassName")(htmlClassName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName)
    if (itemListClassName != null) __obj.updateDynamic("itemListClassName")(itemListClassName)
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName)
    if (morphShapeClassName != null) __obj.updateDynamic("morphShapeClassName")(morphShapeClassName)
    if (!js.isUndefined(noOverlay)) __obj.updateDynamic("noOverlay")(noOverlay)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (outerContainerId != null) __obj.updateDynamic("outerContainerId")(outerContainerId)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (pageWrapId != null) __obj.updateDynamic("pageWrapId")(pageWrapId)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

