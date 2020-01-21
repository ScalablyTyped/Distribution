package typings.reactBeforeunload

import typings.react.mod.FC
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-beforeunload", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Beforeunload: FC[AnonChildren] = js.native
  def useBeforeunload(): Unit = js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event_, js.UndefOr[String | Unit]]
}

