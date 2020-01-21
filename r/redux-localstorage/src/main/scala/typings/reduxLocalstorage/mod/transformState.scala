package typings.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-localstorage", "transformState")
@js.native
object transformState extends js.Object {
  def apply[A1, A2](down: js.Array[js.Function1[/* state */ _, _]], up: js.Array[js.Function1[/* state */ _, _]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  def apply[A1, A2](down: js.Array[js.Function1[/* state */ _, _]], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  def apply[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Array[js.Function1[/* state */ _, _]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  def apply[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
}

