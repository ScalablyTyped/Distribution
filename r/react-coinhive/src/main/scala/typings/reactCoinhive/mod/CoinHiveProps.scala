package typings.reactCoinhive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoinHiveProps extends js.Object {
  var autoThreads: js.UndefOr[Boolean] = js.undefined
  var onInit: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* callback */ js.Any, Unit]] = js.undefined
  var run: js.UndefOr[Boolean] = js.undefined
  var siteKey: String
  var src: js.UndefOr[String] = js.undefined
  var threads: js.UndefOr[Double] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
  var userName: js.UndefOr[String] = js.undefined
}

object CoinHiveProps {
  @scala.inline
  def apply(
    siteKey: String,
    autoThreads: js.UndefOr[Boolean] = js.undefined,
    onInit: /* callback */ js.Any => Unit = null,
    onStart: /* callback */ js.Any => Unit = null,
    onStop: /* callback */ js.Any => Unit = null,
    run: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    threads: Int | Double = null,
    throttle: Int | Double = null,
    userName: String = null
  ): CoinHiveProps = {
    val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
    if (!js.isUndefined(autoThreads)) __obj.updateDynamic("autoThreads")(autoThreads.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinHiveProps]
  }
}

