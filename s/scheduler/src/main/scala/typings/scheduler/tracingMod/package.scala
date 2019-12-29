package typings.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracingMod {
  import typings.scheduler.Anon_Cancel

  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typings.scheduler.schedulerBooleans.`true`
    - typings.scheduler.schedulerBooleans.`false`
  */
  type EnableSchedulerTracing = js.UndefOr[_EnableSchedulerTracing]
  type IfSchedulerTracing[WhenTrue, WhenFalse] = TypeByBuildFlag[EnableSchedulerTracing, WhenTrue, WhenFalse]
  type TypeByBuildFlag[Flag /* <: js.UndefOr[Boolean] */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with Anon_Cancel
}
