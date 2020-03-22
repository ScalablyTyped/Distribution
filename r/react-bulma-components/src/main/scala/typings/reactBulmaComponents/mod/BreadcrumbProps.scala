package typings.reactBulmaComponents.mod

import typings.react.mod.ComponentType
import typings.reactBulmaComponents.AnonActive
import typings.reactBulmaComponents.AnonDesktop
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`1`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`2`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`3`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`4`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`5`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`6`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import typings.reactBulmaComponents.reactBulmaComponentsStrings.arrow
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bullet
import typings.reactBulmaComponents.reactBulmaComponentsStrings.capitalized
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.dot
import typings.reactBulmaComponents.reactBulmaComponentsStrings.justified
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.light
import typings.reactBulmaComponents.reactBulmaComponentsStrings.lowercase
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.semibold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import typings.reactBulmaComponents.reactBulmaComponentsStrings.succeeds
import typings.reactBulmaComponents.reactBulmaComponentsStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bulma-components.react-bulma-components.ModifierProps */
/* Inlined parent react-bulma-components.react-bulma-components.BreadcrumbModifierProps */
/* Inlined parent std.Partial<react-bulma-components.react-bulma-components.Omit<react.react.ComponentPropsWithoutRef<'a'>, 'unselectable'>> */
trait BreadcrumbProps extends js.Object {
  var align: js.UndefOr[right | center] = js.undefined
  var backgroundColor: js.UndefOr[Color | GreyColor] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hrefAttr: js.UndefOr[String] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[AnonActive]] = js.undefined
  var marginless: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[right | left] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var renderAs: js.UndefOr[a | ComponentType[_]] = js.undefined
  var responsive: js.UndefOr[AnonDesktop] = js.undefined
  var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var textAlignment: js.UndefOr[centered | justified | left | right] = js.undefined
  var textColor: js.UndefOr[Color | GreyColor] = js.undefined
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
  var textWeight: js.UndefOr[light | normal | semibold | bold] = js.undefined
  // https://github.com/couds/react-bulma-components/issues/112
  // unselectable?: "on" | "off";
  var unselectable: js.UndefOr[Boolean] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    align: right | center = null,
    backgroundColor: Color | GreyColor = null,
    className: String = null,
    clearfix: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hrefAttr: String = null,
    invisible: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[AnonActive] = null,
    marginless: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    pull: right | left = null,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    renderAs: a | ComponentType[_] = null,
    responsive: AnonDesktop = null,
    separator: arrow | bullet | dot | succeeds = null,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null,
    style: js.Object = null,
    textAlignment: centered | justified | left | right = null,
    textColor: Color | GreyColor = null,
    textSize: `1` | `2` | `3` | `4` | `5` | `6` = null,
    textTransform: capitalized | lowercase | uppercase = null,
    textWeight: light | normal | semibold | bold = null,
    unselectable: js.UndefOr[Boolean] = js.undefined
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hrefAttr != null) __obj.updateDynamic("hrefAttr")(hrefAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (textWeight != null) __obj.updateDynamic("textWeight")(textWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

