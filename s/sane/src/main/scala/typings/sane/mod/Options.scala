package typings.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dot: js.UndefOr[Boolean] = js.undefined
  var fsevents: js.UndefOr[Boolean] = js.undefined
  var glob: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignored: js.UndefOr[AnymatchMatcher | js.Array[AnymatchMatcher]] = js.undefined
  var poll: js.UndefOr[Boolean] = js.undefined
  var watcher: js.UndefOr[String] = js.undefined
  var watchman: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dot: js.UndefOr[Boolean] = js.undefined,
    fsevents: js.UndefOr[Boolean] = js.undefined,
    glob: String | js.Array[String] = null,
    ignored: AnymatchMatcher | js.Array[AnymatchMatcher] = null,
    poll: js.UndefOr[Boolean] = js.undefined,
    watcher: String = null,
    watchman: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fsevents)) __obj.updateDynamic("fsevents")(fsevents.get.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (!js.isUndefined(poll)) __obj.updateDynamic("poll")(poll.get.asInstanceOf[js.Any])
    if (watcher != null) __obj.updateDynamic("watcher")(watcher.asInstanceOf[js.Any])
    if (!js.isUndefined(watchman)) __obj.updateDynamic("watchman")(watchman.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

