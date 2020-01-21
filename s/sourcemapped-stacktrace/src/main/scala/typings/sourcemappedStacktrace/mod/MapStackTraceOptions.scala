package typings.sourcemappedStacktrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStackTraceOptions extends js.Object {
  /** Whether to cache sourcemaps globally across multiple calls. */
  var cacheGlobally: js.UndefOr[Boolean] = js.undefined
  /** Filter function applied to each stackTrace line. Lines which do not pass the filter won't be processesd. */
  var filter: js.UndefOr[js.Function1[/* line */ String, Boolean]] = js.undefined
  /** Whether to use synchronous ajax to load the sourcemaps. */
  var sync: js.UndefOr[Boolean] = js.undefined
}

object MapStackTraceOptions {
  @scala.inline
  def apply(
    cacheGlobally: js.UndefOr[Boolean] = js.undefined,
    filter: /* line */ String => Boolean = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): MapStackTraceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheGlobally)) __obj.updateDynamic("cacheGlobally")(cacheGlobally.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStackTraceOptions]
  }
}

