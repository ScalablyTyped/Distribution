package typings.storybookComponents.linkMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps
  extends LinkInnerProps
     with LinkStylesProps {
  var cancel: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var href: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
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
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(containsIcon)) __obj.updateDynamic("containsIcon")(containsIcon.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nochrome)) __obj.updateDynamic("nochrome")(nochrome.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withArrow)) __obj.updateDynamic("withArrow")(withArrow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

