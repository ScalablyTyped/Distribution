package typings.atStorybookComponents.distTypographyLinkLinkMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends LinkInnerProps
     with LinkStylesProps {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containsIcon: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    isButton: js.UndefOr[Boolean] = js.undefined,
    nochrome: js.UndefOr[Boolean] = js.undefined,
    onClick: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tertiary: js.UndefOr[Boolean] = js.undefined,
    withArrow: js.UndefOr[Boolean] = js.undefined
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

