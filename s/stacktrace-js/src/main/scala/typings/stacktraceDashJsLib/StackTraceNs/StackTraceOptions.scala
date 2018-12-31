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

