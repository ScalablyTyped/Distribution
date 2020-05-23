package typings.reactBeforeunload

import typings.react.mod.FC
import typings.reactBeforeunload.anon.Children
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-beforeunload", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Beforeunload: FC[Children] = js.native
  def useBeforeunload(): Unit = js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}

