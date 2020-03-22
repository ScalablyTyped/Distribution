package typings.reactBulmaComponents.mod

import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactBulmaComponents.AnonDesktop
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`1`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`2`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`3`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`4`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`5`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`6`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import typings.reactBulmaComponents.reactBulmaComponentsStrings.active
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.button
import typings.reactBulmaComponents.reactBulmaComponentsStrings.capitalized
import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.focus
import typings.reactBulmaComponents.reactBulmaComponentsStrings.hover
import typings.reactBulmaComponents.reactBulmaComponentsStrings.justified
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.light
import typings.reactBulmaComponents.reactBulmaComponentsStrings.loading
import typings.reactBulmaComponents.reactBulmaComponentsStrings.lowercase
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.semibold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import typings.reactBulmaComponents.reactBulmaComponentsStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bulma-components.react-bulma-components.ModifierProps */
/* Inlined parent react-bulma-components.react-bulma-components.ButtonModifierProps */
/* Inlined parent std.Partial<react-bulma-components.react-bulma-components.Omit<react.react.ComponentPropsWithoutRef<'a' | 'button' | 'span'>, 'color' | 'unselectable'>> */
trait ButtonProps extends js.Object {
  var backgroundColor: js.UndefOr[Color | GreyColor] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var isStatic: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var marginless: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var outlined: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[right | left] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var renderAs: js.UndefOr[a | button | span | ComponentType[_]] = js.undefined
  var reset: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[AnonDesktop] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var state: js.UndefOr[hover | focus | active | loading] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var submit: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[Boolean] = js.undefined
  var textAlignment: js.UndefOr[centered | justified | left | right] = js.undefined
  var textColor: js.UndefOr[Color | GreyColor] = js.undefined
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
  var textWeight: js.UndefOr[light | normal | semibold | bold] = js.undefined
  // https://github.com/couds/react-bulma-components/issues/112
  // unselectable?: "on" | "off";
  var unselectable: js.UndefOr[Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    backgroundColor: Color | GreyColor = null,
    children: ReactNode = null,
    className: String = null,
    clearfix: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    marginless: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    outlined: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    pull: right | left = null,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    renderAs: a | button | span | ComponentType[_] = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    responsive: AnonDesktop = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null,
    state: hover | focus | active | loading = null,
    style: js.Object = null,
    submit: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    textAlignment: centered | justified | left | right = null,
    textColor: Color | GreyColor = null,
    textSize: `1` | `2` | `3` | `4` | `5` | `6` = null,
    textTransform: capitalized | lowercase | uppercase = null,
    textWeight: light | normal | semibold | bold = null,
    unselectable: js.UndefOr[Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(outlined)) __obj.updateDynamic("outlined")(outlined.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(submit)) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (textWeight != null) __obj.updateDynamic("textWeight")(textWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

