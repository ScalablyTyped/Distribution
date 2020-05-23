package typings.reactBurgerMenu.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import typings.reactBurgerMenu.anon.PartialStyles
import typings.reactBurgerMenu.reactBurgerMenuBooleans.`false`
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
  var disableOverlayClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  var htmlClassName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemClassName: js.UndefOr[String] = js.undefined
  var itemListClassName: js.UndefOr[String] = js.undefined
  var menuClassName: js.UndefOr[String] = js.undefined
  var morphShapeClassName: js.UndefOr[String] = js.undefined
  var noOverlay: js.UndefOr[Boolean] = js.undefined
  var noTransition: js.UndefOr[Boolean] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
  var outerContainerId: js.UndefOr[String] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
  var pageWrapId: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[PartialStyles] = js.undefined
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
    disableOverlayClick: Boolean | js.Function0[Boolean] = null,
    htmlClassName: String = null,
    id: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemClassName: String = null,
    itemListClassName: String = null,
    menuClassName: String = null,
    morphShapeClassName: String = null,
    noOverlay: js.UndefOr[Boolean] = js.undefined,
    noTransition: js.UndefOr[Boolean] = js.undefined,
    onStateChange: /* state */ State => Unit = null,
    outerContainerId: String = null,
    overlayClassName: String = null,
    pageWrapId: String = null,
    right: js.UndefOr[Boolean] = js.undefined,
    styles: PartialStyles = null,
    width: Double | String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (burgerBarClassName != null) __obj.updateDynamic("burgerBarClassName")(burgerBarClassName.asInstanceOf[js.Any])
    if (burgerButtonClassName != null) __obj.updateDynamic("burgerButtonClassName")(burgerButtonClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossButtonClassName != null) __obj.updateDynamic("crossButtonClassName")(crossButtonClassName.asInstanceOf[js.Any])
    if (crossClassName != null) __obj.updateDynamic("crossClassName")(crossClassName.asInstanceOf[js.Any])
    if (customBurgerIcon != null) __obj.updateDynamic("customBurgerIcon")(customBurgerIcon.asInstanceOf[js.Any])
    if (customCrossIcon != null) __obj.updateDynamic("customCrossIcon")(customCrossIcon.asInstanceOf[js.Any])
    if (customOnKeyDown != null) __obj.updateDynamic("customOnKeyDown")(js.Any.fromFunction1(customOnKeyDown))
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc.get.asInstanceOf[js.Any])
    if (disableOverlayClick != null) __obj.updateDynamic("disableOverlayClick")(disableOverlayClick.asInstanceOf[js.Any])
    if (htmlClassName != null) __obj.updateDynamic("htmlClassName")(htmlClassName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName.asInstanceOf[js.Any])
    if (itemListClassName != null) __obj.updateDynamic("itemListClassName")(itemListClassName.asInstanceOf[js.Any])
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName.asInstanceOf[js.Any])
    if (morphShapeClassName != null) __obj.updateDynamic("morphShapeClassName")(morphShapeClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(noOverlay)) __obj.updateDynamic("noOverlay")(noOverlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noTransition)) __obj.updateDynamic("noTransition")(noTransition.get.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (outerContainerId != null) __obj.updateDynamic("outerContainerId")(outerContainerId.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (pageWrapId != null) __obj.updateDynamic("pageWrapId")(pageWrapId.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

