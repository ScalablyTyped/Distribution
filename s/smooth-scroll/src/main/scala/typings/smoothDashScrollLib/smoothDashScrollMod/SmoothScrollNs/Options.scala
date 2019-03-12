package typings
package smoothDashScrollLib.smoothDashScrollMod.SmoothScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clip: js.UndefOr[scala.Boolean] = js.undefined
  var customEasing: js.UndefOr[js.Function1[/* time */ scala.Double, scala.Double]] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  // Custom Events
  var emitEvents: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  // Selectors
  var ignore: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[
    scala.Double | (js.Function2[
      /* anchor */ js.UndefOr[stdLib.Element | scala.Double | scala.Null], 
      /* toggle */ js.UndefOr[stdLib.Element | scala.Null], 
      scala.Double
    ])
  ] = js.undefined
  var popstate: js.UndefOr[scala.Boolean] = js.undefined
  // Speed & Easing
  var speed: js.UndefOr[scala.Double] = js.undefined
  var topOnEmptyHash: js.UndefOr[scala.Boolean] = js.undefined
  // History
  var updateURL: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clip: js.UndefOr[scala.Boolean] = js.undefined,
    customEasing: /* time */ scala.Double => scala.Double = null,
    easing: Easing = null,
    emitEvents: js.UndefOr[scala.Boolean] = js.undefined,
    header: java.lang.String = null,
    ignore: java.lang.String = null,
    offset: scala.Double | (js.Function2[
      /* anchor */ js.UndefOr[stdLib.Element | scala.Double | scala.Null], 
      /* toggle */ js.UndefOr[stdLib.Element | scala.Null], 
      scala.Double
    ]) = null,
    popstate: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    topOnEmptyHash: js.UndefOr[scala.Boolean] = js.undefined,
    updateURL: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (customEasing != null) __obj.updateDynamic("customEasing")(js.Any.fromFunction1(customEasing))
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(emitEvents)) __obj.updateDynamic("emitEvents")(emitEvents)
    if (header != null) __obj.updateDynamic("header")(header)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(popstate)) __obj.updateDynamic("popstate")(popstate)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(topOnEmptyHash)) __obj.updateDynamic("topOnEmptyHash")(topOnEmptyHash)
    if (!js.isUndefined(updateURL)) __obj.updateDynamic("updateURL")(updateURL)
    __obj.asInstanceOf[Options]
  }
}

