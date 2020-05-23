package typings.scrollbooster.anon

import typings.scrollbooster.mod.ScrollingState
import typings.scrollbooster.scrollboosterStrings.all
import typings.scrollbooster.scrollboosterStrings.horizontal
import typings.scrollbooster.scrollboosterStrings.mouse
import typings.scrollbooster.scrollboosterStrings.native
import typings.scrollbooster.scrollboosterStrings.touch
import typings.scrollbooster.scrollboosterStrings.transform
import typings.scrollbooster.scrollboosterStrings.vertical
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<scrollbooster.scrollbooster.ScrollBoosterOptions> */
trait PartialScrollBoosterOptio extends js.Object {
  var bounce: js.UndefOr[Boolean] = js.undefined
  var bounceForce: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[HTMLElement] = js.undefined
  var direction: js.UndefOr[horizontal | vertical | all] = js.undefined
  var emulateScroll: js.UndefOr[Boolean] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var inputsFocus: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.undefined
  var pointerMode: js.UndefOr[touch | mouse | all] = js.undefined
  var scrollMode: js.UndefOr[transform | native] = js.undefined
  var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Boolean]] = js.undefined
  var textSelection: js.UndefOr[Boolean] = js.undefined
  var viewport: js.UndefOr[HTMLElement] = js.undefined
}

object PartialScrollBoosterOptio {
  @scala.inline
  def apply(
    bounce: js.UndefOr[Boolean] = js.undefined,
    bounceForce: js.UndefOr[Double] = js.undefined,
    content: HTMLElement = null,
    direction: horizontal | vertical | all = null,
    emulateScroll: js.UndefOr[Boolean] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    inputsFocus: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* state */ ScrollingState, /* event */ Event) => Unit = null,
    onUpdate: /* state */ ScrollingState => Unit = null,
    pointerMode: touch | mouse | all = null,
    scrollMode: transform | native = null,
    shouldScroll: (/* state */ ScrollingState, /* event */ Event) => Boolean = null,
    textSelection: js.UndefOr[Boolean] = js.undefined,
    viewport: HTMLElement = null
  ): PartialScrollBoosterOptio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceForce)) __obj.updateDynamic("bounceForce")(bounceForce.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(emulateScroll)) __obj.updateDynamic("emulateScroll")(emulateScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputsFocus)) __obj.updateDynamic("inputsFocus")(inputsFocus.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (pointerMode != null) __obj.updateDynamic("pointerMode")(pointerMode.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (shouldScroll != null) __obj.updateDynamic("shouldScroll")(js.Any.fromFunction2(shouldScroll))
    if (!js.isUndefined(textSelection)) __obj.updateDynamic("textSelection")(textSelection.get.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollBoosterOptio]
  }
}

