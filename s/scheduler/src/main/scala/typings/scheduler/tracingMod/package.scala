package typings.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracingMod {
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - typings.scheduler.schedulerBooleans.`true`
    - typings.scheduler.schedulerBooleans.`false`
  */
  type EnableSchedulerTracing = js.UndefOr[typings.scheduler.tracingMod._EnableSchedulerTracing]
  type IfSchedulerTracing[WhenTrue, WhenFalse] = typings.scheduler.tracingMod.TypeByBuildFlag[typings.scheduler.tracingMod.EnableSchedulerTracing, WhenTrue, WhenFalse]
  type TypeByBuildFlag[Flag /* <: js.UndefOr[scala.Boolean] */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with typings.scheduler.anon.Cancel
}
