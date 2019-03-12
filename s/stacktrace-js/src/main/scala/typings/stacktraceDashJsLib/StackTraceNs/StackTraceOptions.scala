package typings
package stacktraceDashJsLib.StackTraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTraceOptions extends js.Object {
  var filter: js.UndefOr[js.Function1[/* stackFrame */ StackFrame, scala.Boolean]] = js.undefined
  var offline: js.UndefOr[scala.Boolean] = js.undefined
  var sourceCache: js.UndefOr[SourceCache] = js.undefined
}

object StackTraceOptions {
  @scala.inline
  def apply(
    filter: /* stackFrame */ StackFrame => scala.Boolean = null,
    offline: js.UndefOr[scala.Boolean] = js.undefined,
    sourceCache: SourceCache = null
  ): StackTraceOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(offline)) __obj.updateDynamic("offline")(offline)
    if (sourceCache != null) __obj.updateDynamic("sourceCache")(sourceCache)
    __obj.asInstanceOf[StackTraceOptions]
  }
}

