package typings.scrollbooster.mod

import typings.scrollbooster.scrollboosterStrings.all
import typings.scrollbooster.scrollboosterStrings.horizontal
import typings.scrollbooster.scrollboosterStrings.mouse
import typings.scrollbooster.scrollboosterStrings.native
import typings.scrollbooster.scrollboosterStrings.touch
import typings.scrollbooster.scrollboosterStrings.transform
import typings.scrollbooster.scrollboosterStrings.vertical
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBoosterOptions extends js.Object {
  var bounce: js.UndefOr[Boolean] = js.undefined
  var bounceForce: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[HTMLElement | Null] = js.undefined
  var direction: js.UndefOr[horizontal | vertical | all] = js.undefined
  var emulateScroll: js.UndefOr[Boolean] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var inputsFocus: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event_, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.undefined
  var pointerMode: js.UndefOr[touch | mouse | all] = js.undefined
  var scrollMode: js.UndefOr[transform | native] = js.undefined
  var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event_, Boolean]] = js.undefined
  var textSelection: js.UndefOr[Boolean] = js.undefined
  var viewport: HTMLElement | Null
}

object ScrollBoosterOptions {
  @scala.inline
  def apply(
    bounce: js.UndefOr[Boolean] = js.undefined,
    bounceForce: Int | Double = null,
    content: HTMLElement = null,
    direction: horizontal | vertical | all = null,
    emulateScroll: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    inputsFocus: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* state */ ScrollingState, /* event */ Event_) => Unit = null,
    onUpdate: /* state */ ScrollingState => Unit = null,
    pointerMode: touch | mouse | all = null,
    scrollMode: transform | native = null,
    shouldScroll: (/* state */ ScrollingState, /* event */ Event_) => Boolean = null,
    textSelection: js.UndefOr[Boolean] = js.undefined,
    viewport: HTMLElement = null
  ): ScrollBoosterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (bounceForce != null) __obj.updateDynamic("bounceForce")(bounceForce.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(emulateScroll)) __obj.updateDynamic("emulateScroll")(emulateScroll.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (!js.isUndefined(inputsFocus)) __obj.updateDynamic("inputsFocus")(inputsFocus.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (pointerMode != null) __obj.updateDynamic("pointerMode")(pointerMode.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (shouldScroll != null) __obj.updateDynamic("shouldScroll")(js.Any.fromFunction2(shouldScroll))
    if (!js.isUndefined(textSelection)) __obj.updateDynamic("textSelection")(textSelection.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBoosterOptions]
  }
}

