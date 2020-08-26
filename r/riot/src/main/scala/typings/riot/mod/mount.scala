package typings.riot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "mount")
@js.native
object mount extends js.Object {
  def apply[Props, State](selector: String): js.Array[RiotComponent[Props, State]] = js.native
  def apply[Props, State](selector: String, initialProps: Props): js.Array[RiotComponent[Props, State]] = js.native
  def apply[Props, State](selector: String, initialProps: Props, componentName: String): js.Array[RiotComponent[Props, State]] = js.native
  def apply[Props, State](selector: String, initialProps: js.UndefOr[scala.Nothing], componentName: String): js.Array[RiotComponent[Props, State]] = js.native
}

