package typings.promiseDashAbortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashAbortableMod {
  type Executor[T] = js.Function3[
    /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
    /* signal */ AbortSignal, 
    Unit
  ]
}
