package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiStrings.collapse
import typings.reactDashOnsenui.reactDashOnsenuiStrings.default
import typings.reactDashOnsenui.reactDashOnsenuiStrings.landscape
import typings.reactDashOnsenui.reactDashOnsenuiStrings.left
import typings.reactDashOnsenui.reactDashOnsenuiStrings.overlay
import typings.reactDashOnsenui.reactDashOnsenuiStrings.portrait
import typings.reactDashOnsenui.reactDashOnsenuiStrings.right
import typings.reactDashOnsenui.reactDashOnsenuiStrings.split
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  side ? :'left' | 'right',   collapse ? :'portrait' | 'landscape' | boolean,   isOpen ? :boolean,   onOpen ? :(e ? : std.Event): void,   onPreOpen ? :(e ? : std.Event): void,   onPreClose ? :(e ? : std.Event): void,   onModeChange ? :(e ? : std.Event): void,   onClose ? :(e ? : std.Event): void,   swipeable ? :boolean,   swipeTargetWidth ? :number,   width ? :number,   animation ? :'overlay' | 'default',   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   openThreshold ? :number,   mode ? :'collapse' | 'split'} */
trait HTMLAttributesidclassNamestylesideleftrightcollaps extends js.Object {
  var animation: js.UndefOr[overlay | default] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var collapse: js.UndefOr[portrait | landscape | Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[collapse | split] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  var onModeChange: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  var onPreClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  var onPreOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  var openThreshold: js.UndefOr[Double] = js.undefined
  var side: js.UndefOr[left | right] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swipeTargetWidth: js.UndefOr[Double] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object HTMLAttributesidclassNamestylesideleftrightcollaps {
  @scala.inline
  def apply(
    animation: overlay | default = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    collapse: portrait | landscape | Boolean = null,
    id: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mode: collapse | split = null,
    onClose: /* e */ js.UndefOr[Event] => Unit = null,
    onModeChange: /* e */ js.UndefOr[Event] => Unit = null,
    onOpen: /* e */ js.UndefOr[Event] => Unit = null,
    onPreClose: /* e */ js.UndefOr[Event] => Unit = null,
    onPreOpen: /* e */ js.UndefOr[Event] => Unit = null,
    openThreshold: Int | Double = null,
    side: left | right = null,
    style: CSSProperties = null,
    swipeTargetWidth: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): HTMLAttributesidclassNamestylesideleftrightcollaps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(js.Any.fromFunction1(onModeChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onPreClose != null) __obj.updateDynamic("onPreClose")(js.Any.fromFunction1(onPreClose))
    if (onPreOpen != null) __obj.updateDynamic("onPreOpen")(js.Any.fromFunction1(onPreOpen))
    if (openThreshold != null) __obj.updateDynamic("openThreshold")(openThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (swipeTargetWidth != null) __obj.updateDynamic("swipeTargetWidth")(swipeTargetWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNamestylesideleftrightcollaps]
  }
}

