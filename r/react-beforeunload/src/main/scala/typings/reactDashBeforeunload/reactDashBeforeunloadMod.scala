package typings.reactDashBeforeunload

import typings.react.reactMod.FC
import typings.reactDashBeforeunload.reactDashBeforeunloadMod.UseBeforeunloadHandler
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-beforeunload", JSImport.Namespace)
@js.native
object reactDashBeforeunloadMod extends js.Object {
  val Beforeunload: FC[Anon_Children] = js.native
  def useBeforeunload(): Unit = js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}

