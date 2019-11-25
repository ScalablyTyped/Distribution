package typings.smoothDashScroll.smoothDashScrollMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clip: js.UndefOr[Boolean] = js.undefined
  var customEasing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.undefined
  var durationMax: js.UndefOr[Double | Null] = js.undefined
  var durationMin: js.UndefOr[Double | Null] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  // Custom Events
  var emitEvents: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  // Selectors
  var ignore: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[
    Double | (js.Function2[
      /* anchor */ js.UndefOr[Element | Double | Null], 
      /* toggle */ js.UndefOr[Element | Null], 
      Double
    ])
  ] = js.undefined
  var popstate: js.UndefOr[Boolean] = js.undefined
  // Speed & Easing
  var speed: js.UndefOr[Double] = js.undefined
  var speedAsDuration: js.UndefOr[Boolean] = js.undefined
  var topOnEmptyHash: js.UndefOr[Boolean] = js.undefined
  // History
  var updateURL: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clip: js.UndefOr[Boolean] = js.undefined,
    customEasing: /* time */ Double => Double = null,
    durationMax: Int | Double = null,
    durationMin: Int | Double = null,
    easing: Easing = null,
    emitEvents: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    ignore: String = null,
    offset: Double | (js.Function2[
      /* anchor */ js.UndefOr[Element | Double | Null], 
      /* toggle */ js.UndefOr[Element | Null], 
      Double
    ]) = null,
    popstate: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    speedAsDuration: js.UndefOr[Boolean] = js.undefined,
    topOnEmptyHash: js.UndefOr[Boolean] = js.undefined,
    updateURL: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (customEasing != null) __obj.updateDynamic("customEasing")(js.Any.fromFunction1(customEasing))
    if (durationMax != null) __obj.updateDynamic("durationMax")(durationMax.asInstanceOf[js.Any])
    if (durationMin != null) __obj.updateDynamic("durationMin")(durationMin.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(emitEvents)) __obj.updateDynamic("emitEvents")(emitEvents.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(popstate)) __obj.updateDynamic("popstate")(popstate.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(speedAsDuration)) __obj.updateDynamic("speedAsDuration")(speedAsDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(topOnEmptyHash)) __obj.updateDynamic("topOnEmptyHash")(topOnEmptyHash.asInstanceOf[js.Any])
    if (!js.isUndefined(updateURL)) __obj.updateDynamic("updateURL")(updateURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

