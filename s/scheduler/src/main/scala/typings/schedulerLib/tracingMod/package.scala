package typings
package schedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracingMod {
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Nothing
    - schedulerLib.schedulerLibNumbers.`true`
    - schedulerLib.schedulerLibNumbers.`false`
  */
  type EnableSchedulerTracing = js.UndefOr[_EnableSchedulerTracing]
  type IfSchedulerTracing[WhenTrue, WhenFalse] = TypeByBuildFlag[EnableSchedulerTracing, WhenTrue, WhenFalse]
  type TypeByBuildFlag[Flag /* <: js.UndefOr[scala.Boolean] */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with schedulerLib.Anon_Cancel
}
