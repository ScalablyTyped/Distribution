package typings.promiseAbortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Executor[T] = js.Function3[
    /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
    /* signal */ typings.promiseAbortable.mod.AbortSignal, 
    scala.Unit
  ]
}
