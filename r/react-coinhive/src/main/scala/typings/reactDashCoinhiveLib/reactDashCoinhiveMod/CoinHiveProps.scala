package typings
package reactDashCoinhiveLib.reactDashCoinhiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoinHiveProps extends js.Object {
  var autoThreads: js.UndefOr[scala.Boolean] = js.undefined
  var onInit: js.UndefOr[js.Function1[/* callback */ js.Any, scala.Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* callback */ js.Any, scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* callback */ js.Any, scala.Unit]] = js.undefined
  var run: js.UndefOr[scala.Boolean] = js.undefined
  var siteKey: java.lang.String
  var src: js.UndefOr[java.lang.String] = js.undefined
  var threads: js.UndefOr[scala.Double] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object CoinHiveProps {
  @scala.inline
  def apply(
    siteKey: java.lang.String,
    autoThreads: js.UndefOr[scala.Boolean] = js.undefined,
    onInit: js.Function1[/* callback */ js.Any, scala.Unit] = null,
    onStart: js.Function1[/* callback */ js.Any, scala.Unit] = null,
    onStop: js.Function1[/* callback */ js.Any, scala.Unit] = null,
    run: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    threads: scala.Int | scala.Double = null,
    throttle: scala.Int | scala.Double = null,
    userName: java.lang.String = null
  ): CoinHiveProps = {
    val __obj = js.Dynamic.literal(siteKey = siteKey)
    if (!js.isUndefined(autoThreads)) __obj.updateDynamic("autoThreads")(autoThreads)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onStop != null) __obj.updateDynamic("onStop")(onStop)
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run)
    if (src != null) __obj.updateDynamic("src")(src)
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[CoinHiveProps]
  }
}

