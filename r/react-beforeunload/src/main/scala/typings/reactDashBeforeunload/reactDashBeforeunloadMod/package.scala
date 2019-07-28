package typings.reactDashBeforeunload

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBeforeunloadMod {
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}
