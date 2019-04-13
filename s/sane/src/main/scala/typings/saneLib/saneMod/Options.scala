package typings
package saneLib.saneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var fsevents: js.UndefOr[scala.Boolean] = js.undefined
  var glob: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ignored: js.UndefOr[AnymatchMatcher | js.Array[AnymatchMatcher]] = js.undefined
  var poll: js.UndefOr[scala.Boolean] = js.undefined
  var watcher: js.UndefOr[java.lang.String] = js.undefined
  var watchman: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    fsevents: js.UndefOr[scala.Boolean] = js.undefined,
    glob: java.lang.String | js.Array[java.lang.String] = null,
    ignored: AnymatchMatcher | js.Array[AnymatchMatcher] = null,
    poll: js.UndefOr[scala.Boolean] = js.undefined,
    watcher: java.lang.String = null,
    watchman: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(fsevents)) __obj.updateDynamic("fsevents")(fsevents)
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (!js.isUndefined(poll)) __obj.updateDynamic("poll")(poll)
    if (watcher != null) __obj.updateDynamic("watcher")(watcher)
    if (!js.isUndefined(watchman)) __obj.updateDynamic("watchman")(watchman)
    __obj.asInstanceOf[Options]
  }
}

