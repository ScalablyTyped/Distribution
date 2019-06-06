package typings
package atStorybookComponentsLib.distTypographyLinkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends LinkInnerProps
     with LinkStylesProps {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    containsIcon: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    isButton: js.UndefOr[scala.Boolean] = js.undefined,
    nochrome: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: /* e */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent] => scala.Unit = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    tertiary: js.UndefOr[scala.Boolean] = js.undefined,
    withArrow: js.UndefOr[scala.Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(containsIcon)) __obj.updateDynamic("containsIcon")(containsIcon)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton)
    if (!js.isUndefined(nochrome)) __obj.updateDynamic("nochrome")(nochrome)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary)
    if (!js.isUndefined(withArrow)) __obj.updateDynamic("withArrow")(withArrow)
    __obj.asInstanceOf[LinkProps]
  }
}

