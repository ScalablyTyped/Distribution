package typings.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/internal/useCollector", JSImport.Namespace)
@js.native
object useCollectorMod extends js.Object {
  def useCollector[T, S](monitor: T, collect: js.Function1[/* monitor */ T, S]): js.Tuple2[S, js.Function0[Unit]] = js.native
  def useCollector[T, S](monitor: T, collect: js.Function1[/* monitor */ T, S], onUpdate: js.Function0[Unit]): js.Tuple2[S, js.Function0[Unit]] = js.native
}

